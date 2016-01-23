package com.schoolcloud.schoolshop.dao.base.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.dao.base.DAO;
import com.schoolcloud.schoolshop.utils.GenericsUtils;
public abstract  class DAOSuport<T> implements DAO<T> {
@SuppressWarnings("unchecked")
protected Class<T> entityClass = GenericsUtils.getSuperClassGenricType(this.getClass());
@PersistenceContext
protected EntityManager em;

@Override
public void save(T enity) {
	em.persist(enity);
}
@Override
public void update(T entity) {
	em.merge(entity);
}
@Override
public  void delete(Serializable id){
	em.remove(em.find(entityClass, id));
}
@Override
public void delete(Serializable... ids) {
	// TODO 自动生成的方法存根
	for (Serializable id : ids) {
		em.remove(em.find(entityClass, id));
	}
}
@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
@Override
public T find(Serializable entityId) {
	// TODO 自动生成的方法存根
	if(entityId == null){
		throw new RuntimeException(this.entityClass.getName() + ":传入的实体id不能为空");
	}
	return em.find(entityClass, entityId);
}
@Override
public QueryResult<T> getScrollData(int firstindex, int maxresult,
		String wherejpql, Object[] queryParams,
		LinkedHashMap<String, String> orderby) {
	// TODO 自动生成的方法存根
	//组拼where语句； where o.useranme = ?1 and o.password = ?2
	String where = (wherejpql == null || "".equals(wherejpql.trim()) ? "" : " where " + wherejpql);
	//查询并根据分页条件得到分页数据
	Query query = em.createQuery("select o from " + this.getEntityName() + " o " + where + buildOrderBy(orderby));
	setQueryParams(query, queryParams);
	if(firstindex != -1 && maxresult != -1){
		query.setFirstResult(firstindex).setMaxResults(maxresult);
	}
	QueryResult<T> qr = new QueryResult<T>();
	qr.setRows(query.getResultList());
	query = em.createQuery("select count(" + getCountField(this.entityClass)+ ") from " + this.getEntityName() + " o " + (wherejpql == null || "".equals(wherejpql.trim())? "" : "where " + wherejpql));
	setQueryParams(query, queryParams);
	long count  = (Long)query.getSingleResult();
	qr.setTotal(count);;
	return qr;
}
@Override
public QueryResult<T> getScrollDataCache(int firstindex, int maxresult,
		String wherejpql, Object[] queryParams,
		LinkedHashMap<String, String> orderby) {
	// TODO 自动生成的方法存根
	//组拼where语句； where o.useranme = ?1 and o.password = ?2
	String where = (wherejpql == null || "".equals(wherejpql.trim()) ? "" : " where " + wherejpql);
	//查询并根据分页条件得到分页数据
	Query query = em.createQuery("select o from " + this.getEntityName() + " o " + where + buildOrderBy(orderby));
	setQueryParams(query, queryParams);
	if(firstindex != -1 && maxresult != -1){
		query.setFirstResult(firstindex).setMaxResults(maxresult);
	}
	QueryResult<T> qr = new QueryResult<T>();
	qr.setRows(query.setHint("org.hibernate.cacheable", true).getResultList());
	query = em.createQuery("select count(" + getCountField(this.entityClass)+ ") from " + this.getEntityName() + " o " + (wherejpql == null || "".equals(wherejpql.trim())? "" : "where " + wherejpql));
	setQueryParams(query, queryParams);
	long count  = (Long)query.setHint("org.hibernate.cacheable", true).getSingleResult();
	qr.setTotal(count);;
	return qr;
}
@Override
public QueryResult<T> getScrollData(int firstindex, int maxresult,
		String wherejpql, Object[] queryParams) {
	// TODO 自动生成的方法存根
	return getScrollData(firstindex, maxresult, wherejpql, queryParams, null);
}
@Override
public QueryResult<T> getScrollData(int firstindex, int maxresult,
		LinkedHashMap<String, String> orderby) {
	// TODO 自动生成的方法存根
	return getScrollData(firstindex, maxresult, null, null, orderby);
}
@Override
public QueryResult<T> getScrollData(int firstindex, int maxresult) {
	// TODO 自动生成的方法存根
	return getScrollData(firstindex, maxresult, null, null, null);
}
@Override
public QueryResult<T> getScrollData() {
	// TODO 自动生成的方法存根
	return getScrollData(-1, -1, null, null, null);
}
@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
public long  getCount() {
	return (Long) em.createQuery("select count("+getCountField(this.entityClass) +") from "+ this.getEntityName()+" o").getSingleResult();
}
/**
 * 为where语句设置参数
 * @param query
 * @param queryParams
 */
private void setQueryParams(Query query, Object[] queryParams){
	if(queryParams != null && queryParams.length>0){
		for (int i = 0; i < queryParams.length; i++) {
			query.setParameter(i+1, queryParams[i]);
		}
	}
}
/**
 * 组装order by语句  类似于 order by o.username asc ,o.email desc
 * @param orderby orderby ,key 为要排序的属性， value 为要为该属性的排序方式
 * @return
 */
private String buildOrderBy(LinkedHashMap<String, String> orderby){
	StringBuffer sb = new StringBuffer();
	if( orderby !=null && !orderby.isEmpty()){
		sb.append(" order by ");
		
		for (Map.Entry<String, String> entity : orderby.entrySet()) {
			sb.append(" o.").append(entity.getKey()).append(" ").append(entity.getValue()).append(",");
		}
		//去掉最后的","号。
		sb.deleteCharAt(sb.length()-1);
	}
	return sb.toString();
}
/**
 * 得到实体的名称
 * @return
 */
private String getEntityName() {
	String entityName = entityClass.getSimpleName();
	Entity entity = entityClass.getAnnotation(Entity.class);
	if(entity.name() != null && !"".equals(entity.name().trim()))
			{
		entityName = entity.name();
	} 
	return entityName;
}
/**
 * 
 * @param clazz
 * @return
 */
protected static<E> String getCountField(Class<E> clazz) {
	String out = "o";
	try {
		PropertyDescriptor[] propertyDescriptors =  Introspector.getBeanInfo(clazz).getPropertyDescriptors();
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			Method method = propertyDescriptor.getReadMethod();
			if(method!=null && method.isAnnotationPresent(EmbeddedId.class)){
				PropertyDescriptor[] ps = Introspector.getBeanInfo(propertyDescriptor.getPropertyType()).getPropertyDescriptors();
				out = "o."+ propertyDescriptor.getName()+ "." + (!ps[1].getName().equals("class")? ps[1].getName(): ps[0].getName());
				break;
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return out;
}
}

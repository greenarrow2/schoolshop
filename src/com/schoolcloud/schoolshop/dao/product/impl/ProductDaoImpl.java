package com.schoolcloud.schoolshop.dao.product.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.product.ProductDao;
@Repository("productDao")
public class ProductDaoImpl extends DAOSuport<Product>  implements ProductDao{

	@Override
	public Product getLastOrProduct(Serializable id) {
		// TODO 自动生成的方法存根
		Product product = null;
		if(id==null){
			String sql = "select * from product where 1=1 order by id desc LIMIT 1 OFFSET 0";
		    Query query = em.createNativeQuery(sql);
		    product = (Product) query.getSingleResult();
		}else {
		product = find(id);
		}
		return product;
	}
 
	public  List<Product>  getProductListByOneType(Serializable id){
		String hql = "select o from Product o where o.productType.parent.parent.id = ?1 order by o.id desc,o.recommendRank desc";
		List<Product> productList =  em.createQuery(hql).setParameter(1, id).setMaxResults(15).getResultList();
		return productList;
	}

	@Override
	public boolean isExist(String productName) {
		// TODO 自动生成的方法存根
		String jhql = "select o from Product o where o.productName = ?1";
	    List<Product> products = em.createQuery(jhql).setParameter(1, productName).getResultList();
	    if(products!=null && products.size()>0){
	    	return true;
	    }else {
	    	return false;
		}
	}

	@Override
	public List<Product> queryProductByMark(Integer start, Integer limit,
			Integer mark) {
		String jpql = "select o from Product o where o.mark = ?1";
		 List<Product> products = em.createQuery(jpql).setParameter(1, mark).setFirstResult(start).setMaxResults(limit).getResultList();
		 return products;
	}

	@Override
	public List<Product> getProductListByTwoType(Serializable id) {
		String hql  = "select o from Product o where o.productType.parent.id = ?1 order by o.id desc";
		List<Product> productList = em.createQuery(hql).setParameter(1, id).getResultList();
		return productList;
	}

	@Override
	public List<Product> queryProductCache() {
	List<Object> list = null;
	String jqpl = "select o.productName,o.productType from Product o";
	Query query =  em.createQuery(jqpl);
	list = query.setHint("org.hibernate.cacheable", true).getResultList();
	List<Product> products = new ArrayList<Product>();
	for (Object object : list) {
		Product product = new Product();
		Object[] obj = (Object[]) object;
		product.setProductName(obj[0].toString());
		product.setProductType((ProductType) obj[1]);
		products.add(product);
	}
	return products;
	}

	@Override
	public QueryResult<Product> getScrollProductDataCache(int firstindex,
			int maxresult, String wherejpql, Object[] queryParams,
			LinkedHashMap<String, String> orderby) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		 String slq = "DELETE from product WHERE id=?";
		 em.createNativeQuery(slq).setParameter(1, id).executeUpdate();
	}
	
}

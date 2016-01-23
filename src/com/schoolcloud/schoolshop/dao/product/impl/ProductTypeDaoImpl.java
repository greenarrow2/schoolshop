package com.schoolcloud.schoolshop.dao.product.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.product.ProductTypeDao;
@Repository("productTypeDao")
public class ProductTypeDaoImpl extends DAOSuport<ProductType> implements ProductTypeDao {
	@SuppressWarnings("unchecked")
	public List<ProductType> getProductTypes(){
	String hql = "select o from ProductType o";
	Query query = em.createQuery(hql);
	List<ProductType> list = query.getResultList();
	return  list;
}
	public List<ProductType> getProductTypes(Integer parentId){
		String hql = "select o from ProductType o  where o.parent.id = ?1";
		Query query = em.createQuery(hql).setParameter(1, parentId);
		List<ProductType> list = query.getResultList();
		return  list;
	}
	@Override
	public List<ProductType> getOneTypes() {
		String hql = "select o from ProductType o  where o.parent is null";
		Query query = em.createQuery(hql);
		List<ProductType> list = query.getResultList();
		return  list;
	}
	@Override
	public List<ProductType> getProductTwoType(Integer id) {
		// TODO 自动生成的方法存根
		String sql = "select * from productType where typeId = ?";
		List<ProductType> productTypes = em.createNativeQuery(sql, ProductType.class).setParameter(1, id).getResultList();
		return productTypes;
	}
	 
}

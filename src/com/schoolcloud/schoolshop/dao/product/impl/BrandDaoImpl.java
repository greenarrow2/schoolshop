package com.schoolcloud.schoolshop.dao.product.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.product.Brand;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.product.BrandDao;
@Repository("brandDao")
public class BrandDaoImpl extends DAOSuport<Brand> implements BrandDao {

	@Override
	public List<Brand> getBrandList() {
		// TODO 自动生成的方法存根
		String jpql = "select o from Brand o";
		return em.createQuery(jpql).getResultList();
	}
}

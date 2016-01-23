package com.schoolcloud.schoolshop.dao.product.impl;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.product.ProductGenre;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.product.ProductGenreDao;
@Repository("productGenreDao")
public class ProductGenreDaoImpl extends DAOSuport<ProductGenre> implements
		ProductGenreDao {

	@Override
	public ProductGenre getLastProductGenre() {
		// TODO 自动生成的方法存根
		String hql = "select o from ProductGenre o";
		Query query = em.createQuery(hql);
		List list = query.getResultList();
		int size = list.size();
		return (ProductGenre) list.get(size-1);
	}

	@Override
	public List<ProductGenre> getProductGenres() {
		// TODO 自动生成的方法存根
		String hql = "select o from ProductGenre o";
		Query query = em.createQuery(hql);
		List<ProductGenre> list = query.getResultList();
		return  list;
	}
}
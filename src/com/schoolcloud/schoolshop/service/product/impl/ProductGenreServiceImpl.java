package com.schoolcloud.schoolshop.service.product.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.ProductGenre;
import com.schoolcloud.schoolshop.dao.product.ProductGenreDao;
import com.schoolcloud.schoolshop.service.product.ProductGenreService;
@Transactional
@Service("productGenreService")
public class ProductGenreServiceImpl implements ProductGenreService {
@Resource(name="productGenreDao")
private ProductGenreDao productGenreDao;

public ProductGenreDao getProductGenreDao() {
	return productGenreDao;
}

public void setProductGenreDao(ProductGenreDao productGenreDao) {
	this.productGenreDao = productGenreDao;
}

@Override
public void save(ProductGenre productGenre) {
	// TODO 自动生成的方法存根
	productGenreDao.save(productGenre);
}

@Override
public void update(ProductGenre productGenre) {
	// TODO 自动生成的方法存根
	productGenreDao.update(productGenre);
}

@Override
public void delete(Serializable id) {
	// TODO 自动生成的方法存根
	productGenreDao.delete(id);
}

@Override
public void delete(Serializable... ids) {
	// TODO 自动生成的方法存根
	productGenreDao.delete(ids);
}

@Override
public ProductGenre find(Serializable id) {
	// TODO 自动生成的方法存根
	return productGenreDao.find(id);
}

@Override
public QueryResult<ProductGenre> getScrollProductGenreData(Integer start,
		Integer limit) {
	// TODO 自动生成的方法存根
	return productGenreDao.getScrollData(start, limit);
}

@Override
public QueryResult<ProductGenre> getScrollProductGenreData() {
	// TODO 自动生成的方法存根
	return productGenreDao.getScrollData();
}

@Override
public ProductGenre getLastProductGenre() {
	// TODO 自动生成的方法存根
	return productGenreDao.getLastProductGenre();
}

@Override
public List<ProductGenre> getProductGenres() {
	// TODO 自动生成的方法存根
	return productGenreDao.getProductGenres();
}

}

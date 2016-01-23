package com.schoolcloud.schoolshop.dao.product;

import java.util.List;

import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.dao.base.DAO;
public interface ProductTypeDao extends DAO<ProductType>{
	/**
	 * 获得所有分类
	 * @return
	 */
	public List<ProductType> getProductTypes();
	/**
	 * 根据父类获得下级分类
	 * @param parentId
	 * @return
	 */
	public List<ProductType> getProductTypes(Integer parentId);
	/**
	 * 查询所有的一级分类
	 * @return
	 */
	public List<ProductType> getOneTypes();
	
	/**
	 * 根据上级分类查询子分类
	 * @param id
	 * @return
	 */
	public List<ProductType> getProductTwoType(Integer id);
}

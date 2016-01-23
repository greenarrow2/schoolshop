package com.schoolcloud.schoolshop.service.product;

import java.io.Serializable;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Brand;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;

public interface ProductStyleService {
	/**
	 * 保存品牌
	 * @param brand
	 */
	public void save(ProductStyle productStyle);
	/**
	 * 更新品牌
	 * @param brand
	 */
	public void update(ProductStyle productStyle);
	/**
	 * 根据ID删除样式
	 * @param id
	 */
	public void delete(Serializable id);
	/**
	 * 根据数组删除品牌
	 * @param ids
	 */
	public void delete(Serializable...ids);
	/**
	 * 查询实体
	 * @param id
	 * @return
	 */
	public ProductStyle find(Serializable id);
	/**
	 * 得到所有的样式
	 * @return
	 */
	public QueryResult<ProductStyle> getScrollProductStyleData();
	 /**
	  * 
	  * @param firstindex
	  * @param maxresult
	  * @return
	  */
	public QueryResult<ProductStyle> getScrollProductStyleData(
			Integer start, Integer limit,String name,String productName,Integer timeType,String beginTime,String endTime,Boolean visible
			);
}

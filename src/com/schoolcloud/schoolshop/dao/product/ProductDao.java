package com.schoolcloud.schoolshop.dao.product;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface ProductDao extends DAO<Product>{
	/**
	 * 得到最后一个或者对应id的实体Product
	 * @param id
	 * @return
	 */
	public Product getLastOrProduct(Serializable id);

	/**
	 * 根据一级分类查询商品
	 * @param id 一级分类id
	 * @return
	 */
	public  List<Product>  getProductListByOneType(Serializable id);
	/**
	 * 判断数据库中是否有该商品了
	 * @param productName 商品名称
	 * @return
	 */
	public  boolean  isExist(String productName);
	/**
	 * 
	 * @param start 开始索引
	 * @param limit查询宽度
	 * @param markmark 标签  1抢购，  2热卖， 3特卖，4猜你喜欢 ，5热评商品，6新品上架 ，7一元云购 0 普通
	 * @return
	 */
	public List<Product> queryProductByMark(Integer start,Integer limit,Integer mark);
	public List<Product> queryProductCache();
	/**
	 * 带缓存的查询
	 * @param firstindex
	 * @param maxresult
	 * @param wherejpql
	 * @param queryParams
	 * @param orderby
	 * @return
	 */
	public QueryResult<Product> getScrollProductDataCache(int firstindex, int maxresult,
			String wherejpql, Object[] queryParams,
			LinkedHashMap<String, String> orderby);
	/**
	 * 根据二级查商品
	 * @param id
	 * @return
	 */
	public  List<Product>  getProductListByTwoType(Serializable id);
	
	public void delete(Serializable id);

}

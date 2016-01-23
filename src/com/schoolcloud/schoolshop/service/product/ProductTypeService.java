package com.schoolcloud.schoolshop.service.product;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.schoolcloud.schoolshop.bean.menu.TreeNode;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.ProductType;

public interface ProductTypeService  {
	/**
	 * 保存分类
	 * @param productType
	 */
  public void save(ProductType productType);
  /**
   * 更新分类
   * @param productType
   */
  public void update(ProductType productType);
  /**
   * 删除分类
   * @param id
   */
  public void delete(Serializable id);
  /**
   * 分组删除
   * @param ids
   */
  public void delete(Serializable...ids);
  /**
   * 保存分类
   * @param id
   * @return
   */
  public ProductType find(Serializable id);
  /**
   * 得到所有商品分类
   * @return
   */
  public List<ProductType> getProductTypes();
  /**
   * 
   * @return
   */
  public List<ProductType> getProductTypes(Integer parentId);
  /**
   * 得到商品类型数据
   * @param start
   * @param limit
   * @return
   */
  public QueryResult<ProductType> getScrollProductTypeData(Integer start,Integer limit);
  /**
   * 得到所有的分类
   * @return
   */
  public QueryResult<ProductType> getScrollProductTypeData();
  /**
   * 深度遍历一棵分类树 
   * @param qr
   * @return
   */
	public List<TreeNode> deepMenuById(QueryResult<ProductType> qr);
	/**
	 * 根据一级分类的ID查询二级分类
	 * @param id 一级分类id
	 * @return
	 */
	public List<ProductType> getProductTwoType(Integer id);
	/**
	 * 根据id查询分类信息
	 * @param id
	 * @return
	 */
	public ProductType searchTypeInfo(Integer id);
	/**
	 * 查询所有的一级分类
	 * @return
	 */
	public List<ProductType> getOneTypes();
}

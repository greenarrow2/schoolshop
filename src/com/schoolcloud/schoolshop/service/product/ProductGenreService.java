package com.schoolcloud.schoolshop.service.product;

import java.io.Serializable;
import java.util.List;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.ProductGenre;

/**
 * 类别
 * @author 长润
 *
 */
public interface ProductGenreService {
	/**
	 * 保存品牌
	 * @param brand
	 */
	public void save(ProductGenre productGenre);
	/**
	 * 更新品牌
	 * @param ProductGenre
	 */
	public void update(ProductGenre productGenre);
	/**
	 * 根据ID删除品牌
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
	public ProductGenre find(Serializable id);
	/**
	 * 得到最后一条数据
	 * @return
	 */
	public ProductGenre getLastProductGenre();
	/**
	 * 得到所有类型
	 * @return
	 */
	public List<ProductGenre> getProductGenres();
 /**
  * 类别分页
  * @param start
  * @param limit
  * @return
  */
	public QueryResult<ProductGenre> getScrollProductGenreData(Integer start,Integer limit);

	public QueryResult<ProductGenre> getScrollProductGenreData();
}

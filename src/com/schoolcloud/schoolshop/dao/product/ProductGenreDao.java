package com.schoolcloud.schoolshop.dao.product;

import java.util.List;
import com.schoolcloud.schoolshop.bean.product.ProductGenre;
import com.schoolcloud.schoolshop.dao.base.DAO;
public interface ProductGenreDao extends DAO<ProductGenre>{
	/**
	 * 查询最后一条数据
	 * @return
	 */
public ProductGenre getLastProductGenre();
/**
 * 查询类型数据
 * @return
 */
public List<ProductGenre> getProductGenres();
}

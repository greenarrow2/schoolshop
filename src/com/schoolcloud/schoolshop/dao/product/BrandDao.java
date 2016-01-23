package com.schoolcloud.schoolshop.dao.product;

import java.util.List;

import com.schoolcloud.schoolshop.bean.product.Brand;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface BrandDao extends DAO<Brand>{
	/**
	 * 得到所有的品牌分类
	 * @return
	 */
	public List<Brand> getBrandList();
}

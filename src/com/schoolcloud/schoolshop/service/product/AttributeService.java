package com.schoolcloud.schoolshop.service.product;

import java.io.Serializable;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Attribute;

/**
 * 属性的服务层
 * @author 长润
 *
 */
public interface AttributeService {
	/**
	 *保存参数
	 * @param attribute
	 */
	public void save(Attribute attribute);
	/**
	 * 更新参数
	 * @param attribute
	 */
	public void update(Attribute attribute);
	/**
	 * 删除参数
	 * @param id
	 */
	public void delete(Serializable id);
	/**
	 * 分组删除参数
	 * @param ids
	 */
	public void delete(Serializable...ids);
	/**
	 * 查询参数
	 * @param start
	 * @param limit
	 * @return
	 */
	public QueryResult<Attribute> getScrollAttributeData(Integer start,Integer limit,Integer genreId);
}

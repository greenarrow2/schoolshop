package com.schoolcloud.schoolshop.dao.base;

import java.io.Serializable;
import java.util.LinkedHashMap;

import com.schoolcloud.schoolshop.bean.page.QueryResult;



public interface DAO<T> {

	/**
	 * 保存实体
	 * @param enity
	 */
	public void save(T enity);
	/**
	 * 更新实体
	 * @param entity
	 */
	public void update(T entity);
	/**
	 * 删除实体
	 * @param id
	 */
	public  void delete(Serializable id);
	/**
	 * 按组删除实体
	 * @param ids
	 */
	public  void delete(Serializable...ids );
	/**
	 * 通过id得到一个实体
	 * @param entityId
	 * @return
	 */
	public T find(Serializable entityId);
	/**
	 * 分页显示的数据
	 */
	public QueryResult<T> getScrollData(int firstindex , int maxresult , String wherejpql , Object[] queryParams , LinkedHashMap<String, String> orderby);

	public QueryResult<T> getScrollData(int firstindex, int maxresult, String wherejpql, Object[] queryParams);

	public QueryResult<T> getScrollData(int firstindex, int maxresult, LinkedHashMap<String, String> orderby);

	public QueryResult<T> getScrollData(int firstindex, int maxresult);

	public QueryResult<T> getScrollData();
	public QueryResult<T> getScrollDataCache(int firstindex, int maxresult,String wherejpql, Object[] queryParams,LinkedHashMap<String, String> orderby);
}

package com.schoolcloud.schoolshop.service.book;

import java.io.Serializable;
import java.util.Date;

import com.schoolcloud.schoolshop.bean.book.OrderItem;
import com.schoolcloud.schoolshop.bean.page.QueryResult;

public interface OrderItemService {
	/**
	 * 保存订单列
	 * @param brand
	 */
	public void save(OrderItem orderItem);
	/**
	 * 更新订单列
	 * @param brand
	 */
	public void update(OrderItem orderItem);
	/**
	 * 根据ID删除订单列
	 * @param id
	 */
	public void delete(Serializable id);
	/**
	 * 根据数组删除订单列
	 * @param ids
	 */
	public void delete(Serializable...ids);
	/**
	 * 查询实体
	 * @param id
	 * @return
	 */
	public OrderItem find(Serializable id);

	public QueryResult<OrderItem> getScrollOrderItemData(Integer start,Integer limit,String productName,String orderId,Integer timeType,Date beginTime,Date endTime,Boolean done);

	public QueryResult<OrderItem> getScrollOrderItemData(Integer start, Integer limit);
}
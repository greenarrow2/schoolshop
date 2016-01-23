package com.schoolcloud.schoolshop.service.book;

import java.io.Serializable;
import java.util.Date;
import com.schoolcloud.schoolshop.bean.book.OrderState;
import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.bean.page.QueryResult;

/**
 * 订单处理类
 * @author 长润
 *
 */
public interface OrderService {

	/**
	 * 保存订单列
	 * @param brand
	 */
	public void save(UserOrder userOrder);
	/**
	 * 更新订单列
	 * @param brand
	 */
	public void update(UserOrder userOrder);
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
	public UserOrder find(Serializable id);

	public QueryResult<UserOrder> getScrollUserOrderData(Integer start,Integer limit,Integer userId,String userName,String realName,String orderId,Integer timeType,String beginTime,String endTime,OrderState orderState);

	public QueryResult<UserOrder> getScrollUserOrderData(Integer start, Integer limit);
	/**
	 * 根据订单号查询实体
	 * @param orderId
	 * @return
	 */
    public UserOrder findByOrderId(String orderId);
}

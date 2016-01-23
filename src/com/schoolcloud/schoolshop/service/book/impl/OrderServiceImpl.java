package com.schoolcloud.schoolshop.service.book.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.book.OrderState;
import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.dao.book.OrderDao;
import com.schoolcloud.schoolshop.service.book.OrderService;
/**
 * 订单处理类
 * @author 长润
 *
 */
@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {
	@Resource(name="orderDao")
	private OrderDao orderDao;

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void save(UserOrder userOrder) {
		// TODO 自动生成的方法存根
		orderDao.save(userOrder);
	}

	@Override
	public void update(UserOrder userOrder) {
		// TODO 自动生成的方法存根
		orderDao.update(userOrder);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		orderDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		orderDao.delete(ids);
	}

	@Override
	public UserOrder find(Serializable id) {
		// TODO 自动生成的方法存根
		return orderDao.find(id);
	}

	@Override
	public QueryResult<UserOrder> getScrollUserOrderData(Integer start,
			Integer limit,Integer userId, String userName, String realName, String orderId,
			Integer timeType, String beginTime, String endTime,
			OrderState orderState) {
		// TODO 自动生成的方法存根
		StringBuilder jpql = new StringBuilder(" 1=1 ");
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderBy = new LinkedHashMap<String, String>();
		orderBy.put("id", "desc");
		if(userId != null && userId>0){
			jpql.append(" and o.user.id = ?"+(params.size()+1));
			params.add(userId);
		}
		if(userName != null && !"".equals(userName)){
			jpql.append(" and o.user.userName = ?"+(params.size()+1));
			params.add(userName);
		}
		if(realName != null && !"".equals(realName)){
			jpql.append(" and o.user.realName = ?"+(params.size()+1));
			params.add(realName);
		}
		if(orderState!=null&&!"".equals(orderState)){
			jpql.append(" and o.state = ?"+(params.size()+1));
			params.add(orderState);
		}
		if (orderId!=null && !"".equals(orderId)) {
			jpql.append(" and o.orderId = ?"+(params.size()+1));
			params.add(orderId);
		}
		if(timeType !=null){
			if(timeType==1){
				if(beginTime!=null&&!"".equals(beginTime)){
					jpql.append(" and o.createTime > ?" + (params.size()+1));
					params.add(beginTime);
				}
				if(endTime!=null&&!"".equals(endTime)){
					jpql.append(" and o.createTime < ?" + (params.size()+1));
					params.add(endTime);
				}}
			if (timeType==2) {
				if(beginTime!=null&&!"".equals(beginTime)){
					jpql.append(" and o.updateTime > ?" + (params.size()+1));
					params.add(beginTime);
				}
				if(endTime!=null&&!"".equals(endTime)){
					jpql.append(" and o.updateTime < ?" + (params.size()+1));
					params.add(endTime);
				}
			}
		}
		return orderDao.getScrollData(start, limit, jpql.toString(), params.toArray(), orderBy);
}

	@Override
	public QueryResult<UserOrder> getScrollUserOrderData(Integer start,
			Integer limit) {
		// TODO 自动生成的方法存根
		return orderDao.getScrollData(start, limit);
	}

	@Override
	public UserOrder findByOrderId(String orderId) {
		// TODO 自动生成的方法存根
		return orderDao.findByOrderId(orderId);
	}

 
}

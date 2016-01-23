package com.schoolcloud.schoolshop.service.book.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.book.OrderItem;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.dao.book.OrderItemDao;
import com.schoolcloud.schoolshop.service.book.OrderItemService;
@Service("orderItemService")
@Transactional
public class OrderItemServiceImpl implements OrderItemService {
@Resource(name="orderItemDao")
private OrderItemDao orderItemDao;

@Override
public void save(OrderItem orderItem) {
	// TODO 自动生成的方法存根
	orderItemDao.save(orderItem);
}

@Override
public void update(OrderItem orderItem) {
	// TODO 自动生成的方法存根
	orderItemDao.update(orderItem);
}

@Override
public void delete(Serializable id) {
	// TODO 自动生成的方法存根
	orderItemDao.delete(id);
}

@Override
public void delete(Serializable... ids) {
	// TODO 自动生成的方法存根
	orderItemDao.delete(ids);
}

@Override
public OrderItem find(Serializable id) {
	// TODO 自动生成的方法存根
	return orderItemDao.find(id);
}

@Override
@Transactional(readOnly=true,propagation=Propagation.NOT_SUPPORTED)
public QueryResult<OrderItem> getScrollOrderItemData(Integer start,Integer limit,String productName,String orderId,Integer timeType,Date beginTime,Date endTime,Boolean done) {
	// TODO 自动生成的方法存根
	StringBuilder jpql = new StringBuilder(" 1=1 ");
	List<Object> params = new ArrayList<Object>();
	LinkedHashMap<String, String> orderBy = new LinkedHashMap<String, String>();
	orderBy.put("id", "desc");
	if(productName != null && !"".equals(productName)){
		jpql.append(" and o.order.productName = ?"+(params.size()+1));
		params.add(productName);
	}
	if(done!=null){
		jpql.append(" and o.done = ?"+(params.size()+1));
		params.add(done);
	}
	if (orderId!=null && !"".equals(orderId)) {
		jpql.append(" and o.order.orderId = ?"+(params.size()+1));
		params.add(orderId);
	}
	if(timeType !=null){
		if(timeType==1){
			if(beginTime!=null&&!"".equals(beginTime)){
				jpql.append(" and o.order.createTime > ?" + (params.size()+1));
				params.add(beginTime);
			}
			if(endTime!=null&&!"".equals(endTime)){
				jpql.append(" and o.order.createTime < ?" + (params.size()+1));
				params.add(endTime);
			}}
		if (timeType==2) {
			if(beginTime!=null&&!"".equals(beginTime)){
				jpql.append(" and o.order.updateTime > ?" + (params.size()+1));
				params.add(beginTime);
			}
			if(endTime!=null&&!"".equals(endTime)){
				jpql.append(" and o.order.updateTime < ?" + (params.size()+1));
				params.add(endTime);
			}
		}
	}
	return orderItemDao.getScrollData(start, limit, jpql.toString(), params.toArray(), orderBy);
}

@Override
@Transactional(readOnly=true,propagation=Propagation.NOT_SUPPORTED)
public QueryResult<OrderItem> getScrollOrderItemData(Integer start,
		Integer limit) {
	// TODO 自动生成的方法存根
	return orderItemDao.getScrollData(start, limit);
}

 

public OrderItemDao getOrderItemDao() {
	return orderItemDao;
}

public void setOrderItemDao(OrderItemDao orderItemDao) {
	this.orderItemDao = orderItemDao;
}

}

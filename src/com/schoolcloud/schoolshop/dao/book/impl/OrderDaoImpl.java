package com.schoolcloud.schoolshop.dao.book.impl;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.book.OrderDao;
@Repository("orderDao")
public class OrderDaoImpl extends DAOSuport<UserOrder> implements OrderDao {

	@Override
	public UserOrder findByOrderId(String orderId) {
		// TODO 自动生成的方法存根
		String sql = "select o from UserOrder o where o.orderId = ?1";
	    UserOrder uo =	(UserOrder) em.createQuery(sql).setParameter(1, orderId).getSingleResult();
		return uo;
	}
 
}

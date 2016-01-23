package com.schoolcloud.schoolshop.dao.book.impl;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.book.OrderItem;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.book.OrderItemDao;
@Repository("orderItemDao")
public class OrderItemDaoImpl extends DAOSuport<OrderItem> implements OrderItemDao{

}

package com.schoolcloud.schoolshop.dao.book;

import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface OrderDao extends DAO<UserOrder> {
public UserOrder findByOrderId(String orderId);
}

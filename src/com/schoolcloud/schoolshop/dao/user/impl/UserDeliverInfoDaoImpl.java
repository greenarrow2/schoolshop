package com.schoolcloud.schoolshop.dao.user.impl;

import org.springframework.stereotype.Repository;
import com.schoolcloud.schoolshop.bean.user.UserDeliverInfo;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.user.UserDeliverInfoDao;
@Repository("userDeliverInfoDao")
public class UserDeliverInfoDaoImpl extends DAOSuport<UserDeliverInfo> implements UserDeliverInfoDao{

}

package com.schoolcloud.schoolshop.service.user.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.user.UserDeliverInfo;
import com.schoolcloud.schoolshop.dao.user.UserDeliverInfoDao;
import com.schoolcloud.schoolshop.service.user.UserDeliverInfoService;
@Service("userDeliverInfoService")
@Transactional
public class UserDeliverInfoServiceImpl implements UserDeliverInfoService{
    @Resource(name="userDeliverInfoDao")
	private UserDeliverInfoDao userDeliverInfoDao;
    
	public UserDeliverInfoDao getUserDeliverInfoDao() {
		return userDeliverInfoDao;
	}

	public void setUserDeliverInfoDao(UserDeliverInfoDao userDeliverInfoDao) {
		this.userDeliverInfoDao = userDeliverInfoDao;
	}

	@Override
	public void save(UserDeliverInfo userDeliverInfo) {
		// TODO 自动生成的方法存根
		userDeliverInfoDao.save(userDeliverInfo);
	}

	@Override
	public void update(UserDeliverInfo userDeliverInfo) {
		// TODO 自动生成的方法存根
		userDeliverInfoDao.update(userDeliverInfo);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		userDeliverInfoDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		userDeliverInfoDao.delete(ids);
	}

	@Override
	public UserDeliverInfo find(Serializable id) {
		// TODO 自动生成的方法存根
		return userDeliverInfoDao.find(id);
	}

}

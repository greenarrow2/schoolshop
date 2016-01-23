package com.schoolcloud.schoolshop.service.user.impl;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.dao.user.UserDao;
import com.schoolcloud.schoolshop.service.user.UserService;
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
@Resource(name="userDao")
private UserDao userDao;

public UserDao getUserDao() {
	return userDao;
}

public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}

	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		// TODO 自动生成的方法存根
		userDao.update(user);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		userDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		userDao.delete(ids);
	}

	@Override
	public QueryResult<User> getScrollUserData(int firstindex,
			int maxresult, String wherejpql, Object[] queryParams,
			LinkedHashMap<String, String> orderby) {
		// TODO 自动生成的方法存根
		return userDao.getScrollData(firstindex, maxresult, wherejpql, queryParams, orderby);
	}

	@Override
	public QueryResult<User> getScrollUserData(int firstindex, int maxresult,
			String wherejpql, Object[] queryParams) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public QueryResult<User> getScrollUserData(int firstindex, int maxresult,
			LinkedHashMap<String, String> orderby) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public QueryResult<User> getScrollUserData(int firstindex, int maxresult) {
		// TODO 自动生成的方法存根
		return userDao.getScrollData(firstindex, maxresult);
	}

	@Override
	public QueryResult<User> getScrollUserData() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public User isExist(String userName, String password) {
		// TODO Auto-generated method stub
	  User user =	userDao.getUserList(userName, password);
	  return user;
	}

	@Override
	public User find(Serializable id) {
		// TODO Auto-generated method stub
		return userDao.find(id);
	}

	@Override
	public boolean isExistUserName(String userName) {
		// TODO Auto-generated method stub
		List<User> list =	userDao.getUserList(userName);
		 if(list!=null){
			  if(list.size() > 0){
				  return true;
			  }else {
				return false;
			}
			 }
			 return false;
	}

}

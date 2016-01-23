package com.schoolcloud.schoolshop.dao.user.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.user.UserDao;
@Repository("userDao")
public class  UserDaoImpl extends DAOSuport<User> implements UserDao {

	@Override
	public User getUserList(String userName,String password) {
		String hql = "select o from User o where o.userName = ?1 or o.email = ?2 or o.phone = ?3  and o.password = ?4 ";
	    List<User> users   =   em.createQuery(hql,User.class).setParameter(1,userName).setParameter(2,userName).setParameter(3,userName).setParameter(4, password).getResultList();
	    if(users!=null&&users.size()>0){
	    	return users.get(0);
	    }else {
	    	return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList(String userName) {
		// TODO Auto-generated method stub
		String hql = "select o from User o where o.nickName = ?1";
		return  (List<User>)em.createQuery(hql).setParameter(1,userName).getResultList();
	}
	 
}

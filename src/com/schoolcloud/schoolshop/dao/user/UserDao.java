package com.schoolcloud.schoolshop.dao.user;


import java.util.List;
import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface UserDao extends DAO<User>{
public User getUserList(String userName,String password);
public List<User> getUserList(String userName);
}

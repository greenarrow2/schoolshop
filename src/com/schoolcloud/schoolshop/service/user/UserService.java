package com.schoolcloud.schoolshop.service.user;

import java.io.Serializable;
import java.util.LinkedHashMap;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.user.User;

public interface UserService {
/**
 * 保存用户
 * @param user
 */
public void save(User user);
/**
 * 更新用户
 * @param user
 */
public void update(User user);
/**
 * 找到实体对象
 * @param id
 * @return
 */
public User find(Serializable id);
/**
 * 删除用户
 * @param id
 */
public void delete(Serializable id );
/**
 * 分组删除用户
 * @param ids
 */
public void delete(Serializable...ids);
/**
 * 判断用户是否存在
 * @param userName
 * @param password
 * @return
 */
public User isExist(String userName,String password);
/**
 * 判断数据库中是否有userName
 * @param userName
 * @return
 */
public boolean isExistUserName(String userName);
/**
 * 分页显示的数据
*/

public QueryResult<User> getScrollUserData(int firstindex, int maxresult, String wherejpql, Object[] queryParams, LinkedHashMap<String, String> orderby);

public QueryResult<User> getScrollUserData(int firstindex, int maxresult, String wherejpql, Object[] queryParams);

public QueryResult<User> getScrollUserData(int firstindex, int maxresult, LinkedHashMap<String, String> orderby);

public QueryResult<User> getScrollUserData(int firstindex, int maxresult);

public QueryResult<User> getScrollUserData();
}

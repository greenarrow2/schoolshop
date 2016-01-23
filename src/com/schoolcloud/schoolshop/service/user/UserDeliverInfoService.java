package com.schoolcloud.schoolshop.service.user;

import java.io.Serializable;

import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.bean.user.UserDeliverInfo;


public interface UserDeliverInfoService {
	/**
	 * 保存用户
	 * @param user
	 */
	public void save(UserDeliverInfo userDeliverInfo);
	/**
	 * 更新用户
	 * @param user
	 */
	public void update(UserDeliverInfo userDeliverInfo);
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
	 * 找到实体对象
	 * @param id
	 * @return
	 */
	public UserDeliverInfo find(Serializable id);
	 
}

package com.schoolcloud.schoolshop.service.user;

import java.io.Serializable;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.user.Favorite;

public interface FavoriteService {
	/**
	 * 保存用户
	 * @param user
	 */
	public void save(Favorite favorite);
	/**
	 * 更新用户
	 * @param user
	 */
	public void update(Favorite favorite);
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
	 * 分页显示的数据
	*/

	public QueryResult<Favorite> getScrollFavoriteData(Integer start, Integer limit,Integer userId);
}

package com.schoolcloud.schoolshop.service.user;

import java.io.Serializable;
import java.util.LinkedHashMap;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.user.Comment;
public interface CommentService {
	/**
	 * 保存用户
	 * @param user
	 */
	public void save(Comment comment);
	/**
	 * 更新用户
	 * @param user
	 */
	public void update(Comment comment);
	/**
	 * 找到实体对象
	 * @param id
	 * @return
	 */
	public Comment find(Serializable id);
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
	public QueryResult<Comment> getScrollCommentData(int firstindex, int maxresult,Integer productId,Boolean visible,Integer userId);

}

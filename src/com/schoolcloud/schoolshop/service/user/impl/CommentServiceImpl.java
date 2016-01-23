package com.schoolcloud.schoolshop.service.user.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.dao.user.CommentDao;
import com.schoolcloud.schoolshop.service.user.CommentService;
@Service("commentService")
@Transactional
public class CommentServiceImpl implements CommentService {
	@Resource(name="commentDao")
	private CommentDao commentDao;

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	@Override
	public void save(Comment comment) {
		// TODO 自动生成的方法存根
		commentDao.save(comment);
	}

	@Override
	public void update(Comment comment) {
		// TODO 自动生成的方法存根
		commentDao.update(comment);
	}

	@Override
	public Comment find(Serializable id) {
		// TODO 自动生成的方法存根
		return commentDao.find(id);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		commentDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		commentDao.delete(ids);
	}

	@Override
	public QueryResult<Comment> getScrollCommentData(int firstindex,
			int maxresult,Integer productId,
			Boolean visible, Integer userId) {
		// TODO 自动生成的方法存根
		StringBuffer jpql = new StringBuffer();
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("id", "desc");
		if(visible==null){
			jpql.append(" o.visible = true ");
		}else {
			jpql.append(" o.visible = ?"+(params.size()+1));
			params.add(visible);
		}
		if(productId!=null&&productId>0){
			jpql.append(" and o.product.id = ?"+(params.size()+1));
			params.add(productId);
		}
		if(userId!=null&&userId>0){
			jpql.append(" and o.user.id = ?"+(params.size()+1));
			params.add(userId);
		}
		return commentDao.getScrollData(firstindex, maxresult,jpql.toString(),params.toArray(), orderby);
	}
	
}

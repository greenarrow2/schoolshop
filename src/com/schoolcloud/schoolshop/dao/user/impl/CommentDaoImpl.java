package com.schoolcloud.schoolshop.dao.user.impl;
import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.user.CommentDao;
@Repository("commentDao")
public class CommentDaoImpl extends DAOSuport<Comment> implements CommentDao {

}

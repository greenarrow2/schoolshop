package com.schoolcloud.schoolshop.service.user.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.user.Favorite;
import com.schoolcloud.schoolshop.dao.user.FavoriteDao;
import com.schoolcloud.schoolshop.service.user.FavoriteService;
@Transactional
@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService{
	@Resource(name="favoriteDao")
    private FavoriteDao favoriteDao;
	
	public FavoriteDao getFavoriteDao() {
		return favoriteDao;
	}

	public void setFavoriteDao(FavoriteDao favoriteDao) {
		this.favoriteDao = favoriteDao;
	}

	@Override
	public void save(Favorite favorite) {
		// TODO 自动生成的方法存根
		favoriteDao.save(favorite);
	}

	@Override
	public void update(Favorite favorite) {
		// TODO 自动生成的方法存根
		favoriteDao.update(favorite);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		favoriteDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		favoriteDao.delete(ids);
	}

	@Override
	public QueryResult<Favorite> getScrollFavoriteData(Integer start,
			Integer limit, Integer userId) {
		// TODO 自动生成的方法存根
		StringBuffer jpql = new StringBuffer(" 1 = 1");
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderBy = new LinkedHashMap<String, String>();
		orderBy.put("id", "desc");
		if(userId!=null && userId>0){
			jpql.append(" and o.user.id = ?"+(params.size()+1));
		    params.add(userId);
		}
		return favoriteDao.getScrollData(start, limit, jpql.toString(), params.toArray(), orderBy);
	}

}

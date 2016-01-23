package com.schoolcloud.schoolshop.dao.user.impl;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.user.Favorite;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.user.FavoriteDao;
@Repository("favoriteDao")
public class FavoriteDaoImpl extends DAOSuport<Favorite> implements FavoriteDao {
}
package com.schoolcloud.schoolshop.dao.menu.impl;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.menu.Menu;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.menu.MenuDao;
@Repository("menuDao")
public class MenuDaoImpl extends DAOSuport<Menu> implements MenuDao{

}

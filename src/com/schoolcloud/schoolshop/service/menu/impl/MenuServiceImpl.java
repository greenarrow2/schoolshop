package com.schoolcloud.schoolshop.service.menu.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import com.schoolcloud.schoolshop.bean.menu.Menu;
import com.schoolcloud.schoolshop.bean.menu.TreeNode;
import com.schoolcloud.schoolshop.bean.menu.TreeResult;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.dao.menu.MenuDao;
import com.schoolcloud.schoolshop.service.menu.MenuService;
import com.schoolcloud.schoolshop.utils.MenuComparator;
@Service("menuService")
public class MenuServiceImpl implements MenuService {
@Resource(name="menuDao")
private MenuDao menuDao;

public MenuDao getMenuDao() {
	return menuDao;
}

public void setMenuDao(MenuDao menuDao) {
	this.menuDao = menuDao;
}

@Override
public void save(Menu Menu) {
	// TODO 自动生成的方法存根
	menuDao.save(Menu);
}

@Override
public void update(Menu Menu) {
	// TODO 自动生成的方法存根
	menuDao.update(Menu);
}

@Override
public void delete(Serializable id) {
	// TODO 自动生成的方法存根
	menuDao.delete(id);
}

@Override
public void delete(Serializable... ids) {
	// TODO 自动生成的方法存根
	menuDao.delete(ids);
}

@Override
public Menu find(Serializable MenuId) {
	// TODO 自动生成的方法存根
	return null;
}

@Override
public QueryResult<Menu> getScrollMenuData() {
	// TODO 自动生成的方法存根
	return menuDao.getScrollData();
}

@Override
public TreeResult getTreeList(QueryResult<Menu> qr) {
	// TODO 自动生成的方法存根
	TreeResult result = new TreeResult();
    List<TreeNode> treeList =  new ArrayList<TreeNode>();
    for (Menu menu : qr.getRows()) {
		treeList.add(deepTree(menu, true));
		
	}
    result.setChildren(treeList);
	return result;
}
/**
 *节点处理函数
 * @param menu 实体
 * @param recursive 是否要递归
 * @return
 */
private TreeNode deepTree(Menu menu, boolean recursive){
	TreeNode node = new TreeNode();
	node.setId(menu.getId());
	node.setText(menu.getName());
	node.setUrl(menu.getUrl());
	//设置节点图片
	if(menu.getIconcls()!=null||"".equals(menu.getIconcls())){
		node.setIconCls(node.getIconCls());
	}else {
		node.setIconCls("");
	}
	if(menu.getChildMenu() != null && menu.getChildMenu().size()>0){
		node.setExpanded(true);
		if(recursive){
			List<Menu> childTypes = new  ArrayList<Menu>(menu.getChildMenu());
			Collections.sort(childTypes,new MenuComparator());
			List<TreeNode> children = new ArrayList<TreeNode>();
			for (Menu r : childTypes) {
				TreeNode treeNode = deepTree(menu,true);
				children.add(treeNode);
			}
			node.setChildren(children);
		}
	}
	return node;
}

}

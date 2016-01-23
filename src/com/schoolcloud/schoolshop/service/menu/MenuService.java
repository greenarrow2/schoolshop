package com.schoolcloud.schoolshop.service.menu;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import com.schoolcloud.schoolshop.bean.menu.Menu;
import com.schoolcloud.schoolshop.bean.menu.TreeNode;
import com.schoolcloud.schoolshop.bean.menu.TreeResult;
import com.schoolcloud.schoolshop.bean.page.QueryResult;

public interface MenuService {
	/**
	 * 保存实体
	 * @param eniMenuy
	 */
	public void save(Menu Menu);
	/**
	 * 更新实体
	 * @param enMenuiMenuy
	 */
	public void update(Menu Menu);
	/**
	 * 删除实体
	 * @param id
	 */
	public  void delete(Serializable id);
	/**
	 * 按组删除实体
	 * @param ids
	 */
	public  void delete(Serializable...ids );
	/**
	 * 通过id得到一个实体
	 * @param enMenuiMenuyId
	 * @reMenuurn
	 */
	public Menu find(Serializable  MenuId);
	/**
	 * 分页显示的数据
	*/
	public TreeResult getTreeList(QueryResult<Menu> qr);
	

	public QueryResult<Menu> getScrollMenuData();
}

package com.schoolcloud.schoolshop.service.admin;

import java.io.Serializable;
import java.util.List;

import com.schoolcloud.schoolshop.bean.admin.Admin;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;

public interface AdminService {
	/**
	 * 保存实体
	 * @param eniProducty
	 */
	public void save(Admin admin);
	/**
	 * 更新实体
	 * @param enProductiProducty
	 */
	public void update(Admin admin);
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
      * 得到实体
      * @param id
      * @return
      */
	public Admin find(Serializable  id);
	
	public boolean isExistAdminByAdminName(String adminName);
	/**
	 * 分页查询admin
	 * @param start
	 * @param limit
	 * @param adminName
	 * @param realName
	 * @param orderType
	 * @return
	 */
	public QueryResult<Admin> getScrollAdminData(Integer start, Integer limit,Boolean visible,String adminName,String realName,String orderType); 
	
	public List<Admin> getAdmins();
}

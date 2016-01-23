package com.schoolcloud.schoolshop.service.admin.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.admin.Admin;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.dao.admin.AdminDao;
import com.schoolcloud.schoolshop.service.admin.AdminService;
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService{
	@Resource(name="adminDao")
    private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public void save(Admin admin) {
		// TODO 自动生成的方法存根
		adminDao.save(admin);
	}

	@Override
	public void update(Admin admin) {
		// TODO 自动生成的方法存根
		adminDao.update(admin);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		adminDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		adminDao.delete(ids);
	}

	@Override
	public Admin find(Serializable id) {
		// TODO 自动生成的方法存根
		return adminDao.find(id);
	}

	@Override
	public QueryResult<Admin> getScrollAdminData(Integer start, Integer limit,
			Boolean visible,String adminName, String realName, String orderType) {
		// TODO 自动生成的方法存根
	   StringBuffer jpql = new StringBuffer(" 1 = 1");
	   List<Object> params = new ArrayList<Object>();
	   LinkedHashMap<String, String> orderBy = new LinkedHashMap<String, String>();
	   if(orderType!=null){
		   orderBy.put("id", orderType);
	   }
	   if(visible!=null){
		   jpql.append(" and o.visible = ?"+(params.size()+1));
		   params.add(visible);
	   }
	   if(adminName!=null&&!"".equals(adminName.trim())){
		   jpql.append(" and o.adminName = ?"+(params.size()+1));
		   params.add(adminName);
	   }
	   if(realName!=null && !"".equals(realName.trim())){
		   jpql.append(" and o.realName = ?"+(params.size()+1));
		   params.add(realName);
	   }
		return adminDao.getScrollData(start, limit, jpql.toString(),params.toArray(),orderBy);
	}

	@Override
	public boolean isExistAdminByAdminName(String adminName) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(adminDao.findByAdminName(adminName)!=null){
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}

	@Override
	public List<Admin> getAdmins() {
		// TODO 自动生成的方法存根
		return adminDao.findAdmin2();
	}
	 
}

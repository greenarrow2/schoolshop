package com.schoolcloud.schoolshop.dao.admin.impl;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.io.input.ReversedLinesFileReader;
import org.hibernate.loader.custom.Return;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.admin.Admin;
import com.schoolcloud.schoolshop.dao.admin.AdminDao;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
/**
 * 管理员dao层
 * @author 长润
 *
 */
@Repository("adminDao")
@Transactional
public class AdminDaoImpl extends DAOSuport<Admin> implements AdminDao {

	@Override
	public String findByAdminName(String adminName) {
		// TODO 自动生成的方法存根
		String sql = "select o.adminName from Admin o where o.adminName = ?";
	Query query =	em.createNativeQuery(sql).setParameter(1, adminName);
	List<String> ans =  (List<String>) query.getResultList();
	if(ans!=null&&ans.size()>0){
		return ans.get(0);
	}
	 return null;
	}

	@Override
	public List<Admin> findAdmin() {
		// TODO 自动生成的方法存根
		String sql = "select o.adminName,o.password from Admin o";
		Query query =	em.createNativeQuery(sql);
		List<Object> ans =  (List<Object>) query.getResultList();
		  List<Admin> admins = new ArrayList<Admin>();
		  for (Object o : ans) {
			Object[] os = (Object[]) o;
			Admin admin = new Admin();
			admin.setAdminName(os[0].toString());
			admin.setPassword(os[1].toString());
			admins.add(admin);
 		}
		return admins;
	}
	@Override
	public List<String> findAdmin1() {
		// TODO 自动生成的方法存根
		String sql = "select o.adminName from Admin o";
		Query query =	em.createNativeQuery(sql);
		List<String> ans =  (List<String>) query.getResultList();
		return ans;
	}
	@Override
	public List<Admin> findAdmin2() {
		// TODO 自动生成的方法存根
		String sql = "select * from Admin o";
		Query query =	em.createNativeQuery(sql,Admin.class);
		List<Admin> ans =  (List<Admin>) query.setHint("org.hibernate.cacheable", true).getResultList();
		return ans;
	}
	@Override
	public List<Admin> findAdmin3() {
		// TODO 自动生成的方法存根
		String sql = "select o from Admin o";
		Query query =	em.createQuery(sql,Admin.class);
		List<Admin> ans =  (List<Admin>) query.getResultList();
		return ans;
	}
	@Override
	public List<Admin> findAdmin4() {
		// TODO 自动生成的方法存根
		String sql = "select o.adminName,o.password from Admin o";
		Query query =	em.createQuery(sql);
		List<Object> ans =  (List<Object>) query.getResultList();
		  List<Admin> admins = new ArrayList<Admin>();
		  for (Object o : ans) {
			Object[] os = (Object[]) o;
			Admin admin = new Admin();
			admin.setAdminName(os[0].toString());
			admin.setPassword(os[1].toString());
			admins.add(admin);
		}
		return admins;
	}

	@Override
	public List<String> findAdmin5() {
		// TODO 自动生成的方法存根
		String sql = "select o.adminName from Admin o";
		Query query =	em.createQuery(sql);
		List<String> ans =  (List<String>) query.getResultList();
		return ans;
	}
	
	public Admin findAdmin6(Integer id) {
		// TODO 自动生成的方法存根
		String sql = "select o from Admin o where o.id = ?1";
		Query query =	em.createQuery(sql).setParameter(1,id);
	    List<Admin> admins =    query.getResultList();
	    System.out.println(admins.size());
	    if (admins.size()>0) {
	    	return admins.get(0);
		}else {
			return null;
		}
	}
}

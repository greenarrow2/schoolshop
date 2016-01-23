package com.schoolcloud.schoolshop.dao.school.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.school.School;
import com.schoolcloud.schoolshop.bean.school.YuanXi;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.school.YuanXiDao;
@Repository("yuanXiDao")
public class YuanXiDaoImpl extends DAOSuport<YuanXi> implements YuanXiDao {

	@Override
	public boolean isExistYuanXiByYuanXiName(String yuanXiName) {
		// TODO 自动生成的方法存根
		String jpql = "select o from YuanXi o where o.yuanXiName = ?1";
	 Query query =	em.createQuery(jpql).setParameter(1, yuanXiName);
	 @SuppressWarnings("unchecked")
	List<School> schools = query.getResultList();
	 if(schools!=null&&schools.size()>0){
		 return true;
	 }
		return false;
	}
	
}

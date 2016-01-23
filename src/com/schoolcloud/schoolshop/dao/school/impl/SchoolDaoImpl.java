package com.schoolcloud.schoolshop.dao.school.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.school.School;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.school.SchoolDao;
@Repository("schoolDao")
@Transactional
public class SchoolDaoImpl extends DAOSuport<School> implements SchoolDao{

	@Override
	public boolean isExistSchoolBySchoolName(String schoolName) {
		// TODO 自动生成的方法存根
		String jpql = "select o from School o where o.schoolName = ?1";
	 Query query =	em.createQuery(jpql).setParameter(1, schoolName);
	 @SuppressWarnings("unchecked")
	List<School> schools = query.getResultList();
	 if(schools!=null&&schools.size()>0){
		 return true;
	 }
		return false;
	}

}

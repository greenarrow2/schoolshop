package com.schoolcloud.schoolshop.dao.school;

import com.schoolcloud.schoolshop.bean.school.School;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface SchoolDao extends DAO<School>{
	/**
	 * 是否存在该学校
	 * @param schoolName 
	 * @return
	 */
public boolean isExistSchoolBySchoolName(String schoolName);
}

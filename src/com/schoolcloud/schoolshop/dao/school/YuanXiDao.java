package com.schoolcloud.schoolshop.dao.school;

import com.schoolcloud.schoolshop.bean.school.YuanXi;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface YuanXiDao extends DAO<YuanXi>{
	/**
	 * 是否存在该学校
	 * @param schoolName 
	 * @return
	 */
public boolean isExistYuanXiByYuanXiName(String yuanXiName);
}

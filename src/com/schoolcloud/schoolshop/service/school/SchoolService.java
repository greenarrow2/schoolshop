package com.schoolcloud.schoolshop.service.school;

import java.io.Serializable;
import java.util.List;

import com.schoolcloud.schoolshop.bean.admin.Admin;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.school.School;

public interface SchoolService {

	/**
	 * 保存实体
	 * @param eniProducty
	 */
	public void save(School school);
	/**
	 * 更新实体
	 * @param enProductiProducty
	 */
	public void update(School school);
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
	public School find(Serializable  id);
	/**
	 * 是否已经存在该学校
	 * @param schoolName
	 * @return
	 */
	public boolean isExistSchoolBySchoolName(String schoolName);
	/**
	 * 分页查询admin
	 * @param start
	 * @param limit
	 * @param adminName
	 * @param realName
	 * @param orderType
	 * @return
	 */
	public QueryResult<School> getScrollSchoolData(Integer start, Integer limit,Boolean visible,String schoolName,String schoolAddress,String orderType); 
	
	public QueryResult<School> getScrollSchoolDataCache(Integer start, Integer limit,Boolean visible,String schoolName,String schoolAddress,String orderType); 
}

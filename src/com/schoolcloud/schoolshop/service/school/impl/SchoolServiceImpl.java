package com.schoolcloud.schoolshop.service.school.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.school.School;
import com.schoolcloud.schoolshop.dao.school.SchoolDao;
import com.schoolcloud.schoolshop.service.school.SchoolService;
/**
 * school服务层
 * @author 长润
 *
 */
@Service("schoolService")
@Transactional
public class SchoolServiceImpl implements SchoolService{
   @Resource(name="schoolDao")
   private SchoolDao schoolDao;
   
	public SchoolDao getSchoolDao() {
	return schoolDao;
}

public void setSchoolDao(SchoolDao schoolDao) {
	this.schoolDao = schoolDao;
}

	@Override
	public void save(School school) {
		// TODO 自动生成的方法存根
		schoolDao.save(school);
	}

	@Override
	public void update(School school) {
		// TODO 自动生成的方法存根
		schoolDao.update(school);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		schoolDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		schoolDao.delete(ids);
	}

	@Override
	public School find(Serializable id) {
		// TODO 自动生成的方法存根
		return schoolDao.find(id);
	}

	@Override
	public boolean isExistSchoolBySchoolName(String schoolName) {
		// TODO 自动生成的方法存根
		return schoolDao.isExistSchoolBySchoolName(schoolName);
	}

	@Override
	public QueryResult<School> getScrollSchoolData(Integer start, Integer limit,
			Boolean visible, String schoolName,String schoolAddress,String orderType) {
		// TODO 自动生成的方法存根
		StringBuffer jpql = new StringBuffer(" 1 = 1 ");
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		 
		orderby.put("id",orderType);
		if(visible!=null && !"".equals(visible)){
			jpql.append(" and o.visible = ?" + (params.size()+1));
			params.add(visible);
		}
		if(schoolName!=null&&!"".equals(schoolName)){
			jpql.append(" and o.schoolName like ?" + (params.size()+1));
			params.add("%" + schoolName + "%");
		}
		if(schoolAddress!=null&&!"".equals(schoolAddress)){
			jpql.append(" and o.schoolAddress like ?" + (params.size()+1));
			params.add("%" + schoolAddress + "%");
		}
		QueryResult<School> qr = schoolDao.getScrollData(start, limit, jpql.toString(), params.toArray(), orderby);
		return qr;
	}

	@Override
	public QueryResult<School> getScrollSchoolDataCache(Integer start,
			Integer limit, Boolean visible, String schoolName,String schoolAddress, String orderType) {
		// TODO 自动生成的方法存根
		StringBuffer jpql = new StringBuffer(" 1 = 1 ");
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		 
		orderby.put("id",orderType);
		if(visible!=null && !"".equals(visible)){
			jpql.append(" and o.visible = ?" + (params.size()+1));
			params.add(visible);
		}
		if(schoolName!=null&&!"".equals(schoolName)){
			jpql.append(" and o.schoolName like ?" + (params.size()+1));
			params.add("%" + schoolName + "%");
		}
		if(schoolAddress!=null&&!"".equals(schoolAddress)){
			jpql.append(" and o.schoolAddress like ?" + (params.size()+1));
			params.add("%" + schoolAddress + "%");
		}
		QueryResult<School> qr = schoolDao.getScrollDataCache(start, limit, jpql.toString(), params.toArray(), orderby);
		return qr;
	}

}

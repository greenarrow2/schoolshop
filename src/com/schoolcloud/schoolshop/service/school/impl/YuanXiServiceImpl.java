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
import com.schoolcloud.schoolshop.bean.school.YuanXi;
import com.schoolcloud.schoolshop.dao.school.YuanXiDao;
import com.schoolcloud.schoolshop.service.school.YuanXiService;
@Service("yuanXiService")
@Transactional
public class YuanXiServiceImpl implements YuanXiService {
	@Resource(name="yuanXiDao")
	private YuanXiDao yuanXiDao;

	public YuanXiDao getYuanXiDao() {
		return yuanXiDao;
	}

	public void setYuanXiDao(YuanXiDao yuanXiDao) {
		this.yuanXiDao = yuanXiDao;
	}

	@Override
	public void save(YuanXi yuanXi) {
		// TODO 自动生成的方法存根
		yuanXiDao.save(yuanXi);
	}

	@Override
	public void update(YuanXi yuanXi) {
		// TODO 自动生成的方法存根
		yuanXiDao.update(yuanXi);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		yuanXiDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		yuanXiDao.delete(ids);
	}

	@Override
	public YuanXi find(Serializable id) {
		// TODO 自动生成的方法存根
		return yuanXiDao.find(id);
	}

	@Override
	public boolean isExistYuanXiByYuanXiName(String yuanXiName) {
		// TODO 自动生成的方法存根
		return yuanXiDao.isExistYuanXiByYuanXiName(yuanXiName);
	}

	@Override
	public QueryResult<YuanXi> getScrollYuanXiData(Integer start,
			Integer limit, Boolean visible, String yuanXiName,
			 String orderType) {
		// TODO 自动生成的方法存根
		StringBuffer jpql = new StringBuffer(" 1 = 1 ");
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		 
		orderby.put("id",orderType);
		if(visible!=null && !"".equals(visible)){
			jpql.append(" and o.visible = ?" + (params.size()+1));
			params.add(visible);
		}
		if(yuanXiName!=null&&!"".equals(yuanXiName)){
			jpql.append(" and o.yuanXiName like ?" + (params.size()+1));
			params.add("%" + yuanXiName + "%");
		}
		QueryResult<YuanXi> qr = yuanXiDao.getScrollData(start, limit, jpql.toString(), params.toArray(), orderby);
		return qr;
	}

	@Override
	public QueryResult<YuanXi> getScrollYuanXiDataCache(Integer start,
			Integer limit, Boolean visible, String yuanXiName,
			 String orderType) {
		// TODO 自动生成的方法存根
		StringBuffer jpql = new StringBuffer(" 1 = 1 ");
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		 
		orderby.put("id",orderType);
		if(visible!=null && !"".equals(visible)){
			jpql.append(" and o.visible = ?" + (params.size()+1));
			params.add(visible);
		}
		if(yuanXiName!=null&&!"".equals(yuanXiName)){
			jpql.append(" and o.yuanXiName like ?" + (params.size()+1));
			params.add("%" + yuanXiName + "%");
		}
		QueryResult<YuanXi> qr = yuanXiDao.getScrollDataCache(start, limit, jpql.toString(), params.toArray(), orderby);
		return qr;
	}

}

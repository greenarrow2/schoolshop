package com.schoolcloud.schoolshop.service.product.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Brand;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.dao.product.BrandDao;
import com.schoolcloud.schoolshop.service.product.BrandService;
@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService {
@Resource(name="brandDao")
private BrandDao brandDao;

public BrandDao getBrandDao() {
	return brandDao;
}

public void setBrandDao(BrandDao brandDao) {
	this.brandDao = brandDao;
}

@Override
public void save(Brand brand) {
	// TODO 自动生成的方法存根
	brandDao.save(brand);
}

@Override
public void update(Brand brand) {
	// TODO 自动生成的方法存根
	brandDao.update(brand);
}

@Override
public void delete(Serializable id) {
	// TODO 自动生成的方法存根
	brandDao.delete(id);
}

@Override
public void delete(Serializable... ids) {
	// TODO 自动生成的方法存根
	brandDao.delete(ids);
}

@Override
public QueryResult<Brand> getScrollBrandData(Integer firstindex, Integer maxresult) {
	// TODO 自动生成的方法存根
	return brandDao.getScrollData(firstindex, maxresult);
}

@Override
public QueryResult<Brand> getScrollBrandData() {
	// TODO 自动生成的方法存根
	return brandDao.getScrollData();
}

@Override
public QueryResult<Brand> getScrollBrandData(String brandName,
		String createTime, String updateTime, String company, String address,
		Integer grade,Boolean visible, String sort,Integer sortType, Integer start, Integer limit) {
	// TODO 自动生成的方法存根
	StringBuffer jpql = new StringBuffer(" 1 = 1 ");
	List<Object> params = new ArrayList<Object>();
	LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
	if(sortType!=null){
		if(sort!=null){
	orderby.put(sort, sortType==1?"asc":"desc");
		}else {
			orderby.put("id", sortType==1?"asc":"desc");
		}
	}else {
		if(sort!=null){
		orderby.put(sort,"asc");
		}else {
			orderby.put("id","asc");
		}
	}
	if(visible!=null && !"".equals(visible)){
	jpql.append(" and o.visible = ?" + (params.size())+1);
	params.add(visible);
	}
	if(brandName!=null&&!"".equals(brandName)){
		jpql.append(" and o.brandName like ?" + (params.size()+1));
		params.add("%" + brandName + "%");
	}
	if(createTime!=null&&!"".equals(createTime)){
		jpql.append(" and o.createTime like ?" + (params.size()+1));
		params.add("%" + createTime + "%");
	}
	if(updateTime!=null&&!"".equals(updateTime)){
		jpql.append(" and o.updateTime like ?" + (params.size()+1));
		params.add("%" + updateTime + "%");
	}
	if(company!=null&&!"".equals(company)){
		jpql.append(" and o.company like ?" + (params.size()+1));
		params.add("%" + company + "%");
	}
	if(address!=null&&!"".equals(address)){
		jpql.append(" and o.address like ?" + (params.size()+1));
		params.add("%" + address + "%");
	}
	if(grade!=null){
		jpql.append(" and o.grade like ?" + (params.size()+1));
		params.add("%" + grade + "%");
	}
	return brandDao.getScrollData(start, limit, jpql.toString(), params.toArray(), orderby);
}

@Override
public QueryResult<Brand> getScrollBrandData(String brandName,
		String createTime, String updateTime, String company, String address,
		Integer grade,Boolean visible, Integer start, Integer limit) {
	// TODO 自动生成的方法存根
	StringBuffer jpql = new StringBuffer(" 1 = 1 ");
	List<Object> params = new ArrayList<Object>();
	if(visible!=null || "".equals(visible)){
		jpql.append(" and o.visible = ?" + (params.size()+1));
		params.add(visible);
		}
		if(brandName!=null&&!"".equals(brandName)){
			jpql.append(" and o.brandName like ?" + (params.size()+1));
			params.add("%" + brandName + "%");
		}
		if(createTime!=null&&!"".equals(createTime)){
			jpql.append(" and o.createTime like ?" + (params.size()+1));
			params.add("%" + createTime + "%");
		}
		if(updateTime!=null&&!"".equals(updateTime)){
			jpql.append(" and o.updateTime like ?" + (params.size()+1));
			params.add("%" + updateTime + "%");
		}
		if(company!=null&&!"".equals(company)){
			jpql.append(" and o.company like ?" + (params.size()+1));
			params.add("%" + company + "%");
		}
		if(address!=null&&!"".equals(address)){
			jpql.append(" and o.address like ?" + (params.size()+1));
			params.add("%" + address + "%");
		}
		if(grade!=null){
			jpql.append(" and o.grade like ?" + (params.size()+1));
			params.add("%" + grade + "%");
		}
	return brandDao.getScrollData(start, limit, jpql.toString(), params.toArray());
}

@Override
public QueryResult<Brand> getScrollBrandData(Integer firstindex, Integer maxresult,
		String sort,Integer sortType) {
	// TODO 自动生成的方法存根
	LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
	if(sortType!=null){
	orderby.put(sort, sortType==1?"asc":"desc");
	}else {
		orderby.put(sort,"asc");
	}
	return brandDao.getScrollData(firstindex, maxresult, orderby);
}

@Override
public Brand find(Serializable id) {
	// TODO 自动生成的方法存根
	return brandDao.find(id);
}

@Override
public List<Brand> getBrandList() {
	// TODO 自动生成的方法存根
	return brandDao.getBrandList();
}

}

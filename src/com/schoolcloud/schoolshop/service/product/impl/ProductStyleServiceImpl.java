package com.schoolcloud.schoolshop.service.product.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.dao.product.ProductStyleDao;
import com.schoolcloud.schoolshop.service.product.ProductStyleService;
@Service("productStyleService")
@Transactional
public class ProductStyleServiceImpl implements ProductStyleService {
   @Resource(name="productStyleDao")
   private ProductStyleDao productStyleDao;
	
	public ProductStyleDao getProductStyleDao() {
		return productStyleDao;
	}

	public void setProductStyleDao(ProductStyleDao productStyleDao) {
		this.productStyleDao = productStyleDao;
	}

	@Override
	public void save(ProductStyle productStyle) {
		// TODO 自动生成的方法存根
		productStyleDao.save(productStyle);
	}

	@Override
	public void update(ProductStyle productStyle) {
		// TODO 自动生成的方法存根
		productStyleDao.update(productStyle);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		productStyleDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		productStyleDao.delete(ids);
	}

	@Override
	public ProductStyle find(Serializable id) {
		// TODO 自动生成的方法存根
		return productStyleDao.find(id);
	}

	@Override
	public QueryResult<ProductStyle> getScrollProductStyleData() {
		// TODO 自动生成的方法存根
		return productStyleDao.getScrollData();
	}

	@Override
	public QueryResult<ProductStyle> getScrollProductStyleData(
			Integer start, Integer limit,String name,String productName,Integer timeType,String beginTime,String endTime,Boolean visible
			) {
		// TODO 自动生成的方法存根
		StringBuffer jpql = new StringBuffer("1=1");
		List<Object> params = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("id", "desc");
		if(visible!=null){
			jpql.append(" and o.visible = ?"+(params.size()+1));
			params.add(visible);
		}
		if(name!=null && !"".equals(name)){
			jpql.append(" and o.name = ?"+(params.size()+1));
			params.add(name);
		}
		if(productName!=null && !"".equals(productName)){
			jpql.append(" and o.product.productName = ?"+(params.size()+1));
			params.add(productName);
		}
		if(timeType !=null){
			if(timeType==1){
				if(beginTime!=null&&!"".equals(beginTime)){
					jpql.append(" and o.createTime > ?" + (params.size()+1));
					params.add(beginTime);
				}
				if(endTime!=null&&!"".equals(endTime)){
					jpql.append(" and o.createTime < ?" + (params.size()+1));
					params.add(endTime);
				}}
			if (timeType==2) {
				if(beginTime!=null&&!"".equals(beginTime)){
					jpql.append(" and o.updateTime > ?" + (params.size()+1));
					params.add(beginTime);
				}
				if(endTime!=null&&!"".equals(endTime)){
					jpql.append(" and o.updateTime < ?" + (params.size()+1));
					params.add(endTime);
				}
			}
		}
		return productStyleDao.getScrollData(start, limit,jpql.toString(),params.toArray(),orderby);
	}

}

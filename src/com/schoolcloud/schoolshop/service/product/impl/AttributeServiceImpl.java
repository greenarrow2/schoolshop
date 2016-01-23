package com.schoolcloud.schoolshop.service.product.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Attribute;
import com.schoolcloud.schoolshop.dao.product.AttributeDao;
import com.schoolcloud.schoolshop.service.product.AttributeService;
/**
 * 属性的服务层
 * @author 长润
 *
 */
@Service("attributeService")
@Transactional
public class AttributeServiceImpl implements AttributeService{
@Resource(name="attributeDao")
private AttributeDao attributeDao;

public AttributeDao getAttributeDao() {
	return attributeDao;
}

public void setAttributeDao(AttributeDao attributeDao) {
	this.attributeDao = attributeDao;
}

@Override
public void save(Attribute attribute) {
	// TODO 自动生成的方法存根
   attributeDao.save(attribute);
}

@Override
public void update(Attribute attribute) {
	// TODO 自动生成的方法存根
	attributeDao.update(attribute);
}

@Override
public void delete(Serializable id) {
	// TODO 自动生成的方法存根
	attributeDao.delete(id);
}

@Override
public void delete(Serializable... ids) {
	// TODO 自动生成的方法存根
	attributeDao.delete(ids);
}

@Override
public QueryResult<Attribute> getScrollAttributeData(Integer start,
		Integer limit,Integer genreId) {
	// TODO 自动生成的方法存根
	StringBuffer jpql = new StringBuffer(" 1 = 1 ");
	List<Object> params = new ArrayList<Object>();
	if(genreId!=null && genreId>=0){
		jpql.append(" and o.productGenre.id = ?" + (params.size()+1));
		params.add(genreId);
		}
	return attributeDao.getScrollData(start, limit,jpql.toString(),params.toArray());
}

}

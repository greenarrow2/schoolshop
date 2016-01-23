package com.schoolcloud.schoolshop.dao.product.impl;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.product.ProductStyleDao;
@Repository("productStyleDao")
public class ProductStyleDaoImpl extends DAOSuport<ProductStyle> implements
		ProductStyleDao {
    public static final Logger log = Logger.getLogger(ProductStyleDaoImpl.class);
	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		String sql = "DELETE  FROM productstyle WHERE id = ?";
		em.createNativeQuery(sql).setParameter(1, id).executeUpdate();
	}

	@Override
	public void deleteByProductId(Serializable id) {
		// TODO 自动生成的方法存根
		String sql = "DELETE  FROM productstyle WHERE productid = ?";
	  int flag =	em.createNativeQuery(sql).setParameter(1, id).executeUpdate();
	  log.info(flag);
		
	}
	
}

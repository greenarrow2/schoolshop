package com.schoolcloud.schoolshop.dao.product.impl;
import org.springframework.stereotype.Repository;

import com.schoolcloud.schoolshop.bean.product.Attribute;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.product.AttributeDao;
@Repository("attributeDao")
public class AttributeDaoImpl extends DAOSuport<Attribute> implements AttributeDao {
}

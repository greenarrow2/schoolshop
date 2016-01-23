package com.schoolcloud.schoolshop.dao.product.impl;
import org.springframework.stereotype.Repository;
import com.schoolcloud.schoolshop.bean.product.ProductExtra;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.product.ProductExtraDao;
@Repository("productExtraDao")
public class ProductExtraDaoImpl extends DAOSuport<ProductExtra> implements
		ProductExtraDao {
}

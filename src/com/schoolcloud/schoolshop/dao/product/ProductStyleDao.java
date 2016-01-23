package com.schoolcloud.schoolshop.dao.product;

import java.io.Serializable;

import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface ProductStyleDao extends DAO<ProductStyle>{
  public void deleteByProductId(Serializable id);
}

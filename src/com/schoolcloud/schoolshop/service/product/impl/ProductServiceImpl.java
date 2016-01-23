package com.schoolcloud.schoolshop.service.product.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductExtra;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.dao.product.ProductDao;
import com.schoolcloud.schoolshop.dao.product.ProductExtraDao;
import com.schoolcloud.schoolshop.dao.product.ProductStyleDao;
import com.schoolcloud.schoolshop.dao.product.ProductTypeDao;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;
@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	@Resource(name="productDao")
	private ProductDao productDao;
	@Resource(name="productExtraDao")
	private ProductExtraDao productExtraDao;
	@Resource(name="productTypeDao")
	private ProductTypeDao productTypeDao;
	@Resource(name="productStyleDao")
    private ProductStyleDao productStyleDao;
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public ProductExtraDao getProductExtraDao() {
		return productExtraDao;
	}

	public void setProductExtraDao(ProductExtraDao productExtraDao) {
		this.productExtraDao = productExtraDao;
	}

	public ProductTypeDao getProductTypeDao() {
		return productTypeDao;
	}

	public void setProductTypeDao(ProductTypeDao productTypeDao) {
		this.productTypeDao = productTypeDao;
	}
    
	public ProductStyleDao getProductStyleDao() {
		return productStyleDao;
	}

	public void setProductStyleDao(ProductStyleDao productStyleDao) {
		this.productStyleDao = productStyleDao;
	}

	public void save(Product product) {
		// TODO 自动生成的方法存根
		productDao.save(product);
	}

	@Override
	public void update(Product product) {
		// TODO 自动生成的方法存根
		productDao.update(product);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		productStyleDao.deleteByProductId(id);
		productDao.delete(id);
		
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		productDao.delete(ids);
	}

	@Override
	public Product find(Serializable productId) {
		// TODO 自动生成的方法存根
		return productDao.find(productId);
	}


	@Override
	public Product findLastOrProduct(Serializable productId) {
		// TODO 自动生成的方法存根
		return productDao.getLastOrProduct(productId);
	}

	@Override
	public void addTypeAttrs(String[] attributeName, String[] attributeValue,
			Integer typeId, Integer productId) {
		// TODO 自动生成的方法存根
		ProductType productType = productTypeDao.find(typeId);
		Product product = productDao.getLastOrProduct(productId);
		product.setProductType(productType);
		productDao.update(product);
		if(attributeName!=null){
			for (int i = 0; i < attributeName.length; i++) {
				ProductExtra productExtra = new ProductExtra();
				productExtra.setExtraName(attributeName[i]);
				productExtra.setExtraValue(attributeValue[i]);
				productExtra.setProduct(product);
				productExtraDao.save(productExtra);
			}
		}
	}

	@Override
	public QueryResult<Product> getScrollProductData(Integer start,
			Integer limit, String productName, Boolean visible,
			String beginTime, String endTime,Integer timeType, Integer recommendRank,
			Integer mark, Integer productTypeId, String sort, Integer sortType,Boolean isCache) {
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
				orderby.put("id","desc");
			}
		}
		if(visible!=null && !"".equals(visible)){
			jpql.append(" and o.visible = ?" + (params.size()+1));
			params.add(visible);
		}
		if(productName!=null&&!"".equals(productName)){
			jpql.append(" and o.productName like ?" + (params.size()+1));
			params.add("%" + productName + "%");
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
		if(recommendRank!=null){
			jpql.append(" and o.recommendRank = ?" + (params.size()+1));
			params.add(recommendRank);
		}
		if(mark!=null&&mark!=-1){
			jpql.append(" and o.mark = ?" + (params.size()+1));
			params.add(mark);
		}
		if(productTypeId!=null){
			jpql.append(" and o.productType.id = ?" + (params.size()+1));
			params.add(productTypeId);
		}
		QueryResult<Product> qr;
		if(isCache){
			qr = productDao.getScrollProductDataCache(start, limit, jpql.toString(), params.toArray(), orderby);
		}else {
			qr = productDao.getScrollData(start, limit, jpql.toString(), params.toArray(), orderby);
		}
		return qr;
	}

	@Override
	public List<Product> getProductListByOneType(Serializable id) {
		// TODO 自动生成的方法存根
		ProductType productType = productTypeDao.find(id);
		if(productType!=null){
			if(productType.getChildren()!=null&& productType.getChildren().size()>0){
				for (ProductType pt : productType.getChildren()) {
					if(pt.getChildren()!=null&&pt.getChildren().size()>0){
						return productDao.getProductListByOneType(id);
					}
				}
			}
		}
		return null;
	}

	@Override
	public boolean isExist(String productName) {
		// TODO 自动生成的方法存根
		return productDao.isExist(productName);
	}

	@Override
	public List<Product> queryProductByMark(Integer start, Integer limit,
			Integer mark) {
		// TODO 自动生成的方法存根
		return productDao.queryProductByMark(start, limit, mark);
	}

	@Override
	public QueryResult<Product> getProductListByTwoType(Integer id,Integer start,Integer limit) {
		StringBuilder jpql = new StringBuilder(" visible = true ");
		List<Object> params = new ArrayList<Object>();
		if(id!=null&&id>0){
			jpql.append(" and o.productType.parent.id = ?"+(params.size()+1));
			params.add(id);
		}
		 
		return productDao.getScrollData(start, limit, jpql.toString(),params.toArray());
	}
	@Override
	public QueryResult<Product> getProductListByOneType(Integer id,Integer start,Integer limit) {
		StringBuilder jpql = new StringBuilder(" visible = true ");
		List<Object> params = new ArrayList<Object>();
		if(id!=null&&id>0){
			jpql.append(" and o.productType.parent.parent.id = ?"+(params.size()+1));
			params.add(id);
		}
		
		return productDao.getScrollData(start, limit, jpql.toString(),params.toArray());
	}

	@Override
	public QueryResult<Product> getProductListByThreeType(Integer id,
			Integer start, Integer limit) {
		StringBuilder jpql = new StringBuilder(" visible = true ");
		List<Object> params = new ArrayList<Object>();
		if(id!=null&&id>0){
			jpql.append(" and o.productType.id = ?"+(params.size()+1));
			params.add(id);
		}
		 
		return productDao.getScrollData(start, limit, jpql.toString(),params.toArray());
	}

}

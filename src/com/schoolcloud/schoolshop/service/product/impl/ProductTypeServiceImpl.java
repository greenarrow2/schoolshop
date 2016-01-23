package com.schoolcloud.schoolshop.service.product.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloud.schoolshop.bean.menu.TreeNode;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.dao.product.ProductDao;
import com.schoolcloud.schoolshop.dao.product.ProductTypeDao;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;
@Service("productTypeService")
@Transactional
public class ProductTypeServiceImpl implements ProductTypeService {
	@Resource(name="productTypeDao")
	private ProductTypeDao productTypeDao;
   
	public ProductTypeDao getProductTypeDao() {
		return productTypeDao;
	}

	public void setProductTypeDao(ProductTypeDao productTypeDao) {
		this.productTypeDao = productTypeDao;
	}

	@Override
	public void save(ProductType productType) {
		// TODO 自动生成的方法存根
		productTypeDao.save(productType);
	}

	@Override
	public void update(ProductType productType) {
		// TODO 自动生成的方法存根
		productTypeDao.update(productType);
	}

	@Override
	public void delete(Serializable id) {
		// TODO 自动生成的方法存根
		productTypeDao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO 自动生成的方法存根
		productTypeDao.delete(ids);
	}

	@Override
	public QueryResult<ProductType> getScrollProductTypeData(Integer start,
			Integer limit) {
		// TODO 自动生成的方法存根
		return productTypeDao.getScrollData(start, limit);
	}

	@Override
	public ProductType find(Serializable id) {
		// TODO 自动生成的方法存根
		return productTypeDao.find(id);
	}

	@Override
	public List<TreeNode> deepMenuById(QueryResult<ProductType> qr) {
		// TODO 自动生成的方法存根
List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		
		for (ProductType productType : qr.getRows())
		{
			treeNodes.add(deepTree(productType, true));
		}
		return treeNodes;
	}
    
	private TreeNode deepTree(ProductType productType,boolean recursive) {
		TreeNode node = new TreeNode();
		node.setId(productType.getId());
		node.setText(productType.getName());
		//Map<String, Object> attributes = new HashMap<String, Object>();
		if(productType.getChildren() != null && productType.getChildren().size()>0){
			node.setLeaf(false);
			//	判断该方法是否要递归调用。
			if (recursive) 
			{
				// 递归查询子节点
				List<ProductType> childtypes = new ArrayList<ProductType>(productType.getChildren());
				//	对子节点进行排序
				List<TreeNode> children = new ArrayList<TreeNode>();
				for (ProductType r : childtypes) 
				{
					TreeNode tn = deepTree(r, true);
					children.add(tn);
				}
				node.setChildren(children);
			}
		}
		return node;
	}

	@Override
	public List<ProductType> getProductTypes() {
		return productTypeDao.getProductTypes();
	}

	@Override
	public QueryResult<ProductType> getScrollProductTypeData() {
		return productTypeDao.getScrollData();
	}

	@Override
	public List<ProductType> getProductTypes(Integer parentId) {
		return productTypeDao.getProductTypes(parentId);
	}

	@Override
	public List<ProductType> getProductTwoType(Integer id) {
		return productTypeDao.getProductTwoType(id);
	}

	@Override
	public ProductType searchTypeInfo(Integer id) {
		return productTypeDao.find(id);
	}

	@Override
	public List<ProductType> getOneTypes() {
		return productTypeDao.getOneTypes();
	}

}

package com.schoolcloud.schoolshop.action.front;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.schoolcloud.schoolshop.bean.image.ImageHistory;
import com.schoolcloud.schoolshop.bean.image.StylePhoto;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;

public class BaseController {
	@Resource(name="productTypeService")
	private ProductTypeService productTypeService;
	@Resource(name="productService")
    private ProductService productService;
	
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * 得到所有的分类列表
	 * @return
	 */
	public void productType(HttpServletRequest request) {
		//商品分类
		List<ProductType> productTypeList =	productTypeService.getScrollProductTypeData().getRows();
		request.setAttribute("typeList", productTypeList);
	}
	/**
	 * 根据ID得到三级，二级，一级分类，根据二级分类得到所有三级分类
	 * @param id 商品ID
	 * @param request
	 */
	public void getProductTypeAndParentType(Integer id,HttpServletRequest request) {
		  Product product = productService.find(id);
		  ProductType productTypeThree =  product.getProductType();
	      ProductType productTypeTwo =	productTypeService.find(productTypeThree.getParent().getId());
	      ProductType productTypeOne =	productTypeService.find(productTypeTwo.getParent().getId());
	      List<ProductType> productTypes = new ArrayList<ProductType>();
	      productTypes.add(productTypeOne);
	      productTypes.add(productTypeTwo);
	      productTypes.add(productTypeThree);
	      request.setAttribute("productTypes", productTypes);
	     Set<ProductType> childTypes = productTypeTwo.getChildren();
	     request.setAttribute("childTypes", childTypes);
	}
	/**
	 * 得到商品的相册图片集
	 * @param product 商品对象
	 * @param request
	 */
	public void getProductPhotos(Product product,HttpServletRequest request){
		Set<ProductStyle> styles = product.getStyles();
		if(!styles.isEmpty()){
		for (ProductStyle productStyle : styles) {
			Set<StylePhoto> photos = productStyle.getStylePhotos();
			request.setAttribute("photos", photos);
			break;
		     }
		}
		request.setAttribute("styles", styles);
	}
}

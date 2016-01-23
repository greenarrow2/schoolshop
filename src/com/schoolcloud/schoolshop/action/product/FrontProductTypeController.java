package com.schoolcloud.schoolshop.action.product;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.schoolcloud.schoolshop.action.front.BaseController;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;
/**
 * 前端导航分类
 * @author 长润
 *
 */
@Controller
@RequestMapping("front/producttype")
public class FrontProductTypeController{
	@Resource(name="productTypeService")
	private ProductTypeService productTypeService;

	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}

	/**
	 * 分类列表
	 * @return
	 */
	@RequestMapping(value="productTypeList.htm")
	public  String productTypeList(HttpServletRequest request){
	List<ProductType> productTypeList =	productTypeService.getScrollProductTypeData().getRows();
	for (ProductType productType : productTypeList) {
		 if(productType.getChildren().size()>0){
			 productTypeList.remove(productType);
		 }
	}
	request.setAttribute("typeList", productTypeList);
		return "../../front/index";
	}
}

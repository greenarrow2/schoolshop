package com.schoolcloud.schoolshop.action.front;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.bean.result.ProductComment;
import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;

@Controller
@RequestMapping("front/main")
public class FrontMainController {
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

@RequestMapping(value="index.htm")
public String index(HttpServletRequest request) {
	//商品分类
	List<ProductType> productTypeList =	productTypeService.getScrollProductTypeData().getRows();
	//热销产品
	List<Product> hotProds = productService.queryProductByMark(0, 4, 2);
	//疯狂抢购
	List<Product> rushProducts = productService.queryProductByMark(0, 5, 1);
	//热卖产品
	List<Product> hotProducts = productService.queryProductByMark(0, 5, 2);
	//猜你喜欢
	List<Product> likeProducts = productService.queryProductByMark(0, 5, 4);
	//热评
	List<Product> buzzProducts = productService.queryProductByMark(0, 5, 5);
	//新品上架
	List<Product> newProducts = productService.queryProductByMark(0, 5, 6);
	request.setAttribute("typeList", productTypeList);
	request.setAttribute("rushProducts", rushProducts);
	request.setAttribute("hotProducts", hotProducts);
	request.setAttribute("hotProds", hotProds);
	request.setAttribute("likeProducts", likeProducts);
	request.setAttribute("buzzProducts", buzzProducts);
	request.setAttribute("newProducts", newProducts);
	
	//一楼的
	List<Product> oneProducts = productService.getProductListByOneType(1);
	List<Product> twoProducts = productService.getProductListByOneType(2);
	List<Product> threeProducts = productService.getProductListByOneType(3);
	List<Product> fourProducts = productService.getProductListByOneType(4);
	List<Product> fiveProducts = productService.getProductListByOneType(5);
	List<Product> sixProducts = productService.getProductListByOneType(6);
	List<Product> sevenProducts = productService.getProductListByOneType(7);
	request.setAttribute("oneProducts",oneProducts);
	request.setAttribute("twoProducts",twoProducts);
	request.setAttribute("threeProducts",threeProducts);
	request.setAttribute("fourProducts",fourProducts);
	request.setAttribute("fiveProducts",fiveProducts);
	request.setAttribute("sixProducts",sixProducts);
	request.setAttribute("sevenProducts",sevenProducts);
	/**得到二级分类*/
	request.setAttribute("productTwoType",productTypeService.getProductTwoType(1));
	/**获取热评商品及评价*/
	getProductAndComment(request);
	return "../../front/main/index";
}

protected void getProductAndComment(HttpServletRequest request) {
List<Product> products = productService.queryProductByMark(0, 4, 5);
List<ProductComment> productComments = new ArrayList<ProductComment>();
    for (Product product : products) {
    	ProductComment productComment = new ProductComment();
    	productComment.setProduct(product);
    	Set<Comment> comments = product.getComments();
    	for (Comment comment : comments) {
			 if(comment!=null)
				 productComment.setComment(comment);
			 break;
		}
    	productComments.add(productComment);
	}
    request.setAttribute("productComments", productComments);
}
}

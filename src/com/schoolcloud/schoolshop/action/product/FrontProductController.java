package com.schoolcloud.schoolshop.action.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.action.front.BaseController;
import com.schoolcloud.schoolshop.bean.page.PageView;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;
import com.schoolcloud.schoolshop.service.user.CommentService;
/**
 * 前端商品分页显示
 * @author 长润
 *
 */
@Controller
@RequestMapping("front/product")
public class FrontProductController extends BaseController{
	@Resource(name="productService")
	private ProductService productService;
	@Resource(name="productTypeService")
	private ProductTypeService productTypeService;
	@Resource(name="commentService")
	private CommentService commentService;
	
public CommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

@RequestMapping(value="productList.htm"/*,method=RequestMethod.POST*/)
public String productList(Integer start,Integer limit,String productName,Boolean visible,String beginTime,String endTime,Integer timeType, Integer recommendRank,Integer mark,Integer productTypeId,String sort,Integer sortType,HttpServletRequest request) {
	if(limit==null){
		limit = 12;
	}
	PageView<Product> pageView = new PageView<Product>(limit, start);
	QueryResult<Product> queryResult =	productService.getScrollProductData(start, limit, productName, visible, beginTime, endTime, timeType, recommendRank, mark, productTypeId, sort, sortType,true);
	pageView.setQueryResult(queryResult);
	request.setAttribute("productList", pageView);
	return "../front/main/index";
}
/**
 * 得到商品
 * @param id 商品id
 * @param request
 * @return
 */
@RequestMapping(value="getProduct.htm")
public String getProduct(Integer id,HttpServletRequest request) {
	
	
	Product product = productService.find(id);
	
	productType(request);
	getProductTypeAndParentType(id, request);
	getProductPhotos(product, request);
	request.setAttribute("product", product);
	PageView<Comment> pg = new PageView<Comment>(20, 1);
    QueryResult<Comment> comments =	commentService.getScrollCommentData(pg.getFirstResult(), pg.getMaxResult(), id, true, null);
	pg.setRecords(comments.getRows());
	pg.setTotalRecord(comments.getTotal());
	request.setAttribute("pg", pg);
	return "../../front/product/product";
}


/**
 * 得到一
 * @param id
 * @param request
 * @return
 */
@RequestMapping(value="getProductAndOneType.htm")
public String getProductAndOneType(Integer id,HttpServletRequest request){
    if(id!=null&&id>0){
      ProductType productTypeOne = productTypeService.find(id);
      List<ProductType> typeOnes =  productTypeService.getOneTypes();
      for (ProductType productType : typeOnes) {
  		if(productType.getId().equals(productTypeOne.getId())){
  			typeOnes.remove(productType);
  			break;
  		}
  	}
      request.setAttribute("productTypeOne", productTypeOne);
      request.setAttribute("typeOnes", typeOnes);
      
      QueryResult<Product>  queryResult = productService.getProductListByOneType(id,0,20);
      PageView<Product> pageView = new PageView<Product>();
      pageView.setRecords(queryResult.getRows());
      pageView.setTotalRecord(queryResult.getTotal());
      request.setAttribute("pg", pageView);
    } 
	return "../../front/product/productOneType";
}
/**
 * 
 * 得到商品评论
 * @param productId 商品id
 * @param currentPage 当前页面
 * @param request
 * @return
 */

public String getProductComments(Integer productId,Integer currentPage,HttpServletRequest request) {
	PageView<Comment> pg = new PageView<Comment>(20, currentPage);
	if(currentPage==null){
		currentPage = 1;
	}
    QueryResult<Comment> comments =	commentService.getScrollCommentData(pg.getFirstResult(), pg.getMaxResult(), productId, true, null);
	pg.setRecords(comments.getRows());
	pg.setTotalRecord(comments.getTotal());
	return "../../";
}
//得到一级分类信息、二级分类、三级分类及商品
@RequestMapping(value="getProductAndTwoType.htm")
public String getProductAndTwoType(Integer id,HttpServletRequest request){
    if(id!=null&&id>0){
      ProductType productTypeTwo  = productTypeService.find(id);
      ProductType productTypeOne = productTypeTwo.getParent();
      List<ProductType> types = new ArrayList<ProductType>();
      types.add(productTypeOne);
      types.add(productTypeTwo);
      Set<ProductType> typeTwos = productTypeOne.getChildren();
      if(typeTwos.contains(productTypeTwo)){
    	  typeTwos.remove(productTypeTwo);
      }
      request.setAttribute("typeTwo", productTypeTwo);
      request.setAttribute("types", types);
      request.setAttribute("typeTwos", typeTwos);
      PageView<Product> pageView = new PageView<Product>(20,1);
      QueryResult<Product>  queryResult = productService.getProductListByTwoType(id,pageView.getFirstResult(),pageView.getMaxResult());
      pageView.setRecords(queryResult.getRows());
      pageView.setTotalRecord(queryResult.getTotal());
      request.setAttribute("pg", pageView);
    } 
	return "../../front/product/productTwoType";
}

//得到一级分类信息、二级分类、三级分类及商品
@RequestMapping(value="getProductAndThreeType.htm")
public String getProductAndThreeType(Integer id,HttpServletRequest request){
  if(id!=null&&id>0){
    ProductType productTypeThree  = productTypeService.find(id);
    ProductType productTypeTwo = productTypeThree.getParent();
    ProductType productTypeOne = productTypeTwo.getParent();
    List<ProductType> types = new ArrayList<ProductType>();
    types.add(productTypeOne);
    types.add(productTypeTwo);
    types.add(productTypeThree);
    Set<ProductType> typeThrees = productTypeTwo.getChildren();
    if(typeThrees.contains(productTypeThree)){
    	typeThrees.remove(productTypeThree);
    }
    request.setAttribute("productTypeThree", productTypeThree);
    request.setAttribute("types", types);
    request.setAttribute("typeThrees", typeThrees);
    PageView<Product> pageView = new PageView<Product>(20,1);
    QueryResult<Product>  queryResult = productService.getProductListByThreeType(id,pageView.getFirstResult(),pageView.getMaxResult());
    pageView.setRecords(queryResult.getRows());
    pageView.setTotalRecord(queryResult.getTotal());
    request.setAttribute("pg", pageView);
  } 
	return "../../front/product/productTwoType";
}
@RequestMapping(value="getTwoTypeProduct.htm",method=RequestMethod.POST)
public String  getTwoTypeProduct(Integer id,Integer start,Integer limit,HttpServletRequest request) {
	 QueryResult<Product>  queryResult = productService.getProductListByTwoType(id,start,20);
	 PageView<Product> pageView = new PageView<Product>();
     pageView.setRecords(queryResult.getRows());
     pageView.setTotalRecord(queryResult.getTotal());
     pageView.setCurrentPage(start/20+1);
     request.setAttribute("pg", pageView);
     request.setAttribute("id", id);
	return "../../front/product/twoTypeProduct";
}
@RequestMapping(value="getOneTypeProduct.htm",method=RequestMethod.POST)
public String  getOneTypeProduct(Integer id,Integer start,Integer limit,HttpServletRequest request) {
	QueryResult<Product>  queryResult = productService.getProductListByOneType(id,start,20);
	PageView<Product> pageView = new PageView<Product>();
	pageView.setRecords(queryResult.getRows());
	pageView.setTotalRecord(queryResult.getTotal());
	pageView.setCurrentPage(start/20+1);
	request.setAttribute("pg", pageView);
	request.setAttribute("id", id);
	return "../../front/product/oneTypeProduct";
}
}

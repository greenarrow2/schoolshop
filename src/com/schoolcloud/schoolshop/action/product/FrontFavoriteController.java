package com.schoolcloud.schoolshop.action.product;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.page.PageView;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.user.Favorite;
import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.user.FavoriteService;
import com.schoolcloud.schoolshop.service.user.UserService;
/**
 * 前端用户收藏控制类对商品进行
 * 收藏，取消收藏，分页显示收藏列表
 * 商品收藏的数目
 * @author 长润
 *
 */
@Controller
@RequestMapping("front/favorite")
public class FrontFavoriteController {
  @Resource(name="favoriteService")
  private FavoriteService favoriteService;
  @Resource(name="productService")
  private ProductService productService;
  @Resource(name="userService")
  private UserService userService;
public FavoriteService getFavoriteService() {
	return favoriteService;
}

public void setFavoriteService(FavoriteService favoriteService) {
	this.favoriteService = favoriteService;
}

  public ProductService getProductService() {
	return productService;
}

public void setProductService(ProductService productService) {
	this.productService = productService;
}

public UserService getUserService() {
	return userService;
}

public void setUserService(UserService userService) {
	this.userService = userService;
}
/**
 * 收藏商品
 * @param userId
 * @param productId
 * @return
 */
@RequestMapping(value="saveFavorite.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult saveFavorite(Integer userId,Integer productId) {
	  DataResult result = new DataResult();
	  Product product = productService.find(productId);
	  User user = userService.find(userId);
	  Favorite favorite = new Favorite();
	  favorite.setProduct(product);
	  favorite.setUser(user);
	  favoriteService.save(favorite);
	  result.setSuccess(true);
	  result.setObj("收藏成功！");
	return result;
}
/**
 * 取消收藏商品
 * @param userId
 * @param productId
 * @return
 */
@RequestMapping(value="deleteFavorite.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult deleteFavorite(Integer favoriteId) {
	DataResult result = new DataResult();
	favoriteService.delete(favoriteId);
	result.setSuccess(true);
	result.setObj("收藏成功！");
	return result;
}
/**
 * 收藏商品列表
 * @param userId
 * @param productId
 * @return
 */
 
@RequestMapping(value="favoriteList.htm",method=RequestMethod.POST)
@ResponseBody
public String favoriteList(Integer start,Integer limit,HttpServletRequest request) {
	HttpSession session = request.getSession();
	User user =  (User) session.getAttribute("user");
	Integer userId = null;
	if(user!=null){
		userId = user.getId();
	}
	PageView<Favorite> pageView = new PageView<Favorite>(start, limit);
    QueryResult<Favorite> queryResult = favoriteService.getScrollFavoriteData(pageView.getFirstResult(), pageView.getMaxResult(),userId);
	pageView.setTotalPage(queryResult.getTotal());
	pageView.setRecords(queryResult.getRows());
	request.setAttribute("favoriteList", pageView);
	return "";
}

}

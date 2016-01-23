package com.schoolcloud.schoolshop.action.usercenter;

import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.schoolcloud.schoolshop.bean.book.OrderState;
import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.bean.page.PageView;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.bean.user.Favorite;
import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.bean.user.UserDeliverInfo;
import com.schoolcloud.schoolshop.service.book.OrderService;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.user.CommentService;
import com.schoolcloud.schoolshop.service.user.FavoriteService;
import com.schoolcloud.schoolshop.service.user.UserService;
import com.schoolcloud.schoolshop.utils.Utils;
@Controller
@RequestMapping("front/usercenter")
public class FrontUserCenterController {
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="orderService")
	private OrderService orderService;
	@Resource(name="favoriteService")
	private FavoriteService favoriteService;
	@Resource(name="commentService")
    private CommentService commentService;
	
	public CommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	public FavoriteService getFavoriteService() {
		return favoriteService;
	}

	public void setFavoriteService(FavoriteService favoriteService) {
		this.favoriteService = favoriteService;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Resource(name="productService")
	private ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	/**
	 * 查询个人中心随即推荐商品
	 * @param request
	 * @return
	 */
	@RequestMapping(value="center.htm")
	public String center(HttpServletRequest request) {
		Random rm = new Random();
		QueryResult<Product> qr;
		do {
			int num = rm.nextInt(10);  
			qr = productService.getScrollProductData(num, 8, null, true, null, null, null, null, null, null, null, null, false);
		} while(qr.getRows().size()==0);
		List<Product> products = qr.getRows();
		request.setAttribute("products", products);
		return "../../front/usercenter/center";
	}
	/**
	 * 得到所有订单
	 * @param orderType
	 * @param currentPage
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getAllOrder.htm")
	public String getAllOrder(String orderType,Integer currentPage,HttpServletRequest request) {
		User user =  (User) request.getSession().getAttribute("user");
		String beginTime = null;
		String endTime = null;
		if(orderType!=null&&orderType.equals("Today")){
			beginTime = Utils.date;
			System.out.println(beginTime);
		}
		if(currentPage==null){
			currentPage = 1; 
		}
		PageView<UserOrder> pg = new PageView<UserOrder>(10, currentPage);
		if(user!=null){
			QueryResult<UserOrder> qr = orderService.getScrollUserOrderData(pg.getFirstResult(), pg.getMaxResult(), user.getId(),null, null, null, null, beginTime, endTime, null);
			pg.setRecords(qr.getRows());	 
			pg.setTotalRecord(qr.getTotal());
			request.setAttribute("pg", pg);
			return "../../front/usercenter/userOrder";
		}else {
			return "../../front/user/login"; 	
		}

	}
    
	@RequestMapping(value="getAllFavorite.htm")
	public String getAllFavorite(Integer currentPage,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(currentPage==null){
			currentPage = 1; 
		}
		PageView<Favorite> pg = new PageView<Favorite>(20, currentPage);
		if(user!=null){
			QueryResult<Favorite> qr = favoriteService.getScrollFavoriteData(pg.getFirstResult(), pg.getMaxResult(), user.getId());
			pg.setRecords(qr.getRows());
			pg.setTotalRecord(qr.getTotal());
			request.setAttribute("pg", pg);
			return "../../front/usercenter/userFavorite";
		}else {
			return "../../front/user/login";
		}
	}
	/**
	 * 得到用户的所有地址
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getAllAddress.htm")
	public String getAllAddress(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		Set<UserDeliverInfo> udis = user.getUdis();
		request.setAttribute("udis", udis);
		return "../../front/usercenter/userAddress";
	}
	/**
	 * 得到用户的所有地址
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getUserInfo.htm")
	public String getUserInfo(HttpServletRequest request) {
		 
		return "../../front/usercenter/userInformation";
	}
	/**
	 * 得到所有评论
	 * @param productId
	 * @param currentPage
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getAllComment.htm")
	public String getAllComment(Integer productId,Integer currentPage,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(currentPage==null){
			currentPage = 1; 
		}
		PageView<Comment> pg = new PageView<Comment>(20, currentPage);
		if(user!=null){
			QueryResult<Comment> qr = commentService.getScrollCommentData(pg.getFirstResult(), pg.getMaxResult(), productId, true, user.getId());
			pg.setRecords(qr.getRows());
			pg.setTotalRecord(qr.getTotal());
			request.setAttribute("pg", pg);
			return "../../front/usercenter/userComment";
		}else {
			return "../../front/user/login";
		}
	}
	/**
	 *取消订单
	 * @param id
	 * @return
	 */
	@RequestMapping(value="cancleOrder.htm")
	public String cancleOrder(Integer id) {
		UserOrder userOrder = orderService.find(id);
		userOrder.setState(OrderState.CANCEL);
		orderService.update(userOrder);
		return "redirect:../../front/usercenter/getAllOrder.htm";
	}
	/**
	 * 重新添加订单
	 * @param id
	 * @return
	 */
	@RequestMapping(value="reDoOrder.htm")
	public String reDoOrder(Integer id) {
		UserOrder userOrder = orderService.find(id);
		userOrder.setState(OrderState.WAITDELIVER);
		orderService.update(userOrder);
		return "redirect:../../front/usercenter/getAllOrder.htm";
	}
}

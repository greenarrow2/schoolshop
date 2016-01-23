package com.schoolcloud.schoolshop.action.shopping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.shopping.BuyCart;
import com.schoolcloud.schoolshop.bean.shopping.BuyItem;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.product.ProductStyleService;
import com.schoolcloud.schoolshop.utils.WebUtil;

@Controller
@RequestMapping("front/shopping")
public class BuyCartController {
	@Resource(name="productService")
	private ProductService productService;
	@Resource(name="productStyleService")
	private ProductStyleService productStyleService;
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public ProductStyleService getProductStyleService() {
		return productStyleService;
	}

	public void setProductStyleService(ProductStyleService productStyleService) {
		this.productStyleService = productStyleService;
	}

	@RequestMapping(value="addCart.htm",method=RequestMethod.POST)
	public String  addCart(Integer productId,Integer styleId,Integer num,
			HttpServletRequest request,HttpServletResponse response) {
		//首先从当前的session中找到是否有购物车(主要是考虑到用户是否会打开一个新的窗口)
		BuyCart buyCart = (BuyCart)request.getSession().getAttribute("buycart");
		if(buyCart==null)
		{
			String sid = WebUtil.getCookieByName(request, "buyCartID");

			if(sid != null)
			{
				//取到的是以前的session
				HttpSession session = SiteSessionListenser.getSession(sid);

				if(session!=null)
				{
					buyCart = (BuyCart) session.getAttribute("buycart");

					if(buyCart!=null)
					{
						SiteSessionListenser.removeSession(sid);

						request.getSession().setAttribute("buycart", buyCart);

						WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());
					}
				}
			}
		}

		if(buyCart==null)
		{
			buyCart = new BuyCart();

			request.getSession().setAttribute("buycart", buyCart);

			WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());

		}

		if(productId!=null && productId > 0)
		{
			//从前台页面中通过产品的id来得到一个产品
			Product product = productService.find(productId);

			if(product!=null)
			{
				ProductStyle currentStyle = null;

				for(ProductStyle type : product.getStyles() )
				{
					/**
					 * 如果遍历的产品的样式id和从页面中得到的样式的id相等，就表示找到了该产品，并且也找到了该产品的一种样式，这种样式也就是用户
					 * 所购买的产品中的其中的一种样式。
					 */
					if(type.getVisible() && type.getId().equals(styleId))
					{
						currentStyle = type;
						break;
					}
				}
				//确保这个产品中只会有一个产品样式
				product.getStyles().clear();

				if(currentStyle!=null)
				{
					product.addProductStyle(currentStyle);
				}
				//把商品添加进购物车
				buyCart.addItem(new BuyItem(product,num,currentStyle),num);
				request.getSession().setAttribute("buycart", buyCart);
				request.setAttribute("style", currentStyle);
			}
			request.setAttribute("product", product);
			request.setAttribute("num", num);
		}
		return "../../front/cart/cartProduct";
	}
	@RequestMapping(value="decCart.htm",method=RequestMethod.POST)
	public String  decCart(Integer productId,Integer styleId,Integer num,
			HttpServletRequest request,HttpServletResponse response) {
		//首先从当前的session中找到是否有购物车(主要是考虑到用户是否会打开一个新的窗口)
		BuyCart buyCart = (BuyCart)request.getSession().getAttribute("buycart");

		if(buyCart!=null)
		{
			if(productId!=null && productId > 0)
			{
				//把商品从购物车删除
				Product product = productService.find(productId);
				product.addProductStyle(new ProductStyle(styleId));
				ProductStyle currentStyle = null;
				for(ProductStyle type : product.getStyles() )
				{
					/**
					 * 如果遍历的产品的样式id和从页面中得到的样式的id相等，就表示找到了该产品，并且也找到了该产品的一种样式，这种样式也就是用户
					 * 所购买的产品中的其中的一种样式。
					 */
					if(type.getVisible() && type.getId().equals(styleId))
					{
						currentStyle = type;
						break;
					}
				}
				BuyItem item = new BuyItem(product,currentStyle);
				buyCart.deleteItemAmount(item, num);
				request.getSession().setAttribute("buycart", buyCart);
				request.setAttribute("totalSellPrice", buyCart.getTotalSellPrice());
			}
		}
		return "../../front/cart/allCartProducts";
	}
	/**
	 * 删除购物项
	 * @param productId
	 * @param styleId
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="deleteCartItem.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult  deleteCartItem(Integer productId,Integer styleId,
			HttpServletRequest request,HttpServletResponse response) {
		//首先从当前的session中找到是否有购物车(主要是考虑到用户是否会打开一个新的窗口)
		BuyCart buyCart = (BuyCart)request.getSession().getAttribute("buycart");
		if(buyCart!=null)
		{
			if(productId!=null && productId > 0)
			{
				//把商品从购物车删除
				Product product = productService.find(productId);
				product.addProductStyle(new ProductStyle(styleId));
				ProductStyle currentStyle = null;
				for(ProductStyle type : product.getStyles() )
				{
					/**
					 * 如果遍历的产品的样式id和从页面中得到的样式的id相等，就表示找到了该产品，并且也找到了该产品的一种样式，这种样式也就是用户
					 * 所购买的产品中的其中的一种样式。
					 */
					if(type.getVisible() && type.getId().equals(styleId))
					{
						currentStyle = type;
						break;
					}
				}
				BuyItem item = new BuyItem(product,currentStyle);
				buyCart.deleteItem(item);
				request.getSession().setAttribute("buycart", buyCart);
				request.setAttribute("totalSellPrice", buyCart.getTotalSellPrice());
			}
		}
		DataResult result = new DataResult();
		result.setSuccess(true);
		result.setObj("购物项删除成功！");
		return result;
	}
	/**
	 * 购物车中所有的商品
	 * @return
	 */
	@RequestMapping(value="allCartProducts.htm",method=RequestMethod.POST)
	public String allCartProducts(HttpServletRequest request,HttpServletResponse response){
		BuyCart buyCart = (BuyCart)request.getSession().getAttribute("buycart");
		if(buyCart==null)
		{
			String sid = WebUtil.getCookieByName(request, "buyCartID");

			if(sid != null)
			{
				//取到的是以前的session
				HttpSession session = SiteSessionListenser.getSession(sid);

				if(session!=null)
				{
					buyCart = (BuyCart) session.getAttribute("buycart");

					if(buyCart!=null)
					{
						SiteSessionListenser.removeSession(sid);

						request.getSession().setAttribute("buycart", buyCart);

						WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());
					}
				}
			}
		}

		if(buyCart==null)
		{
			buyCart = new BuyCart();

			request.getSession().setAttribute("buycart", buyCart);

			WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());

		}
		request.getSession().setAttribute("buycart", buyCart);
		request.setAttribute("totalSellPrice", buyCart.getTotalSellPrice());
		return "../../front/cart/allCartProducts";
	}
	/**
	 * 查看购物车中所有的商品
	 * @return
	 */
	@RequestMapping(value="cartList.htm")
	public String cartList(HttpServletRequest request,HttpServletResponse response){
		BuyCart buyCart = (BuyCart)request.getSession().getAttribute("buycart");
		if(buyCart==null)
		{
			String sid = WebUtil.getCookieByName(request, "buyCartID");
			
			if(sid != null)
			{
				//取到的是以前的session
				HttpSession session = SiteSessionListenser.getSession(sid);
				
				if(session!=null)
				{
					buyCart = (BuyCart) session.getAttribute("buycart");
					
					if(buyCart!=null)
					{
						SiteSessionListenser.removeSession(sid);
						
						request.getSession().setAttribute("buycart", buyCart);
						
						WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());
					}
				}
			}
		}
		
		if(buyCart==null)
		{
			buyCart = new BuyCart();
			
			request.getSession().setAttribute("buycart", buyCart);
			
			WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());
			
		}
		request.getSession().setAttribute("buycart", buyCart);
		request.setAttribute("totalSellPrice", buyCart.getTotalSellPrice());
		return "../../front/cart/cartList";
	}
	/**
	 * 购物车中所有的商品的数量
	 * @return
	 */
	@RequestMapping(value="cartProductNum.htm",method=RequestMethod.POST)
	@ResponseBody
	public Integer cartProductNum(HttpServletRequest request,HttpServletResponse response){
		BuyCart buyCart = (BuyCart)request.getSession().getAttribute("buycart");
		if(buyCart==null)
		{
			String sid = WebUtil.getCookieByName(request, "buyCartID");

			if(sid != null)
			{
				//取到的是以前的session
				HttpSession session = SiteSessionListenser.getSession(sid);

				if(session!=null)
				{
					buyCart = (BuyCart) session.getAttribute("buycart");

					if(buyCart!=null)
					{
						SiteSessionListenser.removeSession(sid);

						request.getSession().setAttribute("buycart", buyCart);

						WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());
					}
				}
			}
		}

		if(buyCart==null)
		{
			buyCart = new BuyCart();

			request.getSession().setAttribute("buycart", buyCart);

			WebUtil.addCookie(response, "buyCartID", request.getSession().getId(), request.getSession().getMaxInactiveInterval());

		}
		return buyCart.getAllProductAmount();
	}
}

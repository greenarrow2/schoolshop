package com.schoolcloud.schoolshop.action.book;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.book.DeliverWay;
import com.schoolcloud.schoolshop.bean.book.OrderDeliverInfo;
import com.schoolcloud.schoolshop.bean.book.OrderItem;
import com.schoolcloud.schoolshop.bean.book.OrderState;
import com.schoolcloud.schoolshop.bean.book.PaymentWay;
import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.result.DataThreeResult;
import com.schoolcloud.schoolshop.bean.shopping.BuyCart;
import com.schoolcloud.schoolshop.bean.shopping.BuyItem;
import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.bean.user.UserDeliverInfo;
import com.schoolcloud.schoolshop.dao.user.UserDeliverInfoDao;
import com.schoolcloud.schoolshop.service.book.OrderItemService;
import com.schoolcloud.schoolshop.service.book.OrderService;
import com.schoolcloud.schoolshop.service.user.UserDeliverInfoService;
import com.schoolcloud.schoolshop.service.user.UserService;
import com.schoolcloud.schoolshop.utils.Utils;

@Controller
@RequestMapping("front/order")
public class FrontOrderController {

public static final Logger log = Logger.getLogger(FrontOrderController.class);
@Resource(name="userDeliverInfoService")
private UserDeliverInfoService userDeliverInfoService;
@Resource(name="userService")
private UserService userService;
@Resource(name="orderItemService")
private OrderItemService orderItemService;
@Resource(name="orderService")
private OrderService orderService;

public OrderService getOrderService() {
	return orderService;
}

public void setOrderService(OrderService orderService) {
	this.orderService = orderService;
}

public OrderItemService getOrderItemService() {
	return orderItemService;
}

public void setOrderItemService(OrderItemService orderItemService) {
	this.orderItemService = orderItemService;
}

public UserDeliverInfoService getUserDeliverInfoService() {
	return userDeliverInfoService;
}

public void setUserDeliverInfoService(
		UserDeliverInfoService userDeliverInfoService) {
	this.userDeliverInfoService = userDeliverInfoService;
}

public UserService getUserService() {
	return userService;
}

public void setUserService(UserService userService) {
	this.userService = userService;
}
/**
 * 保存收货地址
 */
@RequestMapping(value="saveAddress.htm",method=RequestMethod.POST)
@ResponseBody
@Transactional
public DataThreeResult saveAddress(Integer userId,String address,String mobile,String email,String consignee,String country,String province,String city,String district) {
	DataThreeResult result = new DataThreeResult();
	UserDeliverInfo udi = new UserDeliverInfo();
	udi.setCountry(country);
	udi.setProvince(province);
	udi.setCity(city);
	udi.setDistrict(district);
	udi.setAddress(address);
	udi.setChecked(true);
	udi.setEmail(email);
	udi.setMobile(mobile);
	udi.setRecipients(consignee);
	User user = userService.find(userId);
	udi.setUser(user);
	Set<UserDeliverInfo> udis = user.getUdis();
	for (UserDeliverInfo userDeliverInfo : udis) {
		userDeliverInfo.setChecked(false);
		userDeliverInfoService.update(userDeliverInfo);
	}
	userDeliverInfoService.save(udi);
	result.setSuccess(true);
	result.setObj("<div class=\"Option\"><div class=\"left\"><input type=\"radio\"  name=\"AddressId\" value="+udi.getId()+" id=\"Address_${udi.id}\" checked  /><label for=\"Address_${udi.id}\">"+"<b>"+udi.getRecipients()+"</b>&nbsp;"+udi.getAddress()+"&nbsp;"+udi.getMobile()+"&nbsp;"+udi.getEmail()+"</label></div><div class=\"left\"></div></div>");
	result.setData("<p>"+udi.getRecipients()+"  "+udi.getAddress()+"</p>"+"<p>"+udi.getMobile()+"  "+udi.getEmail()+"</p>");
	return result;
}
/**
 * 改变送货地址
 * @param addressId 送货地址id
 * @param request
 * @return
 */
@RequestMapping(value="changeAddress.htm",method=RequestMethod.POST)
@ResponseBody
public DataThreeResult changeAddress(Integer addressId,HttpServletRequest request){
	DataThreeResult result = new DataThreeResult();
	 User  user = (User) request.getSession().getAttribute("user");
	UserDeliverInfo udi = userDeliverInfoService.find(addressId);
	 Set<UserDeliverInfo> udis  = user.getUdis();
	 for (UserDeliverInfo userDeliverInfo : udis) {
		if(userDeliverInfo.getId().equals(udi.getId())&&udi.getChecked()!=true){
			userDeliverInfo.setChecked(true);
			result.setData(userDeliverInfo);
			userDeliverInfoService.update(userDeliverInfo);

		}else {
			userDeliverInfo.setChecked(false);
			userDeliverInfoService.update(userDeliverInfo);
		}
	}
   	result.setSuccess(true);
   	result.setObj("<p>"+udi.getRecipients()+"  "+udi.getAddress()+"</p>"+"<p>"+udi.getMobile()+"  "+udi.getEmail()+"</p>");
   	return result;
}
@RequestMapping(value="saveOrder.htm",method=RequestMethod.POST)
@Transactional
public String saveOrder(HttpServletRequest request,Integer addressId,Integer orderShippingId,Integer orderPayId) {
	try {
		 HttpSession session = request.getSession();
		    BuyCart buyCart = (BuyCart) session.getAttribute("buycart");
		    User user = (User) session.getAttribute("user");
		    UserDeliverInfo userDeliverInfo = userDeliverInfoService.find(addressId);
		    OrderDeliverInfo odi = new OrderDeliverInfo();
		    odi.setAddress(userDeliverInfo.getAddress());
		   if(orderShippingId==1){
		    odi.setDeliverWay(DeliverWay.EXPRESSDELIVERY);
		    }
		   if(orderShippingId==2){
			   odi.setDeliverWay(DeliverWay.EXIGENCEEXPRESSDELIVERY);
		   }
		   
		    odi.setEmail(userDeliverInfo.getEmail());
		    odi.setMobile(userDeliverInfo.getMobile());
		    odi.setQq(userDeliverInfo.getQq());
		    odi.setRecipients(userDeliverInfo.getRecipients());
		    String orderId = Utils.orderId;
		    UserOrder uo = new UserOrder();
		    uo.setOrderId(Utils.orderId);
		    uo.setProductTotalPrice(buyCart.getTotalSellPrice());
		    uo.setTotalPrice(buyCart.getOrderTotalPrice());
		    uo.setUser(user);
		    uo.setOrderDeliverInfo(odi);
		    if(orderPayId == 1){
		 	   uo.setPaymentWay(PaymentWay.NET);
		    }
		    if(orderPayId == 2){
		    	uo.setPaymentWay(PaymentWay.COD);
		    }
		    uo.setState(OrderState.WAITDELIVER);
		    orderService.save(uo);
		    UserOrder order = orderService.findByOrderId(orderId);
		    List<BuyItem> bis = buyCart.getBuyItems();
		    for (BuyItem bi : bis) {
				OrderItem oi = new OrderItem();
				oi.setAmount(bi.getAmount());
				oi.setDone(false);
				oi.setProductId(bi.getProduct().getId());
				oi.setProductName(bi.getProduct().getProductName());
				oi.setProductPrice(bi.getProduct().getSellPrice());
				oi.setStyleId(bi.getProductStyle().getId());
				oi.setStyleName(bi.getProductStyle().getName());
				oi.setOrder(order);
				orderItemService.save(oi);
			}
	} catch (Exception e) {
		// TODO: handle exception
		log.error("order create exception !"+e.getMessage());
	}
   
	return "../../front/order/payOrder";
}
}

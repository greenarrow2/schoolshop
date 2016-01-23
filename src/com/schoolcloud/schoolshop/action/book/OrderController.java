package com.schoolcloud.schoolshop.action.book;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.book.OrderState;
import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.service.book.OrderService;

@Controller
@RequestMapping("admin/order")
public class OrderController {
	@Resource(name="orderService")
	private OrderService orderService;

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	/**
	 * 订单查询情况
	 * @param start 开始索引
	 * @param limit 查询宽度
	 * @param userName 用户名称
	 * @param realName 真实姓名
	 * @param orderId 订单号
	 * @param timeType 查询时间类型
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @param orderState 订单状态
	 * @return
	 */
	@RequestMapping(value="orderList.htm",method=RequestMethod.POST)
	@ResponseBody
	public QueryResult<UserOrder> orderList(Integer start,
			Integer limit, String userName, String realName, String orderId,
			Integer timeType, String beginTime, String endTime,
			OrderState orderState) {
		QueryResult<UserOrder> queryResult = orderService.getScrollUserOrderData(start, limit,null, userName, realName, orderId, timeType, beginTime, endTime, orderState);
		return queryResult;
	}
	/**
	 * 更新订单状态
	 * @param id
	 * @param orderState
	 * @return
	 */
	@RequestMapping(value="updateOrderState.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult updateOrderState(Integer id,OrderState state){
		DataResult result = new DataResult();
		UserOrder order = orderService.find(id);
		order.setState(state);
		orderService.update(order);
		result.setSuccess(true);
		result.setObj("订单状态修改成功！");
		return result;
	}
	/**
	 * 更新订单处理状态
	 * @param id
	 * @param orderState
	 * @return
	 */
	@RequestMapping(value="updateOrderOver.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult updateOrderOver(Integer id,Boolean over){
		DataResult result = new DataResult();
		UserOrder order = orderService.find(id);
		order.setOver(!over);
		orderService.update(order);
		result.setSuccess(true);
		result.setObj("订单处理状态修改成功！");
		return result;
	}
	/**
	 * 订单删除成功
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteOrder.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteOrder(Integer id){
		DataResult result = new DataResult();
		orderService.delete(id);
		result.setSuccess(true);
		result.setObj("订单状态删除成功！");
		return result;
	}
	/**
	 * 订单删除成功
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteOrders.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteOrders(@RequestParam(value = "ids[]")Integer[] ids){
		DataResult result = new DataResult();
		orderService.delete(ids);
		result.setSuccess(true);
		result.setObj("订单状态删除成功！");
		return result;
	}
	/**
	 * 处理订单支付是否完成
	 * @param id 订单id
	 * @param paymentstate 完成状态
	 * @return
	 */
	@RequestMapping(value="updateOrderPaymentState.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult updateOrder(Integer id,Boolean paymentstate) {
		DataResult result = new DataResult();
		UserOrder order = orderService.find(id);
		result.setSuccess(true);
		if(paymentstate){
			order.setPaymentstate(!paymentstate);
			result.setObj("订单支付未完成！");
		}else{
			order.setPaymentstate(!paymentstate);
			result.setObj("订单支付完成！");
		}
		orderService.update(order);
		return result;
	}
	@RequestMapping(value="getOrderDetail.htm",method=RequestMethod.POST)
	public String getOrderDetail(Integer id,HttpServletRequest request) {
		UserOrder order = orderService.find(id);
		request.setAttribute("order", order);
		return "book/orderDetail";
	}
}

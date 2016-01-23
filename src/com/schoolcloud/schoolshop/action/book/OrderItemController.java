package com.schoolcloud.schoolshop.action.book;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.book.OrderItem;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.service.book.OrderItemService;
/**
 * 订单项控制层
 * @author 长润
 *
 */
@Controller
@RequestMapping("admin/orderitem")
public class OrderItemController {
@Resource(name="orderItemService")
private OrderItemService orderItemService;
@RequestMapping(value="orderItemList.htm",method=RequestMethod.POST)
@ResponseBody
public QueryResult<OrderItem> orderItemList(Integer start,Integer limit,String productName,String orderId,Integer timeType,Date beginTime,Date endTime,Boolean done){
	return orderItemService.getScrollOrderItemData(start, limit, productName, orderId, timeType, beginTime, endTime, done);
}
/**
 * 删除订单项
 * @param id
 * @return
 */
@RequestMapping(value="deleteOrderItem.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult deleteOrderItem(Integer id){
	DataResult result = new DataResult();
	result.setSuccess(true);
	orderItemService.delete(id);
	result.setObj("订单项删除成功！");
	return result;
}
/**
 * 删除订单项
 * @param id
 * @return
 */
@RequestMapping(value="deleteOrderItems.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult deleteOrderItems(@RequestParam(value = "ids[]")Integer[] ids){
	DataResult result = new DataResult();
	result.setSuccess(true);
	orderItemService.delete((Serializable)ids);
	result.setObj("订单项删除成功！");
	return result;
}
/*注入*/
public OrderItemService getOrderItemService() {
	return orderItemService;
}
public void setOrderItemService(OrderItemService orderItemService) {
	this.orderItemService = orderItemService;
}

}

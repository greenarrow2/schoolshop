package com.schoolcloud.schoolshop.bean.shopping;

import java.util.ArrayList;
import java.util.List;
import com.schoolcloud.schoolshop.bean.book.OrderDeliverInfo;
import com.schoolcloud.schoolshop.bean.book.PaymentWay;
/**
 * 购物车
 * @author 长润
 *
 */
public class BuyCart {

private List<BuyItem> buyItems = new ArrayList<BuyItem>();

/* 收货人配送信息 */
private OrderDeliverInfo deliverInfo;

/* 收货人与订购者是否相同 */
private Boolean buyerIsrecipients;

/* 支付方式 */
private PaymentWay paymentWay;

/* 配送费 */
private float deliveFee = 0f;

/*附言*/
private String note;
/**
 * 商品总数
 */
private Integer allProductAmount;
/**
 * 添加购物项
 * @param item
 * 在页面上，当用户点击购买的时候，就会调用此方法，执行addItem()方法，这个方法是专门用来添加购物项的。
*/
public void addItem(BuyItem item,Integer num)
{	
	//如果购物项不存在于购物车,那么我们直接添加到购物车
	if(!buyItems.contains(item))
	{
		buyItems.add(item);
	}
	else
	{
		//如果购物项已经存在于购物车,累加其购买数量
		for(BuyItem bItem : buyItems)
		{
			if(bItem.equals(item))
			{
				bItem.setAmount(bItem.getAmount()+num);
				break;
			}
		}
	}
}

/**
 * 清空购物车
*/
public void deleteAll()
{
	buyItems.clear();
}


/**
 * 减少购物项
*/
public void deleteItemAmount(BuyItem buyItem,Integer num)
{
	//如果购物项已经存在于购物车,累加其购买数量
	for(BuyItem bItem : buyItems)
	{
		if(bItem.getProduct().equals(buyItem.getProduct())&&bItem.getProductStyle().equals(buyItem.getProductStyle()))
		{
			bItem.setAmount(bItem.getAmount()-num);
			break;
		}
	}
}
	/**
	 * 删除购物项
	 */
	public void deleteItem(BuyItem buyItem)
	{
		for(BuyItem bItem : buyItems)
		{
			if(bItem.getProduct().equals(buyItem.getProduct())&&bItem.getProductStyle().equals(buyItem.getProductStyle()))
			{
				buyItems.remove(bItem);
				break;
			}
		}
    }

/**
 * 计算商品的总金额
*/
public float getTotalSellPrice()
{
	float result = 0f;
	
	for(BuyItem item : buyItems)
	{
		result += item.getProduct().getSellPrice() * item.getAmount();
	}
	return result;
}

/**
 * 计算商品的总节省金额（总市场价-销售价）
*/
public float getTotalSavePrice()
{
	float result = 0f;
	
	for(BuyItem item : buyItems)
	{
		result += item.getProduct().getMarketPrice() *  item.getAmount();
	}
	
	return result - this.getTotalSellPrice();
}


public Integer getAllProductAmount() {
	Integer result = 0;
	for (BuyItem item : buyItems) {
		result += item.getAmount();
	}
	return result;
}

public void setAllProductAmount(Integer allProductAmount) {
	this.allProductAmount = allProductAmount;
}

public List<BuyItem> getBuyItems()
{
	return buyItems;
}

public OrderDeliverInfo getDeliverInfo()
{
	return deliverInfo;
}

public void setDeliverInfo(OrderDeliverInfo deliverInfo)
{
	this.deliverInfo = deliverInfo;
}

 

public Boolean getBuyerIsrecipients()
{
	return buyerIsrecipients;
}

public void setBuyerIsrecipients(Boolean buyerIsrecipients)
{
	this.buyerIsrecipients = buyerIsrecipients;
}

public PaymentWay getPaymentWay()
{
	return paymentWay;
}

public void setPaymentWay(PaymentWay paymentWay)
{
	this.paymentWay = paymentWay;
}

public float getDeliveFee()
{
	return deliveFee;
}

public void setDeliveFee(float deliveFee)
{
	this.deliveFee = deliveFee;
}

/**
 * 计算订单总金额
*/
public float getOrderTotalPrice()
{
	return this.getTotalSellPrice() + this.getDeliveFee();
}

public String getNote()
{
	return note;
}

public void setNote(String note)
{
	this.note = note;
}}

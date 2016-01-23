package com.schoolcloud.schoolshop.bean.book;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.utils.Utils;

@Entity
@Table(name="userOrder")
@JsonIgnoreProperties(value={"items"})
public class UserOrder implements Serializable{
private static final long serialVersionUID = 4281649244818125314L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
@Column(length=20)
private String orderId;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="userId")
private User user;
//订单创建时间 
 
private String  createTime = Utils.date;
//订单修改时间 
 
private String  updateTime = Utils.date;
/* 订单状态 */
@Enumerated(EnumType.STRING)
@Column(length=16,nullable=false)
private OrderState state;
/* 商品总金额 */
@Column(length=15)
private Float productTotalPrice = 0f;
/* 配送费 */
@Column(length=15)
private Float deliverFee = 0f;
/* 订单总金额 */
@Column(length=15)
private Float totalPrice= 0f;
/* 应付款(实际需要支付的费用) */
@Column(length=15)
private Float payablefee = 0f;
/* 顾客附言 */
@Column(length=15)
private String note;
/* 支付方式 */
@Enumerated(EnumType.STRING)
@Column(length=16,nullable=false)
private PaymentWay paymentWay;
/* 支付状态 */
@Column(length=2)
private Boolean paymentstate = false;
@Column(length=2)
private Boolean over=false;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="deliverId")
private OrderDeliverInfo orderDeliverInfo;
 
@OneToMany(cascade=CascadeType.ALL,mappedBy="order",fetch=FetchType.EAGER)
private Set<OrderItem> items = new HashSet<OrderItem>();
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public OrderState getState() {
	return state;
}
public void setState(OrderState state) {
	this.state = state;
}
public Float getProductTotalPrice() {
	return productTotalPrice;
}
public void setProductTotalPrice(Float productTotalPrice) {
	this.productTotalPrice = productTotalPrice;
}
public Float getDeliverFee() {
	return deliverFee;
}
public void setDeliverFee(Float deliverFee) {
	this.deliverFee = deliverFee;
}

public Boolean getOver() {
	return over;
}
public void setOver(Boolean over) {
	this.over = over;
}
public Float getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(Float totalPrice) {
	this.totalPrice = totalPrice;
}
public Float getPayablefee() {
	return payablefee;
}
public void setPayablefee(Float payablefee) {
	this.payablefee = payablefee;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public PaymentWay getPaymentWay() {
	return paymentWay;
}
public void setPaymentWay(PaymentWay paymentWay) {
	this.paymentWay = paymentWay;
}
public Boolean getPaymentstate() {
	return paymentstate;
}
public void setPaymentstate(Boolean paymentstate) {
	this.paymentstate = paymentstate;
}
public OrderDeliverInfo getOrderDeliverInfo() {
	return orderDeliverInfo;
}
public void setOrderDeliverInfo(OrderDeliverInfo orderDeliverInfo) {
	this.orderDeliverInfo = orderDeliverInfo;
}

public Set<OrderItem> getItems() {
	return items;
}
public void setItems(Set<OrderItem> items) {
	this.items = items;
}
public String getCreateTime() {
	return createTime;
}
public void setCreateTime(String createTime) {
	this.createTime = createTime;
}
public String getUpdateTime() {
	return updateTime;
}
public void setUpdateTime(String updateTime) {
	this.updateTime = updateTime;
}

}

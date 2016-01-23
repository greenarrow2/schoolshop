package com.schoolcloud.schoolshop.bean.book;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreType;

@Entity
@Table(name="orderItem")
//@JsonIgnoreProperties(value={"order"})
public class OrderItem implements Serializable{
private static final long serialVersionUID = 2108978308227180646L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
/* 产品id */
@Column(length=11)
private Integer productId;
/* 产品名称 */
@Column(length=20)
private String productName;
/* 产品销售价 */
@Column(length=10)
private Float productPrice = 0f;
/* 购买数量 */
@Column(length=10)
private Integer amount = 1;
/* 产品样式 */
@Column(length=20)
private String styleName;
@Column(length=2,nullable=false)
private Boolean done;
/* 产品样式ID */
@Column(length=10)
private Integer styleId;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="orderId")
private UserOrder order;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Float getProductPrice() {
	return productPrice;
}
public void setProductPrice(Float productPrice) {
	this.productPrice = productPrice;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
}
public String getStyleName() {
	return styleName;
}
public void setStyleName(String styleName) {
	this.styleName = styleName;
}
public Integer getStyleId() {
	return styleId;
}
public void setStyleId(Integer styleId) {
	this.styleId = styleId;
}
public UserOrder getOrder() {
	return order;
}
public void setOrder(UserOrder order) {
	this.order = order;
}
public Boolean getDone() {
	return done;
}
public void setDone(Boolean done) {
	this.done = done;
}

}

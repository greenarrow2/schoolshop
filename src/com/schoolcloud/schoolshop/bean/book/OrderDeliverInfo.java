package com.schoolcloud.schoolshop.bean.book;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@Entity
@Table(name="orderDeliverInfo")
@JsonIgnoreProperties(value={"order"})
public class OrderDeliverInfo implements Serializable{
	private static final long serialVersionUID = -5882783156482324648L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	/* 收货人姓名 */
	@Column(length=20)
	private String recipients;
	/* 配送地址 */
	@Column(length=50)
	private String address;
	/* 电子邮箱 */
	@Column(length=20)
	private String email;
	/* 邮编 */
	@Column(length=10)
	private String postalcode;
	/* 手机 */
	@Column(length=15)
	private String mobile;
	@Column(length=15)
	private String qq;
	/* 性别 */
	@Column(length=2)
	private Integer sex = 1;
	/* 送货方式 */
	@Enumerated(EnumType.STRING)
	@Column(length=23,nullable=false)
	private DeliverWay deliverWay;
	/* 时间要求 */
	@Column(length=30)
	private String requirement;
	/* 所属的订单 */
	@OneToOne(mappedBy="orderDeliverInfo",cascade=CascadeType.REFRESH)
	private UserOrder order;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	 
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public DeliverWay getDeliverWay() {
		return deliverWay;
	}
	public void setDeliverWay(DeliverWay deliverWay) {
		this.deliverWay = deliverWay;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public UserOrder getOrder() {
		return order;
	}
	public void setOrder(UserOrder order) {
		this.order = order;
	}
	
	
}

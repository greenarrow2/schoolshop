package com.schoolcloud.schoolshop.bean.user;

import java.io.Serializable;

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
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.schoolcloud.schoolshop.bean.book.DeliverWay;
/**
 * 用户收货地址信息
 * @author 长润
 *
 */
@Entity
@Table(name="userDeliverInfo")
@JsonIgnoreProperties(value={"user"})
public class UserDeliverInfo implements Serializable{
	private static final long serialVersionUID = -5882783156482324648L;
	@Column(length=5)
	private  String country;
	@Column(length=5)
	private String province;
	@Column(length=5)
	private String city;
	@Column(length=5)
	private String district;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(length=2,nullable=false)
	private Boolean checked=false;
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
	/* 
	 * 送货方式 
	 */
	@Enumerated(EnumType.STRING)
	@Column(length=23)
	private DeliverWay deliverWay;
	/* 时间要求 */
	@Column(length=30)
	private String requirement;
	/* 所属的订单 */
	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="userId",nullable=true)
	private User user;
	
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
}

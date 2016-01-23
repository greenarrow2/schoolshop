package com.schoolcloud.schoolshop.bean.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.context.annotation.Lazy;

import com.schoolcloud.schoolshop.bean.book.UserOrder;
import com.schoolcloud.schoolshop.utils.Utils;
/**
 * 用户实体
 * @author 长润
 *
 */
@Entity
@Table
@JsonIgnoreProperties(value={"orders","favorites","comments","udis"})
public class User implements Serializable{
   private static final long serialVersionUID = -2612064370461983828L;
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Integer id;
   private String  nickName;//昵称
   @Column(length=20)
   private String userName;
   private String realName;//实名
   private String grade;//年级如09级10级
   private String email;
   private String qq;
   private String phone;
   private String password;
   private Integer sex;//1男，2女，0其他
   @Column(length=50,nullable=false)
   private String address;
   private String skyId=Utils.skyID;//通用唯一标示
   private String createTime = Utils.date;
   private String updateTime = Utils.date;
   @Transient
   private UserDeliverInfo userDeliverInfo;
   @OneToMany(cascade=CascadeType.ALL,mappedBy="user",fetch = FetchType.EAGER)
   private Set<Favorite> favorites = new HashSet<Favorite>();
   @OneToMany(cascade=CascadeType.ALL,mappedBy="user")
   private Set<UserOrder> orders = new HashSet<UserOrder>();
   @OneToMany(cascade=CascadeType.ALL,mappedBy="user")
   private Set<Comment> comments = new HashSet<Comment>();
   @OneToMany(cascade=CascadeType.ALL,mappedBy="user",fetch=FetchType.EAGER)
   private Set<UserDeliverInfo> udis = new HashSet<UserDeliverInfo>();
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}
public String getRealName() {
	return realName;
}
public void setRealName(String realName) {
	this.realName = realName;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQq() {
	return qq;
}
public void setQq(String qq) {
	this.qq = qq;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getSex() {
	return sex;
}
public void setSex(Integer sex) {
	this.sex = sex;
}
public String getSkyId() {
	return skyId;
}
public void setSkyId(String skyId) {
	this.skyId = skyId;
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
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
   
public UserDeliverInfo getUserDeliverInfo() {
	UserDeliverInfo uInfo = null;
	if(udis!=null&&udis.size()>0){
	for (UserDeliverInfo udi : udis) {
		if(udi.getChecked()==true){
			uInfo = udi;
			break;
		}
	}
	}
	return uInfo;
}
public void setUserDeliverInfo(UserDeliverInfo userDeliverInfo) {
	this.userDeliverInfo = userDeliverInfo;
}
public Set<UserDeliverInfo> getUdis() {
	return udis;
}
public void setUdis(Set<UserDeliverInfo> udis) {
	this.udis = udis;
}
public Set<Favorite> getFavorites() {
	return favorites;
}
public void setFavorites(Set<Favorite> favorites) {
	this.favorites = favorites;
}
public Set<UserOrder> getOrders() {
	return orders;
}
public void setOrders(Set<UserOrder> orders) {
	this.orders = orders;
}
public Set<Comment> getComments() {
	return comments;
}
public void setComments(Set<Comment> comments) {
	this.comments = comments;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}

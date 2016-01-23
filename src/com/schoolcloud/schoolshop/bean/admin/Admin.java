package com.schoolcloud.schoolshop.bean.admin;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * 管理员
 * @author 长润
 *
 */
@Entity
@Table(name="admin")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE,region="com.schoolcloud.schoolshop.bean.admin.Admin")
@Cacheable(value=true)
public class Admin implements Serializable{
 
private static final long serialVersionUID = 1687299146122054558L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
@Column(length=10,nullable=false)
private String adminName;
@Column(length=20,nullable=false)
private String password;
@Column(length=20,nullable=false)
private String realName;
@Column(length=20)
private String createTime;
@Column(length=20)
private String updateTime;
@Column(length=12)
private String phone;
@Column(length=20)
private String email;
@Column(length=15)
private String qq;
@Column(length=2,nullable=false)
private Boolean visible;
@Column(length=2)
private Integer sex;
public Boolean getVisible() {
	return visible;
}
public void setVisible(Boolean visible) {
	this.visible = visible;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRealName() {
	return realName;
}
public void setRealName(String realName) {
	this.realName = realName;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
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
public Integer getSex() {
	return sex;
}
public void setSex(Integer sex) {
	this.sex = sex;
}

}

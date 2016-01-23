package com.schoolcloud.schoolshop.bean.school;

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

/**
 * 院系
 * @author 长润
 *
 */
@Entity
@Table(name="yuanXi")
public class YuanXi {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
/**
 * 院系名称
 */
private Integer id;
@Column(length=20,nullable=false)
private String yuanXiName;
/**
 * 院系人数
 */
@Column(length=5)
private Integer yuanXiPeopleCount;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="schoolId")
private School school;
@Column(length=1,nullable=false)
private Boolean visible;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getYuanXiName() {
	return yuanXiName;
}
public void setYuanXiName(String yuanXiName) {
	this.yuanXiName = yuanXiName;
}
public Integer getYuanXiPeopleCount() {
	return yuanXiPeopleCount;
}
public void setYuanXiPeopleCount(Integer yuanXiPeopleCount) {
	this.yuanXiPeopleCount = yuanXiPeopleCount;
}
public School getSchool() {
	return school;
}
public void setSchool(School school) {
	this.school = school;
}
public Boolean getVisible() {
	return visible;
}
public void setVisible(Boolean visible) {
	this.visible = visible;
}

}

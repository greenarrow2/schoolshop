package com.schoolcloud.schoolshop.bean.school;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
/**
 * 学校
 * @author 长润
 *
 */
@Entity
@Table(name="school")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE,region="com.schoolcloud.schoolshop.bean.school.School")
@Cacheable(value=true)
public class School {
/**
 * school ID
 */
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
/**
 * 学校名称
 */
@Column(length=20,nullable=false)
private String schoolName;
/**
 * 校园人数
 */
@Column(length=10)
private Integer peopleCount;
/**
 * 院系数量
 */
@Column(length=5)
private Integer yuanXiCount;
/**
 * 班级数量
 */
@Column(length=5)
private Integer classCount;
/**
 * 是否可用
 */
@Column(length=1)
private Boolean visible = false;
/**
 * 学校地址
 */
@Column(length=70)
private String schoolAddress="河南——新乡——红旗区";
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="schools")
private Set<School> schools = new HashSet<School>();
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public Integer getPeopleCount() {
	return peopleCount;
}
public void setPeopleCount(Integer peopleCount) {
	this.peopleCount = peopleCount;
}

public Integer getYuanXiCount() {
	return yuanXiCount;
}
public void setYuanXiCount(Integer yuanXiCount) {
	this.yuanXiCount = yuanXiCount;
}
public Boolean getVisible() {
	return visible;
}
public void setVisible(Boolean visible) {
	this.visible = visible;
}
public Integer getClassCount() {
	return classCount;
}
public void setClassCount(Integer classCount) {
	this.classCount = classCount;
}
public String getSchoolAddress() {
	return schoolAddress;
}
public void setSchoolAddress(String schoolAddress) {
	this.schoolAddress = schoolAddress;
}
public Set<School> getSchools() {
	return schools;
}
public void setSchools(Set<School> schools) {
	this.schools = schools;
}

}

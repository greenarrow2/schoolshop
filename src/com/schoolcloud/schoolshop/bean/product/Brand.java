package com.schoolcloud.schoolshop.bean.product;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 品牌
 * @author 长润
 *
 */
@Entity
@Table(name="brand")
@JsonIgnoreProperties(value={"products"})
public class Brand implements Serializable{
	private static final long serialVersionUID = -9149509945312422370L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;//商品品牌ID
	@Column(length=20)
	private  String brandName;//品牌名称
	@Column(length=20)
	private String company;//品牌公司名称
	@Column(length=50)
	private String address;//公司地址
	@Column(length=3)
	private String grade;//品牌等级
	@Column(length=100)
	private String evaluation;//品牌评价
	@Column(length=2,nullable=false)
	private Boolean visible;//上下架
	@OneToMany(cascade = CascadeType.ALL,mappedBy="brand")
	private Set<Product> products = new HashSet<Product>();
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
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	

}

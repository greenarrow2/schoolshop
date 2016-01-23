package com.schoolcloud.schoolshop.bean.product;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 属性
 * @author 长润
 *
 */
@Entity
@Table(name="attribute")
@JsonIgnoreProperties(value={"productGenre"})  
public class Attribute implements Serializable{
	private static final long serialVersionUID = -8954269386934344121L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(length=20)
	private String  attributeName;
	@Column(length=5)
	private Integer  attributeType;//类型
	@Column(length=300)
	private String attributeParams;//选择项
	@Column(length=1)
	private Boolean isFill;//是否填写
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="genreId")
	private ProductGenre productGenre;

	public ProductGenre getProductGenre() {
		return productGenre;
	}
	public void setProductGenre(ProductGenre productGenre) {
		this.productGenre = productGenre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public Integer getAttributeType() {
		return attributeType;
	}
	public void setAttributeType(Integer attributeType) {
		this.attributeType = attributeType;
	}
	public String getAttributeParams() {
		return attributeParams;
	}
	public void setAttributeParams(String attributeParams) {
		this.attributeParams = attributeParams;
	}
	public Boolean getIsFill() {
		return isFill;
	}
	public void setIsFill(Boolean isFill) {
		this.isFill = isFill;
	}

}

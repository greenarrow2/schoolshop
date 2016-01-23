package com.schoolcloud.schoolshop.bean.product;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.context.annotation.Lazy;
import com.schoolcloud.schoolshop.utils.Utils;
/**
 * 商品类型
 * @author 长润
 *
 */
@Entity
@Table(name="producttype")
@JsonIgnoreProperties(value={"children","products"})
@Lazy(value=false)
public class ProductType implements Serializable{
private static final long serialVersionUID = 782185617417253722L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
@Column
private String name;//分类名称
@Column
private String note;//描述
@Column
private Boolean visible;//是否上架
@Column
private Integer recommendRank;//排行
@Column
private String createTime = Utils.date;
@Column
private String updateTime = Utils.date;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="typeId")
private ProductType parent ;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="genreId")
private ProductGenre prodGen;
@OneToMany(cascade=CascadeType.ALL,mappedBy="parent",fetch = FetchType.EAGER)
private Set<ProductType> children = new HashSet<ProductType>();
@OneToMany(cascade=CascadeType.ALL,mappedBy="productType",fetch=FetchType.EAGER)
private Set<Product> products = new HashSet<Product>();
public String getCreateTime() {
	return createTime.substring(0, createTime.length()-2);
}
public void setCreateTime(String createTime) {
	this.createTime = createTime;
}
public String getUpdateTime() {
	return updateTime.substring(0, updateTime.length()-2);
}
public void setUpdateTime(String updateTime) {
	this.updateTime = updateTime;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public Boolean getVisible() {
	return visible;
}
public void setVisible(Boolean visible) {
	this.visible = visible;
}
public Integer getRecommendRank() {
	return recommendRank;
}
public void setRecommendRank(Integer recommendRank) {
	this.recommendRank = recommendRank;
}
public ProductType getParent() {
	return parent;
}
public void setParent(ProductType parent) {
	this.parent = parent;
}
public Set<ProductType> getChildren() {
	return children;
}
public void setChildren(Set<ProductType> children) {
	this.children = children;
}
public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}
public ProductGenre getProdGen() {
	return prodGen;
}
public void setProdGen(ProductGenre prodGen) {
	this.prodGen = prodGen;
}
 
}

package com.schoolcloud.schoolshop.bean.image;

import java.io.Serializable;

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

import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;

@Entity
@Table(name="imagehistory")
public class ImageHistory implements Serializable{
private static final long serialVersionUID = -1192948995554685819L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
@Column(length=100)
private String url;
@Column(length=2)
private Integer type;
@Column
private Boolean visible = true;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.LAZY)
@JoinColumn(name="styleId")
private ProductStyle style;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Integer getType() {
	return type;
}
public void setType(Integer type) {
	this.type = type;
}
public Boolean getVisible() {
	return visible;
}
public void setVisible(Boolean visible) {
	this.visible = visible;
}
public ProductStyle getStyle() {
	return style;
}
public void setStyle(ProductStyle style) {
	this.style = style;
}

}

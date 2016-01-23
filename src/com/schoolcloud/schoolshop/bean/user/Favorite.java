package com.schoolcloud.schoolshop.bean.user;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.schoolcloud.schoolshop.bean.product.Product;

/**
 * 用户收藏
 * @author 长润
 *
 */
@Entity
@Table(name="favorite")
public class Favorite implements Serializable{
private static final long serialVersionUID = -7973789329472623554L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
 @ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
 @JoinColumn(name="userId")
 private User user;
 @ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
 @JoinColumn(name="productId")
 private Product product;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
 
}

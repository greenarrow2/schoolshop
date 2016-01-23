package com.schoolcloud.schoolshop.bean.user;

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
import com.schoolcloud.schoolshop.utils.Utils;

/**
 * 评论
 * @author 长润
 */
@Entity
@Table(name="comment")
public class Comment implements Serializable{
private static final long serialVersionUID = 8114447416404625034L;
/**
 *主键
 */
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
/**
 * 评论内容
 */
@Column(length=100)
private String content;
/**
 * 评论日期
 */
@Column(length=20)
private String createTime=Utils.date;
/**
 * 评分
 */
@Column(length=10)
private Integer score;
@Column(length=2)
private Boolean visible;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="productId")
private Product product;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="userId")
private User user;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getCreateTime() {
	return createTime;
}
public void setCreateTime(String createTime) {
	this.createTime = createTime;
}
public Integer getScore() {
	return score;
}
public void setScore(Integer score) {
	this.score = score;
}
public Boolean getVisible() {
	return visible;
}
public void setVisible(Boolean visible) {
	this.visible = visible;
}

}

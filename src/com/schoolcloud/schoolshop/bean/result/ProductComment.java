package com.schoolcloud.schoolshop.bean.result;

import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.user.Comment;

public class ProductComment {
 private Product product;
 private Comment comment;
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Comment getComment() {
	return comment;
}
public void setComment(Comment comment) {
	this.comment = comment;
}
 
}

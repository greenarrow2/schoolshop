package com.schoolcloud.schoolshop.bean.product;

import java.io.Serializable;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.schoolcloud.schoolshop.bean.image.ImageHistory;
import com.schoolcloud.schoolshop.bean.user.Comment;
import com.schoolcloud.schoolshop.bean.user.Favorite;
import com.schoolcloud.schoolshop.utils.Utils;
/**
 * 商品实体
 * @author 长润
 */
@Entity
@Table(name="product")
@JsonIgnoreProperties(value={"imageHistories","productExtras","favorites","styles"})
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE,region="com.schoolcloud.schoolshop.bean.product.Product")
@Cacheable(value=true)
public class Product implements Serializable{

private static final long serialVersionUID = 587348193914359403L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
/** 货号 **/
private String code;
@Column
private String productName;
@Column
private String description;
@Column
private Boolean visible;
@Column(length=100)
private String coverUrl;
@Column
private String createTime =  Utils.date;
@Column
private  String updateTime = Utils.date;
/**
 * 推荐等级
 */
@Column
private Integer recommendRank;
/**
 * 标签
 */
@Column(length=2)
private Integer mark;
/** 型号 **/
@Column(length=10)
private String model;
/** 底价(采购进来的价格) **/
@Column(length=15)
private Float basePrice;
/** 市场价 **/
@Column(length=15)
private Float marketPrice;
/** 销售价 **/
@Column(length=15)
private Float sellPrice;
/** 重量 单位:克 **/
@Column(length=10)
private Integer weight;
/** 购买说明 **/
@Column(length=200)
private String buyExplain;
/** 人气指数 **/
@Column(length=10)
private Integer clickcount = 1;
/** 销售量 **/
@Column(length=10)
private Integer sellCount = 0;
/** 是否推荐 **/
@Column(length=2)
private Boolean commend = false;
/**
 * 评论次数
 */
@Transient
private Integer commentCount;
@Transient
private Integer styleId;

@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="productTypeId")
private ProductType productType;
@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
@JoinColumn(name="brandId")
private Brand brand;
@OneToMany(cascade=CascadeType.ALL,mappedBy="product",fetch=FetchType.LAZY)
private Set<ProductExtra> productExtras = new HashSet<ProductExtra>();
@OneToMany(cascade=CascadeType.ALL,mappedBy="product",fetch=FetchType.LAZY)
private Set<Favorite> favorites = new HashSet<Favorite>();
@OneToMany(cascade={CascadeType.REMOVE,CascadeType.PERSIST},mappedBy="product",fetch=FetchType.EAGER)
private Set<ProductStyle> styles = new HashSet<ProductStyle>();
@OneToMany(cascade=CascadeType.ALL,mappedBy="product",fetch=FetchType.LAZY)
private Set<Comment> comments = new HashSet<Comment>();
public Product() {
}
public Product(Integer id) {
	this.id = id;
}
public Product(String productName, String description, Boolean visible,
		String createTime, String updateTime, Integer recommendRank) {
	this.productName = productName;
	this.description = description;
	this.visible = visible;
	this.createTime = createTime;
	this.updateTime = updateTime;
	this.recommendRank = recommendRank;
}
 
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Boolean getVisible() {
	return visible;
}
public void setVisible(Boolean visible) {
	this.visible = visible;
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
public Integer getRecommendRank() {
	return recommendRank;
}
public void setRecommendRank(Integer recommendRank) {
	this.recommendRank = recommendRank;
}
public ProductType getProductType() {
	return productType;
}
public void setProductType(ProductType productType) {
	this.productType = productType;
}

public Integer getMark() {
	return mark;
}
public void setMark(Integer mark) {
	this.mark = mark;
}


public Integer getCommentCount() {
	return comments.size();
}
public void setCommentCount(Integer commentCount) {
	this.commentCount = commentCount;
}
public Set<ProductExtra> getProductExtras() {
	return productExtras;
}
public void setProductExtras(Set<ProductExtra> productExtras) {
	this.productExtras = productExtras;
}

public Set<Favorite> getFavorites() {
	return favorites;
}
public void setFavorites(Set<Favorite> favorites) {
	this.favorites = favorites;
}
public Set<ProductStyle> getStyles() {
	return styles;
}
public void setStyles(Set<ProductStyle> styles) {
	this.styles = styles;
}
public String getCoverUrl() {
	return coverUrl;
}
public void setCoverUrl(String coverUrl) {
	this.coverUrl = coverUrl;
}

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Float getBasePrice() {
	return basePrice;
}
public void setBasePrice(Float basePrice) {
	this.basePrice = basePrice;
}
public Float getMarketPrice() {
	return marketPrice;
}
public void setMarketPrice(Float marketPrice) {
	this.marketPrice = marketPrice;
}
public Float getSellPrice() {
	return sellPrice;
}

public void setSellPrice(Float sellPrice) {
	this.sellPrice = sellPrice;
}
public Integer getWeight() {
	return weight;
}
public void setWeight(Integer weight) {
	this.weight = weight;
}
public String getBuyExplain() {
	return buyExplain;
}
public void setBuyExplain(String buyExplain) {
	this.buyExplain = buyExplain;
}
public Integer getClickcount() {
	return clickcount;
}
public void setClickcount(Integer clickcount) {
	this.clickcount = clickcount;
}
public Integer getSellCount() {
	return sellCount;
}
public void setSellCount(Integer sellCount) {
	this.sellCount = sellCount;
}
public Boolean getCommend() {
	return commend;
}

public Brand getBrand() {
	return brand;
}
public void setBrand(Brand brand) {
	this.brand = brand;
}
public void setCommend(Boolean commend) {
	this.commend = commend;
}

public Set<Comment> getComments() {
	return comments;
}
public void setComments(Set<Comment> comments) {
	this.comments = comments;
}


public Integer getStyleId() {
	for (ProductStyle style : this.styles) {
		if(style.getId()!=null&&style.getId()>0&&style.getVisible()==true){
			return style.getId();
		}
	}
	return null;
}
public void setStyleId(Integer styleId) {
	this.styleId = styleId;
}
/**
 * 从样式集合中删除指定样式
 * @param style
 */
public void removeProductStyle(ProductStyle style){
	if(this.styles.contains(style)){
		this.styles.remove(style);
		style.setProduct(null);
	}
}	

public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
/**
 * 添加样式到样式集合
 * @param style
 */
public void addProductStyle(ProductStyle style){
	if(!this.styles.contains(style)){
		this.styles.add(style);
		style.setProduct(this);
	}
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	final Product other = (Product) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
}

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

import com.schoolcloud.schoolshop.bean.image.ImageHistory;
import com.schoolcloud.schoolshop.bean.image.StylePhoto;
import com.schoolcloud.schoolshop.utils.Utils;

@Entity
@Table(name="productStyle")
public class ProductStyle implements Serializable{
	private static final long serialVersionUID = -3030528574537257373L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	/** 样式的名称 **/
	@Column(length=20)
	private String name;
	/** 图片 **/
	@Column(length=40)
	private String imagename;
	/** 是否可见 **/
	@Column(length=2)
	private Boolean visible = true;
	@Column(length=20)
	private String createTime = Utils.date;
	@Column(length=20)
	private String updateTime = Utils.date;
	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER,optional=true)
	@JoinColumn(name="productId")
	private Product product;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="style",fetch=FetchType.EAGER)
	private Set<StylePhoto> stylePhotos = new HashSet<StylePhoto>();
	
	public ProductStyle() {
	}
	public ProductStyle(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
	public Set<StylePhoto> getStylePhotos() {
		return stylePhotos;
	}
	public void setStylePhotos(Set<StylePhoto> stylePhotos) {
		this.stylePhotos = stylePhotos;
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
		final ProductStyle other = (ProductStyle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

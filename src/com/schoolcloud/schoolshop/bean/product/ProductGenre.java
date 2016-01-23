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
 * 类型
 * @author 长润
 *
 */
@Entity
@Table(name="productGenre")
public class ProductGenre implements Serializable{
	private static final long serialVersionUID = -7356482014219027159L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@Column(length=20)
    private String genreName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="productGenre")
	private Set<Attribute> attributes = new HashSet<Attribute>();
	@OneToMany(cascade=CascadeType.ALL,mappedBy="prodGen")
	private Set<ProductType> types = new HashSet<ProductType>();
	public Set<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(Set<Attribute> attributes) {
		this.attributes = attributes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
    
}

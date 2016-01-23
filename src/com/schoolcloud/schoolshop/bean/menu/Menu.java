package com.schoolcloud.schoolshop.bean.menu;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu implements Serializable {
	private static final long serialVersionUID = -6562652215237253306L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String iconcls;
	@Column
	private String name;
	@Column
	private Integer seq;
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="parentId")
	private Menu parentMenu;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="parentMenu")
	private Set<Menu> childMenu = new HashSet<Menu>();
	public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

	
	public Set<Menu> getChildMenu() {
		return childMenu;
	}

	public void setChildMenu(Set<Menu> childMenu) {
		this.childMenu = childMenu;
	}

	private String url;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIconcls() {
		return iconcls;
	}

	public void setIconcls(String iconcls) {
		this.iconcls = iconcls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

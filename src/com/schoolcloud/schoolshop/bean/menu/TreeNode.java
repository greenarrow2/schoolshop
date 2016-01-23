package com.schoolcloud.schoolshop.bean.menu;

import java.util.List;
import java.util.Map;
/**
 * 树形json数据的封装类
 * @author 长润
 *
 */
public class TreeNode {
	/**		主键id		**/
	private Integer id;
	
	/**		树节点名称		**/
	private String text;
	
	/**		前面的小图标样式		**/
	private String iconCls;
	
	/**		是否是叶子		**/
	private Boolean leaf = true; 
	
	/**		其他参数				**/
	private String url; 
	
	/**		子节点			**/
	private List<TreeNode> children; 
	
	/**		是否展开(open,closed)		**/
	private Boolean expanded = false;

	 
	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public String getIconCls()
	{
		return iconCls;
	}

	public void setIconCls(String iconCls)
	{
		this.iconCls = iconCls;
	}

 

	public Boolean getLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<TreeNode> getChildren()
	{
		return children;
	}

	public void setChildren(List<TreeNode> children)
	{
		this.children = children;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}
}

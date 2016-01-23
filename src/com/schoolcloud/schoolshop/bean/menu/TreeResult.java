package com.schoolcloud.schoolshop.bean.menu;

import java.util.ArrayList;
import java.util.List;

public class TreeResult {
private String text;
private List<TreeNode> children = new ArrayList<TreeNode>();
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public List<TreeNode> getChildren() {
	return children;
}
public void setChildren(List<TreeNode> children) {
	this.children = children;
}

}

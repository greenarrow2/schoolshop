package com.schoolcloud.schoolshop.utils;

import java.util.Comparator;

import com.schoolcloud.schoolshop.bean.menu.Menu;

/**
 * 菜单排序比较器
 * @author 长润
 *
 */
public class MenuComparator implements Comparator<Menu>{
	public int compare(Menu o1, Menu o2)
	{
		int i1 = o1.getSeq() != null ? o1.getSeq().intValue() : -1;
		int i2 = o2.getSeq() != null ? o2.getSeq().intValue() : -1;
		return i1 - i2;
	}
}

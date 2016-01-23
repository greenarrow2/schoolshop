package com.schoolcloud.schoolshop.bean.page;

import java.util.List;

public class PageView<T> {
/**
*分页数据,分页要显示的数据也就是比如：从开始索引到结束索引的要显示的是数据 
*/
private List<T> records;
/**
 * 页码开始索引和结束索引
 */
private PageIndex pageIndex;
/**
 * 总页数
 */
private long totalPage = 1;
/**
 * 每页显示记录数
 */
private int maxResult = 20;
/**
 * 当前页
 */
private int currentPage = 1;
/**
 * 总记录数
 */
private long  totalRecord;
/**
 *页码数量，每页要显示多少页码
 */
private int pageCode = 10;

/** 要获取记录的开始索引 **/
public int getFirstResult()
{
	return (this.currentPage - 1) * this.maxResult;
}

public int getPageCode()
{
	return pageCode;
}

public void setPageCode(int pageCode)
{
	this.pageCode = pageCode;
}

public PageView(int maxResult, int currentPage)
{
	this.maxResult = maxResult;
	
	this.currentPage = currentPage;
}

public PageView() {
	// TODO 自动生成的构造函数存根
}

public void setQueryResult(QueryResult<T> qr)
{
	/**	得到数据库中的总记录数,在得到总记录的同时,还做了一件事
	 *  <1>	设置总共有多少页
	*/
	this.setTotalRecord(qr.getTotal());
	
	/**		得到分页的结果,也就是得到数据库中的数据		**/
	this.setRecords(qr.getRows());
}

public long getTotalRecord()
{
	return totalRecord;
}

public void setTotalRecord(long totalRecord)
{
	this.totalRecord = totalRecord;
	
	/***	计算总页数		**/
	setTotalPage(this.totalRecord % this.maxResult == 0 ? this.totalRecord
			/ this.maxResult : this.totalRecord / this.maxResult + 1);
}

public List<T> getRecords()
{
	return records;
}

public void setRecords(List<T> records)
{
	this.records = records;
}

public PageIndex getPageIndex()
{
	return pageIndex;
}

public long getTotalPage()
{
	return totalPage;
}

public void setTotalPage(long totalPage)
{
	this.totalPage = totalPage;
	
	this.pageIndex = PageIndex.getPageIndex(pageCode, currentPage,totalPage);
}

public int getMaxResult()
{
	return maxResult;
}

public int getCurrentPage()
{
	return currentPage;
}

public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}

}

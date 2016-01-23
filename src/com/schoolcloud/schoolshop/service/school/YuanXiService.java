package com.schoolcloud.schoolshop.service.school;

import java.io.Serializable;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.school.YuanXi;

public interface YuanXiService {

	/**
	 * 保存实体
	 * @param yuanXi
	 */
	public void save(YuanXi yuanXi);
	/**
	 * 更新实体
	 * @param yuanXi
	 */
	public void update(YuanXi yuanXi);
	/**
	 * 删除实体
	 * @param id
	 */
	public  void delete(Serializable id);
	/**
	 * 按组删除实体
	 * @param ids
	 */
	public  void delete(Serializable...ids );
     /**
      * 得到实体
      * @param id
      * @return
      */
	public YuanXi find(Serializable  id);
	/**
	 * 是否已经存在该学校
	 * @param schoolName
	 * @return
	 */
	public boolean isExistYuanXiByYuanXiName(String yuanXiName);
    /**
     * 分页查询院系
     * @param start
     * @param limit
     * @param visible
     * @param yuanXiName
     * @param orderType
     * @return
     */
	public QueryResult<YuanXi> getScrollYuanXiData(Integer start,
			Integer limit, Boolean visible, String yuanXiName,
			 String orderType); 
	
	public QueryResult<YuanXi> getScrollYuanXiDataCache(Integer start,
			Integer limit, Boolean visible, String yuanXiName,
			 String orderType); 

}

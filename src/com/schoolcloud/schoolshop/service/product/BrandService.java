package com.schoolcloud.schoolshop.service.product;

import java.io.Serializable;
import java.util.List;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Brand;
/**
 * 品牌操作
 * @author 长润
 *
 */
public interface BrandService {
/**
 * 保存品牌
 * @param brand
 */
public void save(Brand brand);
/**
 * 更新品牌
 * @param brand
 */
public void update(Brand brand);
/**
 * 根据ID删除品牌
 * @param id
 */
public void delete(Serializable id);
/**
 * 根据数组删除品牌
 * @param ids
 */
public void delete(Serializable...ids);
/**
 * 查询实体
 * @param id
 * @return
 */
public Brand find(Serializable id);
 /**
  * 根据条件查询分页
  * @param brandName 品牌名称
  * @param createTime 创建日期
  * @param updateTime 更新日期
  * @param company 公司
  * @param address 地址
  * @param grade 品牌等级
  * @param visible 是否上架
  * @param sort 排序字段
  * @param sortType 排序类型 1升序2降序
  * @param start 开始查询索引
  * @param limit 查询宽度
  * @return
  */
public QueryResult<Brand> getScrollBrandData(String brandName,String createTime,String updateTime,String company,String address,Integer grade,Boolean visible,String sort,Integer sortType,Integer start,Integer limit);

public QueryResult<Brand> getScrollBrandData(String brandName,String createTime,String updateTime,String company,String address,Integer grade,Boolean visible,Integer start,Integer limit);

public QueryResult<Brand> getScrollBrandData(Integer firstindex, Integer maxresult, String sort,Integer sortType);

public QueryResult<Brand> getScrollBrandData(Integer firstindex, Integer maxresult);

public QueryResult<Brand> getScrollBrandData();
/**
 * 得到所有的品牌分类
 * @return
 */
public List<Brand> getBrandList();
}

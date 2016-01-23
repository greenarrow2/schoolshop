package com.schoolcloud.schoolshop.service.product;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.jasper.tagplugins.jstl.core.If;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.utils.Utils;



public interface ProductService {
	/**
	 * 保存实体
	 * @param eniProducty
	 */
	public void save(Product product);
	/**
	 * 更新实体
	 * @param enProductiProducty
	 */
	public void update(Product product);
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
	 * 通过id得到一个实体
	 * @param enProductiProductyId
	 * @reProducturn
	 */
	public Product find(Serializable  productId);
	/**
	 * 得到一级分类的商品
	 * @param id
	 * @return
	 */
	public  List<Product>  getProductListByOneType(Serializable id);
	/**
	 * 得到二级分类的商品
	 * @param id
	 * @return
	 */
	public  QueryResult<Product>  getProductListByThreeType(Integer id,Integer start,Integer limit);
	/**
	 * 得到二级分类的商品
	 * @param id
	 * @return
	 */
	public  QueryResult<Product>  getProductListByTwoType(Integer id,Integer start,Integer limit);
	/**
	 * 得到一级分类的商品
	 * @param id
	 * @return
	 */
	public  QueryResult<Product>  getProductListByOneType(Integer id,Integer start,Integer limit);
	/**
	 *  If productId ==null
	 *  得到最后一条数据
	 *  else 得到根据id查到的数据
	 * @param productId 
	 * @return
	 */
	public Product findLastOrProduct(Serializable  productId);
	/**
	 * 添加商品类型和额外参数
	 * @param attributeName  参数名称
	 * @param attributeValue  参数值
	 * @param typeId  类型id根据id找到分类对象
	 * @param productId  商品id 
	 */
	public void addTypeAttrs(String[] attributeName,String[] attributeValue,Integer typeId,Integer productId);
	/**
	 * 判断该商品是否添加过
	 * @param productName
	 * @return
	 */
	public boolean isExist(String productName);
	/**
	 * 按条件分页查询
	 * @param start 开始索引
	 * @param limit 查询宽度
	 * @param productName 商品名称
	 * @param visible 是否上架
	 * @param createTime 上架时间
	 * @param timeType 1 创建时间  2修改时间  null 表示不能进行时间查询
	 * @param updateTime 修改时间
	 * @param recommendRank 推荐等级
	 * @param mark 标签  1抢购，  2热卖， 3特卖，4猜你喜欢 ，5热评商品，6新品上架 ，7一元云购 0 普通
	 * @param productTypeId  商品分类ID
	 * @param sort  排序字段
	 * @param sortType 排序类型
	 * @return 
	 */
	public QueryResult<Product> getScrollProductData(Integer start, Integer limit, String productName,Boolean visible,String beginTime,String endTime,Integer timeType,Integer recommendRank,Integer mark,Integer productTypeId,String sort,Integer sortType,Boolean isCache);
	/**
	 * 
	 * @param start
	 * @param limit
	 * @param mark 查询标签
	 * @return
	 */
	public List<Product> queryProductByMark(Integer start,Integer limit,Integer mark);
}

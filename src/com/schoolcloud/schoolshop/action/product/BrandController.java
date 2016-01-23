package com.schoolcloud.schoolshop.action.product;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Brand;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.service.product.BrandService;

@Controller
@RequestMapping("admin/brand")
public class BrandController {
	@Resource(name="brandService")
	private BrandService brandService;
	public BrandService getBrandService() {
		return brandService;
	}
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	/**
	 * 添加或更新品牌
	 * @param brand
	 * @return
	 */
	@RequestMapping(value="addOrUpdateBrand.htm",method=RequestMethod.POST)	
	@ResponseBody
	public DataResult  addOrUpdateBrand(@ModelAttribute("brandForm") Brand brand){
		DataResult result = new DataResult();
		if(brand.getId()!=null&&brand.getId()>=0){
			brandService.update(brand);
			result.setSuccess(true);
			result.setObj("品牌更新成功！");
		}else {
			brandService.save(brand);
			result.setSuccess(true);
			result.setObj("品牌添加成功！");
		}
		return result;
	}
	/**
	 * 删除品牌
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteBrand.htm",method=RequestMethod.POST)	
	@ResponseBody
	public DataResult deleteBrand(Integer id){
		DataResult result = new DataResult();
		brandService.delete(id);
		result.setSuccess(true);
		result.setObj("品牌删除成功！");
		return result;
	}
	/**
	 * 品牌的上下架
	 * @param id
	 * @param visible
	 * @return
	 */
	@RequestMapping(value="visibleBrand.htm",method=RequestMethod.POST)	
	@ResponseBody
	public DataResult visibleBrand(Integer id,Boolean visible){
		DataResult result = new DataResult();
		Brand brand = brandService.find(id);
		brand.setVisible(visible);
		brandService.update(brand);
		result.setSuccess(true);
		if(visible){
			result.setObj("品牌上架成功！");
		}else {
			result.setObj("品牌下架成功！");
		}
		return result;
	}
	/**
	 * 按条件查询
	 * @param brandName
	 * @param createTime
	 * @param updateTime
	 * @param company
	 * @param address
	 * @param grade
	 * @param visible
	 * @param sort 排序字段
	 * @param sortType 1升序2倒序其他倒序，null为正序
	 * @param start
	 * @param limit
	 * @return
	 */
	@RequestMapping(value="brandList.htm",method=RequestMethod.POST)	
	@ResponseBody
	public QueryResult<Brand>  brandList(String brandName,String createTime,String updateTime,String company,String address,Integer grade,Boolean visible,String sort,Integer sortType,Integer start,Integer limit){
		QueryResult<Brand> result;
		if(((brandName==null||"".equals(brandName))&&
				(createTime==null||"".equals(createTime))&&
				(updateTime==null||"".equals(updateTime))&&
				(company==null||"".equals(company))&&
				(address==null||"".equals(address))&&
				grade==null&&visible==null)&&(sort==null||"".equals(sort))
				){
			result = brandService.getScrollBrandData(start, limit);
		}else if(!((brandName==null||"".equals(brandName))&&
				(createTime==null||"".equals(createTime))&&
				(updateTime==null||"".equals(updateTime))&&
				(company==null||"".equals(company))&&
				(address==null||"".equals(address))&&
				grade==null&&visible==null)&&(sort==null||"".equals(sort))){
			result = brandService.getScrollBrandData(brandName, createTime, updateTime, company, address, grade, visible, start, limit);
		}else if (((brandName==null||"".equals(brandName))&&
				(createTime==null||"".equals(createTime))&&
				(updateTime==null||"".equals(updateTime))&&
				(company==null||"".equals(company))&&
				(address==null||"".equals(address))&&
				grade==null&&visible==null)&&!(sort==null||"".equals(sort))) {
			result = brandService.getScrollBrandData(start, limit, sort, sortType);
		}else {
			result = brandService.getScrollBrandData(brandName, createTime, updateTime, company, address, grade, visible, sort, sortType, start, limit);
		}
		return result;
	}
	/**
	 * 获得所有的品牌列表
	 * @return
	 */
	@RequestMapping(value="getBrandList.htm",method=RequestMethod.POST)	
	@ResponseBody
	public List<Brand>  getBrandList(){ 
	List<Brand>  brands =	brandService.getBrandList();
	return brands;
	}

}

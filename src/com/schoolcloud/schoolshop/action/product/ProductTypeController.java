package com.schoolcloud.schoolshop.action.product;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.util.JSONUtils;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.menu.TreeNode;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.ProductGenre;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;
import com.schoolcloud.schoolshop.utils.JsonUtils;

@Controller
@RequestMapping("admin/producttype")
public class ProductTypeController {
	@Resource(name="productTypeService")
	private ProductTypeService productTypeService;

	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}
	/**
	 * 添加更新商品分类
	 * @param productType
	 * @return
	 */
	@RequestMapping(value="saveOrUpdate.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult saveOrUpdate(@ModelAttribute("productType") ProductType productType,Integer typeId){
		DataResult result = new DataResult();
		if(productType.getId()!=null&&productType.getId()>=0){
			productTypeService.update(productType);
			result.setSuccess(true);
			result.setObj("分类修改成功！");
		}else {
			if(typeId!=null&& typeId>=0){
				productType.setParent(productTypeService.find(typeId));
			}
			productTypeService.save(productType);
			result.setSuccess(true);
			result.setObj("分类添加成功！");
		}
		return result;
	}
	/**
	 * 删除商品分类
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteProductType.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteProductType(Integer id){
		DataResult result = new DataResult();
		ProductType productType = productTypeService.find(id);
		Set<ProductType>  children = productType.getChildren();
		if(children.size()>0){
			result.setSuccess(false);
			result.setObj("此分类有子分类不可删除！");
		}else {
			productTypeService.delete(id);
			result.setSuccess(true);
			result.setObj("商品分类删除成功！");
		}
		return result;
	}
	/**
	 * 分组删除商品分类
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteProductTypes.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteProductTypes(@RequestParam(value = "ids[]")Integer[] ids){
		DataResult result = new DataResult();
		for (Integer id : ids) {
			ProductType productType = productTypeService.find(id);
			Set<ProductType>  children = productType.getChildren();
			if(children.size()>0){
				result.setSuccess(false);
				result.setObj("有子分类不可删除！");
				return result;
			}else {
				productTypeService.delete(id);
			}
		}
		result.setSuccess(true);
		result.setObj("商品分类删除成功！");
		return result;
	}

	/**
	 * 上下架商品分类
	 * @param id
	 * @return
	 */
	@RequestMapping(value="updateVisibleProductType.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult updateVisibleProductType(Integer id,Boolean visible){
		DataResult result = new DataResult();
		ProductType productType = productTypeService.find(id);
		result.setSuccess(true);
		if(visible){
			productType.setVisible(false);
			result.setObj("此分类下架成功！");
			productTypeService.update(productType);
		}else {
			productType.setVisible(true);
			result.setObj("此分类上架成功！");
			productTypeService.update(productType);
		}
		return result;
	}

	/**
	 * 商品分类列表
	 * @param start
	 * @param limit
	 * @return
	 */
	@RequestMapping(value="productTypeList.htm",method=RequestMethod.POST)
	@ResponseBody
	public QueryResult<ProductType> productTypeList(Integer start,Integer limit){
		QueryResult<ProductType> result = productTypeService.getScrollProductTypeData(start, limit);
		return result;
	}
	/**
	 * 获得分类树
	 * @param start
	 * @param limit
	 * @return
	 */
	@RequestMapping(value="productTypes.htm",method=RequestMethod.POST)
	@ResponseBody
	public List<ProductType> productTypes(){
		List<ProductType> result = productTypeService.getProductTypes();
		return result;
	}
   /**
    * 获得所有一级分类
    * @param request
    * @return
    */
	@RequestMapping(value="getProductTypes.htm",method=RequestMethod.POST)
	public String getProductTypes(HttpServletRequest request){
		List<ProductType> productTypes = productTypeService.getProductTypes();
		request.setAttribute("productTypes", productTypes);
		return "product/productTypes";
	}  
	/**
	 * 获得所有二级分类
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getProductTypess.htm",method=RequestMethod.POST)
	public String getProductTypess(Integer id,Integer type,HttpServletRequest request){
		List<ProductType> productTypess = productTypeService.getProductTypes(id);
		request.setAttribute("productTypess", productTypess);
		if(type==2){
		return "product/productTypess";
		}
		return "product/productTypesss";
	}  
	 
}

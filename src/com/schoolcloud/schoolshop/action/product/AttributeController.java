package com.schoolcloud.schoolshop.action.product;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Attribute;
import com.schoolcloud.schoolshop.bean.product.ProductGenre;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.service.product.AttributeService;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;

/**
 * 
 * @author 长润 类型参数
 */
@Controller
@RequestMapping("admin/attribute")
public class AttributeController {
	@Resource(name = "attributeService")
	private AttributeService attributeService;
	@Resource(name = "productTypeService")
	private ProductTypeService productTypeService;

	public AttributeService getAttributeService() {
		return attributeService;
	}

	public void setAttributeService(AttributeService attributeService) {
		this.attributeService = attributeService;
	}

	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}

	/**
	 * 删除属性
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "deleteAttribute.htm", method = RequestMethod.POST)
	@ResponseBody
	public DataResult deleteAttribute(Integer id) {
		DataResult result = new DataResult();
		attributeService.delete(id);
		result.setSuccess(true);
		result.setObj("属性删除成功！");
		return result;
	}

	/**
	 * 保存或更新属性
	 * 
	 * @param attribute
	 * @return
	 */
	@RequestMapping(value = "saveOrUpdate.htm", method = RequestMethod.POST)
	@ResponseBody
	public DataResult saveOrUpdate(
			@ModelAttribute("attribute") Attribute attribute) {
		DataResult result = new DataResult();
		if (attribute.getId() != null && attribute.getId() >= 0) {
			attributeService.update(attribute);
			result.setSuccess(true);
			result.setObj("属性修改成功！");
		} else {
			attributeService.save(attribute);
			result.setSuccess(true);
			result.setObj("属性添加成功！");
		}
		return result;
	}

	/**
	 * 参数列表
	 * 
	 * @param start
	 * @param limit
	 * @param genreId
	 *            类型id
	 * @return
	 */
	@RequestMapping(value = "attributeList.htm", method = RequestMethod.POST)
	@ResponseBody
	public QueryResult<Attribute> attributeList(Integer start, Integer limit,
			Integer genreId) {
		return attributeService.getScrollAttributeData(start, limit, genreId);
	}

	/**
	 * 参数列表
	 * 
	 * @param start
	 * @param limit
	 * @param genreId
	 *            类型id
	 * @return
	 */
	@RequestMapping(value = "attributesByType.htm", method = RequestMethod.POST)
	public String attributesByGenre(Integer start, Integer limit,
			Integer typeId, HttpServletRequest request) {
		ProductType productType = productTypeService.find(typeId);// 得到分类
		List<Attribute> attributes = null;
		ProductGenre productGenre = productType.getProdGen();// 得到类型
		if (productGenre != null) {
			Integer genreId = productGenre.getId();// 得到类型的id
			attributes = attributeService.getScrollAttributeData(start, limit,
					genreId).getRows();
		}
		request.setAttribute("attributes", attributes);
		request.setAttribute("typeId", typeId);
		return "product/attributes";
	}
}

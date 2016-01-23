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
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.result.GenreResult;
import com.schoolcloud.schoolshop.service.product.AttributeService;
import com.schoolcloud.schoolshop.service.product.ProductGenreService;
/**
 * 类型控制类
 * @author 长润
 *
 */
@Controller
@RequestMapping("admin/productgenre")
public class ProductGenreController {
	@Resource(name="productGenreService")
	private ProductGenreService productGenreService;
	@Resource(name="attributeService")
	private AttributeService attributeService;

	public AttributeService getAttributeService() {
		return attributeService;
	}

	public void setAttributeService(AttributeService attributeService) {
		this.attributeService = attributeService;
	}

	public ProductGenreService getProductGenreService() {
		return productGenreService;
	}

	public void setProductGenreService(ProductGenreService productGenreService) {
		this.productGenreService = productGenreService;
	}
	/**
	 * 类型列表
	 * @param start
	 * @param limit
	 * @return
	 */
	@RequestMapping(value="productGenreList.htm",method=RequestMethod.POST)
	@ResponseBody
	public QueryResult<ProductGenre>  productGenreList(Integer start,Integer limit) {
		QueryResult<GenreResult> result = new QueryResult<GenreResult>();
		return productGenreService.getScrollProductGenreData(start, limit);
	}
	/**
	 * 删除类型
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteProductGenre.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteProductGenre(Integer id){
		DataResult result = new DataResult();
		result.setSuccess(true);
		productGenreService.delete(id);
		result.setObj("删除类型成功！");
		return result;
	}
/**
 * 添加或者修改类型
 * @param productGenre
 * @param visibleGenre
 * @return
 */
	@RequestMapping(value="saveAndUpdateProductGenre.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult saveAndUpdateProductGenre(@ModelAttribute("genreForm") ProductGenre productGenre,Boolean visibleGenre ){
		DataResult result = new DataResult();
		if(productGenre.getId()!=null&&productGenre.getId()>=0){
			productGenreService.update(productGenre);
			if(visibleGenre=true){
				Attribute attribute = new Attribute();
				attribute.setProductGenre(productGenreService.getLastProductGenre());
				attributeService.save(attribute);
			}
			result.setSuccess(true);
			result.setObj("类型修改成功！");
		}else{
			productGenreService.save(productGenre);
			if(visibleGenre=true){
				Attribute attribute = new Attribute();
				attribute.setProductGenre(productGenreService.getLastProductGenre());
				attributeService.save(attribute);
			}
			result.setSuccess(true);
			result.setObj("类型添加成功！");
		}
		return result;
	}
	/**
	 * 得到所有类型
	 * @param id
	 * @return
	 */
	@RequestMapping(value="productGenres.htm",method=RequestMethod.POST)
	public String productGenres(HttpServletRequest request){
		List<ProductGenre> productGenres = productGenreService.getProductGenres();
		request.setAttribute("productGenres", productGenres);
		return "product/productGenres";
	}  

}

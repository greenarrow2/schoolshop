package com.schoolcloud.schoolshop.action.product;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.schoolcloud.schoolshop.bean.image.ImageHistory;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Brand;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.bean.product.ProductType;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.result.DataThreeResult;
import com.schoolcloud.schoolshop.service.image.StylePhotoService;
import com.schoolcloud.schoolshop.service.product.BrandService;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.service.product.ProductStyleService;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;
import com.schoolcloud.schoolshop.utils.JsonUtils;
import com.schoolcloud.schoolshop.utils.QiNuUtils;
import com.schoolcloud.schoolshop.utils.Utils;
/**
 * 商品控制类，负责商品的增删改查
 * @author 长润
 *
 */
@Controller
@RequestMapping("admin/product") 
public class ProductController {
	@Resource(name="productService")	
	private ProductService productService;
	@Resource(name="stylePhotoService")
	private StylePhotoService stylePhotoService;
	@Resource(name="productTypeService")
	private ProductTypeService productTypeService;
	@Resource(name="brandService")
	private BrandService brandService;
	@Resource(name="productStyleService")
	private ProductStyleService productStyleService;
	public ProductService getProductService() {
		return productService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	

	public StylePhotoService getStylePhotoService() {
		return stylePhotoService;
	}
	public void setStylePhotoService(StylePhotoService stylePhotoService) {
		this.stylePhotoService = stylePhotoService;
	}
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}
	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}
	
	public BrandService getBrandService() {
		return brandService;
	}
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	
	public ProductStyleService getProductStyleService() {
		return productStyleService;
	}
	public void setProductStyleService(ProductStyleService productStyleService) {
		this.productStyleService = productStyleService;
	}
	/**
	 * 添加或者修改商品
	 * @param product
	 * @return
	 */
	@RequestMapping(value="addOrUpdateProduct.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataThreeResult addOrUpdateProduct(@ModelAttribute("productForm") Product product,HttpServletRequest request) {
		DataThreeResult result = new DataThreeResult();
		if(product.getId()==null){
			if("".equals(product.getCreateTime())){
				product.setCreateTime(Utils.date);
			}
			productService.save(product);
			result.setSuccess(true);
			result.setObj("添加成功！");
		}else {
			product.setUpdateTime(Utils.date);
			productService.update(product);
			result.setSuccess(true);
			result.setObj("更新成功！");
		}
		if(request.getAttribute("productId")!=null){
			request.removeAttribute("productId");
		}
		Product pdt = productService.findLastOrProduct(product.getId());
		result.setData(pdt.getId());
		return result;
	}
	/**
	 * 添加或者修改商品
	 * @param product
	 * @return
	 */
	@RequestMapping(value="addProduct.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataThreeResult addProduct(@ModelAttribute("productForm") Product product,Integer brandId,HttpServletRequest request) {
		DataThreeResult result = new DataThreeResult();
			if("".equals(product.getCreateTime())){
				product.setCreateTime(Utils.date);
			}
			System.out.println("-----------------------"+brandId);
			if(brandId!=null && brandId>0){
			  Brand brand =	brandService.find(brandId);
			  product.setBrand(brand);
			}
			if(productService.isExist(product.getProductName())){
				result.setSuccess(false);
				result.setObj("该商品已经添加过，请重新添加！");
				return result;
			}
			productService.save(product);
			result.setSuccess(true);
			result.setObj("添加成功！");
		if(request.getAttribute("productId")!=null){
			request.removeAttribute("productId");
		}
		Product pdt = productService.findLastOrProduct(product.getId());
		result.setData(pdt.getId());
		return result;
	}
	/**
	 * 保存分类和新添加的属性
	 * @param product
	 * @return
	 */
	@RequestMapping(value="addTypeAttrs.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult addTypeAttrs(String[] attributeName,String[] attributeValue,Integer typeId,Integer productId) {
		DataResult result = new DataResult();
		if(productId!=null && typeId !=null){
			productService.addTypeAttrs(attributeName, attributeValue, typeId, productId);
			result.setSuccess(true);
			result.setObj("添加成功！");
			return result;
		}
		result.setSuccess(false);
		result.setObj("添加失败！");
		return result;
	}
	/**
	 * 
	 * @param start
	 * @param limit
	 * @param productName
	 * @param visible
	 * @param beginTime
	 * @param endTime
	 * @param recommendRank
	 * @param mark
	 * @param productTypeId
	 * @param sort
	 * @param sortType
	 * @return
	 */
	@RequestMapping(value="productList.htm",method=RequestMethod.POST)
	@ResponseBody
	public QueryResult<Product> productList(Integer start, Integer limit, String productName,Boolean visible,String beginTime,String endTime,Integer recommendRank,Integer mark,Integer productTypeId,String sort,Integer sortType,Integer timeType) {
		QueryResult<Product> queryResult =	productService.getScrollProductData(start, limit, productName, visible, beginTime, endTime,timeType, recommendRank, mark, productTypeId, sort, sortType,false);
		return queryResult;
	}

	/**
	 * 上下架商品
	 * @param id
	 * @param visible
	 * @return
	 */
	@RequestMapping(value="updateProductVisible.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult updateProductVisible(Integer id,Boolean visible) {
		DataResult result = new DataResult();
		Product product =  productService.find(id);
		result.setSuccess(true);
		if(visible){
			product.setVisible(false);
			result.setObj("商品下架成功！");
		}else {
			product.setVisible(true);
			result.setObj("商品上架成功！");
		}
		productService.update(product);   
		return  result;
	} 
	/**
	 * 删除商品
	 * @return
	 */
	@RequestMapping(value="deleteProduct.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteProduct(Integer id) {
		DataResult result = new DataResult();
		productService.delete(id);
		result.setSuccess(true);
		result.setObj("商品删除成功！");
		return result;
	}
	/**
	 * 分组删除商品
	 * @return
	 */
	@RequestMapping(value="deleteProducts.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteProducts(@RequestParam(value = "ids[]")Integer[] ids) {
		DataResult result = new DataResult();
		for (Integer id : ids) {
			productService.delete(id);
		}
		result.setSuccess(true);
		result.setObj("商品删除成功！");
		return result;
	}
	/**
	 * 上传商品图片
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="saveProductImage.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult  saveProductImage(@RequestParam MultipartFile[] photos,Integer id,String[] styleName,HttpServletRequest request) {
		DataResult result = new DataResult();
		String realPath = request.getSession().getServletContext().getRealPath("/upload");
		System.out.println(realPath);
		Product product = productService.find(id);
		List<String> realPathList = new ArrayList<String>();
		for (int i = 0; i < photos.length; i++) {
			String name = photos[i].getOriginalFilename();
			if(name!=null&&!"".equals(name)){
				String realFliePath = Utils.uploadphoto(realPath, name, photos[i]);
				File file = new File(realFliePath);
				try {
					FileUtils.copyInputStreamToFile(photos[i].getInputStream(), file);
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					result.setSuccess(false);
					result.setObj("图片上传失败！");
					e.printStackTrace();
					return result;
				}
				String a =  realFliePath.replace(realPath, "");
				String b = "upload"+a;
			    ProductStyle style = new ProductStyle();
			    style.setProduct(product);
			    style.setName(styleName[i]);
			    style.setImagename(b);
				productStyleService.save(style);
				realPathList.add(b);
			}
		}
		result.setSuccess(true);
		result.setObj(realPathList);
		return result;
	}
	/**
	 * 上传商品封面
	 * @param cover
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value="saveProductCover.htm",method=RequestMethod.POST)
	@ResponseBody
	@Transactional
	public DataResult saveProductCover(@RequestParam MultipartFile cover,Integer id,HttpServletRequest request){
		DataResult result = new DataResult();
		//String realPath = request.getSession().getServletContext().getRealPath("/upload");
		String realPath = QiNuUtils.QN_HEAD_DOMAIN;
		Product product = productService.find(id);
		String name = cover.getOriginalFilename();
		if(name!=null&&!"".equals(name)){
			String upName = Utils.reNameImage(name);
			try {
				QiNuUtils.uploadHead(cover.getBytes(),upName);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			String imagePath = realPath+"/"+upName;
			product.setCoverUrl(imagePath);
			productService.update(product);
			result.setSuccess(true);
			result.setObj(imagePath);
			return result;
		}
		result.setSuccess(false);
		result.setObj("封面上传失败！");
		return result;
	}
}
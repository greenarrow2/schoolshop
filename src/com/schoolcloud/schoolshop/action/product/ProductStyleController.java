package com.schoolcloud.schoolshop.action.product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.schoolcloud.schoolshop.bean.image.StylePhoto;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.service.image.StylePhotoService;
import com.schoolcloud.schoolshop.service.product.ProductStyleService;
import com.schoolcloud.schoolshop.utils.QiNuUtils;
import com.schoolcloud.schoolshop.utils.Utils;

@Controller
@RequestMapping("admin/productstyle")
public class ProductStyleController {
	private Logger log = Logger.getLogger(ProductStyleController.class);
	@Resource(name="productStyleService")
	private ProductStyleService productStyleService;
	@Resource(name="stylePhotoService")
    private StylePhotoService stylePhotoService;
	public ProductStyleService getProductStyleService() {
		return productStyleService;
	}

	public void setProductStyleService(ProductStyleService productStyleService) {
		this.productStyleService = productStyleService;
	}
    
	public StylePhotoService getStylePhotoService() {
		return stylePhotoService;
	}

	public void setStylePhotoService(StylePhotoService stylePhotoService) {
		this.stylePhotoService = stylePhotoService;
	}

	@RequestMapping(value="productStyleList.htm",method=RequestMethod.POST)
	@ResponseBody
	public QueryResult<ProductStyle> productStyleList(Integer start,Integer limit,String name,String productName,Integer timeType,String beginTime,String endTime,Boolean visible) {
            QueryResult<ProductStyle> psqr = productStyleService.getScrollProductStyleData(start, limit, name,productName, timeType, beginTime, endTime, visible);
		return psqr;
	}
	/**
	 * 删除样式
	 * @param styleId 样式id
	 * @return
	 */
	@RequestMapping(value="deleteProductStyle.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteProductStyle(Integer id) {
		DataResult result = new DataResult();
		result.setSuccess(true);
		ProductStyle productStyle =  productStyleService.find(id);
		if(productStyle!=null){
		Set<StylePhoto> stylePhotos = productStyle.getStylePhotos();
		for (StylePhoto stylePhoto : stylePhotos) {
			stylePhotoService.deleteImage(stylePhoto.getId());
		    }
		}
		if(id!=null&&id>0){
		productStyleService.delete(id);
		}
		result.setObj("删除成功！");
		return result;
	}
	/**
	 * 删除样式相册
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteStylePhoto.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult deleteStylePhoto(Integer id) {
		DataResult result = new DataResult();
		result.setSuccess(true);
		stylePhotoService.deleteImage(id);
		result.setObj("删除成功！");
		return result;
	}
	
	/**
	 * 上下架样式
	 * @param id
	 * @return
	 */
	@RequestMapping(value="updateStyleVisible.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult updateStyleVisible(Integer id,Boolean visible) {
		DataResult result = new DataResult();
		result.setSuccess(true);
		ProductStyle productStyle =  productStyleService.find(id);
		if(visible){
		 productStyle.setVisible(false);
		 result.setObj("下架成功！");
		}else {
		 productStyle.setVisible(true);
		 result.setObj("上架成功！");
		}
		productStyleService.update(productStyle);
		return result;
	}
	/**
	 * 更新样式
	 * @param productStyle
	 * @return
	 */
	public DataResult updateProductStyle(@ModelAttribute("styleForm") ProductStyle productStyle) {
		DataResult result = new DataResult();
		result.setSuccess(true);
		productStyleService.update(productStyle);
		result.setObj("样式更新成功！");
		return result;
	}
	
	/**
	 * 上传商品样式相册
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="saveStylePhotos.htm",method=RequestMethod.POST)
	@ResponseBody
	public DataResult  saveStylePhotos(@RequestParam MultipartFile[] stylePhotos,Integer id,HttpServletRequest request) {
		DataResult result = new DataResult();
		//String realPath = request.getSession().getServletContext().getRealPath("/upload");
		String realPath = QiNuUtils.QN_IMAGE_DOMAIN;
		ProductStyle style = productStyleService.find(id);
		List<String> realPathList = new ArrayList<String>();
		for (int i = 0; i < stylePhotos.length; i++) {
			String name = stylePhotos[i].getOriginalFilename();
			if(!StringUtils.isEmpty(name)){
				String upName = Utils.reNameImage(name);
				try {
					QiNuUtils.uploadImage(stylePhotos[i].getBytes(),upName);
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					log.error("image upload error!");
					result.setSuccess(false);
					result.setObj("图片上传失败！");
					e.printStackTrace();
					return result;
				
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					log.error("image upload error!");
				}
				String imagePath = realPath+"/"+upName;
			    StylePhoto stylePhoto = new StylePhoto();
			    stylePhoto.setStyle(style);
			    stylePhoto.setUrl(imagePath);
				stylePhotoService.saveImage(stylePhoto);
				realPathList.add(imagePath);
			}
		}
		result.setSuccess(true);
		result.setObj(realPathList);
		return result;
	}
}

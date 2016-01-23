package com.schoolcloud.schoolshop.service.image;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.schoolcloud.schoolshop.bean.image.ImageHistory;
import com.schoolcloud.schoolshop.bean.image.StylePhoto;
/**
 * 
 * @author 长润
 *
 */
public interface StylePhotoService {
	/**
	 * 保存图片
	 * @param imageHistory
	 */
	public void saveImage(StylePhoto stylePhoto);
	/**
	 * 修改图片
	 * @param imageHistory
	 */
	public void updateImage(StylePhoto stylePhoto);
	/**
	 * 删除图片
	 * @param imageHistory
	 */
	public void deleteImage(Serializable id);
	/**
	 * 批量删除图片
	 * @param imageHistory
	 */
	public void deleteImage(Serializable...ids);
	/**
	 * 得到图片实体
	 * @param id 图片id
	 */
	public StylePhoto findImage(Serializable id);
	/**
	 * 根据样式得到该样式的相册
	 * @param styleId
	 * @return
	 */
	public List<StylePhoto> getImages(Integer styleId);
}

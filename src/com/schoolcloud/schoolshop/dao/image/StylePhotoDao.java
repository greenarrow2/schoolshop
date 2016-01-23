package com.schoolcloud.schoolshop.dao.image;

import java.util.List;

import com.schoolcloud.schoolshop.bean.image.ImageHistory;
import com.schoolcloud.schoolshop.bean.image.StylePhoto;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface StylePhotoDao extends DAO<StylePhoto>{
	/**
	 * 根据图片样式得到该样式的相册
	 * @return
	 */
public List<StylePhoto> getImages(Integer styleId);
}

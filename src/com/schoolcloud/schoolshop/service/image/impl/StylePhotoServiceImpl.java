package com.schoolcloud.schoolshop.service.image.impl;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.schoolcloud.schoolshop.bean.image.StylePhoto;
import com.schoolcloud.schoolshop.dao.image.StylePhotoDao;
import com.schoolcloud.schoolshop.service.image.StylePhotoService;
@Service("stylePhotoService")
@Transactional
public class StylePhotoServiceImpl implements StylePhotoService{
	@Resource(name="stylePhotoDao")
   private StylePhotoDao stylePhotoDao;
	 
  
	public StylePhotoDao getStylePhotoDao() {
		return stylePhotoDao;
	}

	public void setStylePhotoDao(StylePhotoDao stylePhotoDao) {
		this.stylePhotoDao = stylePhotoDao;
	}

	@Override
	public void saveImage(StylePhoto stylePhoto) {
		// TODO 自动生成的方法存根
		stylePhotoDao.save(stylePhoto);;
	}

	@Override
	public void updateImage(StylePhoto stylePhoto) {
		// TODO 自动生成的方法存根
		stylePhotoDao.update(stylePhoto);
	}

	@Override
	public void deleteImage(Serializable id) {
		// TODO 自动生成的方法存根
		stylePhotoDao.delete(id);
	}

	@Override
	public StylePhoto findImage(Serializable id) {
		// TODO 自动生成的方法存根
		return stylePhotoDao.find(id);
	}

	@Override
	public void deleteImage(Serializable... ids) {
		// TODO 自动生成的方法存根
		stylePhotoDao.delete(ids);
	}

	@Override
	public List<StylePhoto> getImages(Integer styleId) {
		// TODO 自动生成的方法存根
		return stylePhotoDao.getImages(styleId);
	}

}

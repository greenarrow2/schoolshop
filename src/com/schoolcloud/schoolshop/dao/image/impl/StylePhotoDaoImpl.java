package com.schoolcloud.schoolshop.dao.image.impl;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.schoolcloud.schoolshop.bean.image.StylePhoto;
import com.schoolcloud.schoolshop.dao.base.impl.DAOSuport;
import com.schoolcloud.schoolshop.dao.image.StylePhotoDao;
/**
 * 图片存储历史记录
 * @author 长润
 *
 */
@Repository("stylePhotoDao")
public class StylePhotoDaoImpl extends DAOSuport<StylePhoto> implements
    StylePhotoDao {

	@Override
	public List<StylePhoto> getImages(Integer styleId) {
		// TODO 自动生成的方法存根
		String jpql = "select o from StylePhoto o  where o.type.id = ?1";
		return em.createQuery(jpql).setParameter(1,styleId).getResultList();
	}
	
}

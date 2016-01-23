package com.schoolcloud.schoolshop.utils;

import java.awt.image.BufferedImage;
import java.io.InputStream;

import org.apache.log4j.Logger;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

 

public class QiNuUtils {
	public static final Logger log = Logger.getLogger(ConfigUtils.class);
	public static UploadManager uploadManager = new UploadManager();
	public static  BucketManager bucketManager = null;
	public static final String QN_API_KEY;
	public static final String QN_SECRTE_KEY;
	public static final String QN_HEAD_BUCKET;
	public static final String QN_HEAD_DOMAIN;
	public static final String QN_IMAGE_BUCKET;
	public static final String QN_IMAGE_DOMAIN;
	public static final long QN_EXPIRES;
	static{
		QN_API_KEY=ConfigUtils.getText("QN_API_KEY");
		QN_SECRTE_KEY=ConfigUtils.getText("QN_SECRTE_KEY");
		QN_HEAD_BUCKET=ConfigUtils.getText("QN_HEAD_BUCKET");
		QN_HEAD_DOMAIN=ConfigUtils.getText("QN_HEAD_DOMAIN");
		QN_IMAGE_BUCKET=ConfigUtils.getText("QN_IMAGE_BUCKET");
		QN_IMAGE_DOMAIN=ConfigUtils.getText("QN_IMAGE_DOMAIN");
		QN_EXPIRES=Long.parseLong(ConfigUtils.getText("QN_EXPIRES"));
	}
	
	public static Response uploadHead(byte[] filePath,String fileName) throws Exception{
		 Auth auth = Auth.create(QN_API_KEY, QN_SECRTE_KEY);
		 Response res = null;
		 try {
		        res = uploadManager.put(filePath, fileName,auth.uploadToken(QN_HEAD_BUCKET));
		    } catch (QiniuException e) {
		    	log.error("QiNiu upload："+e.getMessage());
		    }
		 return res;
	}
	
	public static Response uploadImage(byte[] filePath,String fileName) throws Exception{
		 Auth auth = Auth.create(QN_API_KEY, QN_SECRTE_KEY);
		 Response res = null;
		 try {
		        res = uploadManager.put(filePath, fileName,auth.uploadToken(QN_IMAGE_BUCKET));
		    } catch (QiniuException e) {
		    	log.error("QiNiu upload："+e.getMessage());
		    }
		 return res;
	}
	
	public static String delete() throws Exception{
		Auth auth = Auth.create(QN_API_KEY, QN_SECRTE_KEY);
		bucketManager = new BucketManager(auth);
		bucketManager.delete(QN_HEAD_BUCKET, "283_thumb_G_1382894277808.jpg");
		return null;
	}
}

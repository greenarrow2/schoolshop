package com.schoolcloud.schoolshop.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import com.schoolcloud.schoolshop.bean.result.DataResult;

/**
 * 日器自动生成
 * skyId的自动生成是按日期和时间来生成的
 * @author 长润
 *
 */
public class Utils {
	/**
	 * 日期类
	 */
	public static String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format( new Date());
	/**
	 * skyId唯一标示
	 */
	public static String skyID = only();
	public static String orderId = onlyOrderId();
	public static String photoID = (new SimpleDateFormat("yyMMddHHmmss").format( new Date())+System.currentTimeMillis());
	/**
	 * 
	 * @param realPath 图片存放路径
	 * @param name 图片名称
	 * @param photo 所上传的图片
	 * @return
	 */
	public static String  uploadphoto(String realPath,String name,MultipartFile photo){
		 String rename =  (new SimpleDateFormat("yyMMddHHmmss").format( new Date())+System.currentTimeMillis());
		    String newName = rename + name.substring(name.length()-6, name.length());
		    String realFliePath = realPath+"/"+newName;
			return realFliePath;
	}
	/**
	 * 重命名图片
	 * @param name
	 * @return
	 */
	public static String  reNameImage(String name){
		 String rename =  (new SimpleDateFormat("yyMMddHHmmss").format( new Date())+System.currentTimeMillis());
		    String newName = rename + name.substring(name.length()-6, name.length());
			return newName;
	}
	public static String  only() {
			Random r = new Random();
			int ran =  r.nextInt(1000);
		return (new SimpleDateFormat("yyMMddHHmmss").format( new Date())+System.currentTimeMillis()).toString().substring(0, 16)+ran;
	}
	public static String  onlyOrderId() {
		Random r = new Random();
		int ran =  r.nextInt(100);
		return (new SimpleDateFormat("yyMMddHHmmss").format( new Date())+System.currentTimeMillis()).toString().substring(0, 16)+ran;
	}
	
	public static void main(String[] args) {
		String a = "wtpwebapps\\schoolshop\\upload";
		String b = "wtpwebapps\\schoolshop\\upload\\aaaaa.jpg";
		String c = b.replace(a, "");
		System.out.println("/upload"+c);
	}
} 
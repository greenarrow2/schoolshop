package com.schoolcloud.schoolshop.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.catalina.util.DateTool;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.dao.admin.AdminDao;
import com.schoolcloud.schoolshop.dao.product.ProductDao;
import com.schoolcloud.schoolshop.service.product.ProductGenreService;
import com.schoolcloud.schoolshop.service.product.ProductService;
import com.schoolcloud.schoolshop.utils.Utils;

public class Test1 {
	   protected static ProductDao pdao = null;
	   protected static ProductService ps = null;
	   protected static ProductGenreService userService = null;
	   protected static AdminDao adminDao = null;
	   
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
			pdao = (ProductDao)ap.getBean("productDao");
			ps = (ProductService)ap.getBean("productService");
			adminDao = (AdminDao) ap.getBean("adminDao");
			//userService = (ProductGenreService)ap.getBean("productDao");
		}

	@Test
	public void test() {
		 String b = Utils.date;
		 String e = Utils.date;
		Date date = new Date();
		System.out.println();
		 System.out.println(b.substring(0, 10)+ " 00:00:00");
		 /*System.out.println(b.substring(0, 9)+ b.+" 00:00:00");*/
	}
    @Test
	public void test1(){
    	ps.delete(1);
	}
}

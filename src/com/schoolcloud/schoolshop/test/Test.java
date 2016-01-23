package com.schoolcloud.schoolshop.test;


import java.util.List;

import javax.persistence.Cache;

import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.schoolcloud.schoolshop.bean.admin.Admin;
import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.dao.admin.AdminDao;
import com.schoolcloud.schoolshop.dao.product.ProductDao;
import com.schoolcloud.schoolshop.dao.school.SchoolDao;
import com.schoolcloud.schoolshop.service.product.ProductGenreService;

public class Test {
   protected static ProductDao pdao = null;
   protected static ProductGenreService userService = null;
   protected static AdminDao adminDao = null;
   protected static SchoolDao schoolDao = null;
   
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		pdao = (ProductDao)ap.getBean("productDao");
		adminDao = (AdminDao) ap.getBean("adminDao");
		schoolDao = (SchoolDao) ap.getBean("schoolDao");
		//userService = (ProductGenreService)ap.getBean("productDao");
	}

	@org.junit.Test
	public void test() {
		List<String> admins = adminDao.findAdmin1();
		for (String admin : admins) {
			System.out.println(admin);
		}
		List<Admin> adms = adminDao.findAdmin2();
		for (Admin admin : adms) {
			System.out.println(admin.getAdminName()+admin.getPassword());
		}
		List<Admin> adms3 = adminDao.findAdmin3();
		for (Admin admin : adms3) {
			System.out.println(admin.getAdminName()+admin.getPassword());
		}
		List<Admin> adms4 = adminDao.findAdmin4();
		for (Admin admin : adms4) {
			System.out.println(admin.getAdminName()+admin.getPassword()+"4");
		}
	 
		List<String> adms5 = adminDao.findAdmin5();
		for (String admin : adms5) {
			System.out.println(admin+"5");
		}
	}
	@org.junit.Test
	public void test3() {
		List<Admin> adms = adminDao.findAdmin2();
		for (Admin admin : adms) {
			System.out.println(admin.getAdminName()+admin.getPassword());
		}
		List<Admin> admss = adminDao.findAdmin2();
		for (Admin admin : admss) {
			System.out.println(admin.getAdminName()+admin.getPassword());
		}
		List<Admin> admsss = adminDao.findAdmin2();
		for (Admin admin : admsss) {
			System.out.println(admin.getAdminName()+admin.getPassword());
		}
		List<Admin> admssss = adminDao.findAdmin2();
		for (Admin admin : admssss) {
			System.out.println(admin.getAdminName()+admin.getPassword());
		}
		List<String> adms5 = adminDao.findAdmin5();
		for (String admin : adms5) {
			System.out.println(admin+"5");
		}
	}
	@org.junit.Test
	public void test4(){
	List<Product> p =	pdao.queryProductCache();
	for (Product product : p) {
		System.out.println(product.getProductName());
	}
	List<Product> pp =	pdao.queryProductCache();
	for (Product product : pp) {
		System.out.println(product.getProductName());
	}
	}
	@org.junit.Test
   public void test6(){
	   System.out.println(adminDao.findAdmin6(100).getAdminName());
   }
	@org.junit.Test
	public void test7z(){
		System.out.println(schoolDao.isExistSchoolBySchoolName("河南科技学院"));
		System.out.println(schoolDao.getScrollDataCache(-1, -1, null, null, null).getTotal());
		System.out.println(schoolDao.getScrollDataCache(-1, -1, null, null, null).getTotal());
		System.out.println(schoolDao.getScrollDataCache(-1, -1, null, null, null).getTotal());
	}
}
 

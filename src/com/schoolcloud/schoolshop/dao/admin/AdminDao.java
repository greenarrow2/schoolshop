package com.schoolcloud.schoolshop.dao.admin;

import java.util.List;

import com.schoolcloud.schoolshop.bean.admin.Admin;
import com.schoolcloud.schoolshop.dao.base.DAO;

public interface AdminDao extends DAO<Admin> {
public String findByAdminName(String adminName);
public List<Admin> findAdmin();
public List<String> findAdmin1();
public List<Admin> findAdmin2() ;
public List<Admin> findAdmin3();
public List<Admin> findAdmin4();
public List<String> findAdmin5();
public Admin findAdmin6(Integer id);
}

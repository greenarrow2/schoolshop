package com.schoolcloud.schoolshop.action.admin;

import javax.annotation.Resource;
import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.admin.Admin;
import com.schoolcloud.schoolshop.bean.page.PageView;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.service.admin.AdminService;
import com.schoolcloud.schoolshop.utils.Utils;

@Controller
@RequestMapping("admin/admin")
public class AdminController {
public static Logger log = Logger.getLogger(AdminController.class);
@Resource(name="adminService")
private AdminService adminService;

public AdminService getAdminService() {
	return adminService;
}

public void setAdminService(AdminService adminService) {
	this.adminService = adminService;
}
/**
 * 添加和更新管理员信息
 * @param admin
 * @return
 */
@RequestMapping(value="addOrUpdateAdmin.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult addOrUpdateAdmin(@ModelAttribute("adminForm") Admin admin,String rePassword){
	DataResult result = new DataResult();
	if(admin.getPassword()!=null&&!"".equals(admin.getPassword().trim())&&rePassword!=null&&!"".equals(rePassword.trim())&&!admin.getPassword().equals(rePassword)){
		result.setSuccess(false);
		result.setObj("密码不能为空或者密码和确认密码不相同！");
		return result;
	}
	if(admin.getId()==null&&adminService.isExistAdminByAdminName(admin.getAdminName())){
		result.setSuccess(false);
		result.setObj("管理员用户名有重复，请重新改写用户名！");
		return result;
	}
	try {
		if(admin.getId()!=null&&admin.getId()>0){
			admin.setUpdateTime(Utils.date);
			adminService.update(admin);
			result.setSuccess(true);
			result.setObj("管理员信息更新成功！");
		}else {
			adminService.save(admin);
			result.setSuccess(true);
			result.setObj("管理员信息添加成功！");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		result.setSuccess(false);
		result.setObj("服务器内部异常！");
		return result;
	}
	
	return result;
}
/**
 * 得到管理员列表
 * @param start
 * @param limit
 * @param visible
 * @param adminName
 * @param realName
 * @return
 */
@RequestMapping(value="adminList.htm")
@ResponseBody
public PageView<Admin> adminList(Integer currentPage, Integer limit,Boolean visible,String adminName,String realName) {
	Integer start;
	if(currentPage ==null || currentPage == 1){
		start = 0;
		currentPage = 1;
	}else {
		start = (currentPage-1)*10;
	}
 QueryResult<Admin> qr =	adminService.getScrollAdminData(start, 10, visible, adminName, realName, null);
 PageView<Admin> pv = new PageView<Admin>(10, currentPage);
 pv.setRecords(qr.getRows());
 pv.setTotalRecord(qr.getTotal());
 return pv;
}


@RequestMapping(value="updateAdminVisible.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult updateAdminVisible(Integer id,Boolean visible) {
	DataResult result = new DataResult();
	result.setSuccess(true);
	Admin admin = adminService.find(id);
	if(visible){
		admin.setVisible(!visible);
		result.setObj("管理员冻结成功！");
	}else {
		admin.setVisible(!visible);
		result.setObj("管理员解冻成功！");
	}
	adminService.update(admin);
	return result;
}
@RequestMapping(value="deleteAdmin.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult deleteAdmin(Integer id) {
	log.info("我爱你！");
	DataResult result = new DataResult();
	if(id!=null){
	result.setObj(true);
    adminService.delete(id);
	result.setObj("管理员删除成功！");
	return result;
	}else {
		result.setObj(false);
		result.setObj("传值异常！");	
		return result;
	}
}
/**
 * 批量删除管理员
 * @param ids
 * @return
 */
@RequestMapping(value="deleteAdmins.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult deleteAdmins(@RequestParam(value = "ids[]")Integer[] ids) {
	DataResult result = new DataResult();
	result.setObj(true);
	adminService.delete(ids);
	result.setObj("批量管理员删除成功！");
	return result;
}
@RequestMapping(value="getAdmin.htm")
public String getAdmin(HttpServletRequest request){
	request.setAttribute("admins", adminService.getAdmins());
	return "../../index";
}
@RequestMapping(value="adminLogin.htm",method=RequestMethod.POST)
public String adminLogin(String username,String password,String valid_code){
	System.out.println("aaaaaaaaaa"+username+"----"+password+"-----"+valid_code);
	return "redirect:../../admin/adminEnter.htm";
}
}

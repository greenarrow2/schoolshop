package com.schoolcloud.schoolshop.action.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.service.user.UserService;
/**
 * 用户控制类对用户进行增删改查
 * @author 长润
 *
 */
@Controller
@RequestMapping("admin/user")
public class UserController {
@Resource(name="userService")
private UserService userService;

public UserService getUserService() {
	return userService;
}

public void setUserService(UserService userService) {
	this.userService = userService;
}
@RequestMapping(value="userList.htm")
@ResponseBody
public QueryResult<User> getUserList(Integer start,Integer limit){
	QueryResult<User> userList = userService.getScrollUserData(start, limit);
	return userList;
}
@RequestMapping(value="userDelete.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult getUserList(Integer id){
	  userService.delete(id);
	  DataResult result = new DataResult();
	  result.setSuccess(true);
	  result.setObj("用户删除成功！");
	return result;
}
@RequestMapping(value="index.htm",method=RequestMethod.POST)
@ResponseBody
public void login(){
	
	
}
}

package com.schoolcloud.schoolshop.action.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.util.MD5Encoder;
import org.apache.commons.lang.Validate;
import org.apache.el.util.Validation;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.user.User;
import com.schoolcloud.schoolshop.service.user.UserService;

@Controller
@RequestMapping("front/user")
public class FrontUserController {
public static final Logger log = Logger.getLogger(FrontUserController.class);
@Resource(name="userService")
private UserService userService;

public UserService getUserService() {
	return userService;
}

public void setUserService(UserService userService) {
	this.userService = userService;
}
/**
 * 登录
 * @param userName 用户名
 * @param password 密码
 * @param request
 * @return
 */
@RequestMapping(value="login.htm",method=RequestMethod.POST)
public String login(String userName,String password,String verifyCode, HttpServletRequest request){
	User user = userService.isExist(userName, password);
	if(verifyCode!=null&&!"".equals(verifyCode.trim())){
	if(user!=null&&verifyCode.equalsIgnoreCase(request.getSession().getAttribute("validateCode").toString())){
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		return "redirect:../../front/main/index.htm";
	}else {
		return "../../front/user/login";
	     }
	}else {
		log.info("用户验证码为："+verifyCode);
		return "../../front/user/login";
	}
	}
/**
 * 退出登录
 * @param request
 * @return
 */
@RequestMapping(value="logout.htm")
public String logout(HttpServletRequest request) {
	HttpSession session = request.getSession();
	 session.removeAttribute("user");
	 if (session.getAttribute("user")==null) {
		 return "../../front/user/login";
	}else {
		 return "redirect:../../front/main/index.htm";
	}
}
@RequestMapping(value="regist.htm",method=RequestMethod.POST)
public String regist(@ModelAttribute("userForm")User user,HttpServletRequest request) {
	userService.save(user);
	HttpSession session = request.getSession();
	session.setAttribute("user", user);
	log.info("用户："+user.getNickName()+"已注册上了！");
	return "../../front/main/index";
}
/**
 * 验证用户名是否重复
 * @param userName
 * @return
 */
@RequestMapping(value="userNameVerification.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult userNameVerification(String userName) {
	DataResult result = new DataResult();
	if(userService.isExistUserName(userName)){
	result.setSuccess(true);
	result.setObj("你输入的用户名已经存在！");
	}else{
		result.setSuccess(false);
		result.setObj("");
	}
	return result;
}
}

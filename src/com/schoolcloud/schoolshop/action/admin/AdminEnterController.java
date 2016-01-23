package com.schoolcloud.schoolshop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin")
public class AdminEnterController {
/**
 * 后台界面框架
 * 东西南北 
 * 东East 西West 南South 北North
 * @return
 */
@RequestMapping(value="adminEnter.htm")
public String adminEnter(){
	return "controllercenter/main";
}
/**
 * 后台界面框架
 * 东西南北 
 * 东East 西West 南South 北North
 * @return
 */
@RequestMapping(value="adminLogin.htm")
public String adminLogin(){
	return "login";
}
}

package com.schoolcloud.schoolshop.utils;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schoolcloud.schoolshop.bean.shopping.BuyCart;
import com.schoolcloud.schoolshop.bean.user.User;

public class WebUtil {
	/**
	 * 获取购物车
	 * @param request
	 * @return
	 */
	public static BuyCart getBuyCart(HttpServletRequest request){
		return (BuyCart)request.getSession().getAttribute("buyCart");
	}
	/**
	 * 获取登录用户
	 */
	public static User getBuyer(HttpServletRequest request){
		return (User) request.getSession().getAttribute("user");
	}
	/**
	 * 添加cookie
	 * @param response
	 * @param name cookie的名称
	 * @param value cookie的值
	 * @param maxAge cookie存放的时间(以秒为单位,假如存放三天,即3*24*60*60; 如果值为0,cookie将随浏览器关闭而清除)
	 */
	public static void addCookie(HttpServletResponse response,String name,String value,int maxAge) {
		Cookie cookie = new Cookie(name, value);
		cookie.setPath("/");
		if(maxAge>0)
			cookie.setMaxAge(maxAge);
		response.addCookie(cookie);
	}
	 /**
     * 获取cookie的值
     * @param request
     * @param name cookie的名称
     * @return
     */
	public static String getCookieByName(HttpServletRequest request,String name) {
		Map<String, Cookie> cookieMap = WebUtil.readCookieMap(request);
		if (cookieMap.containsKey(name)) {
			Cookie cookie = cookieMap.get(name);
			return cookie.getValue();
		}else {
			return null;
		}
	}
	
	public static Map<String, Cookie> readCookieMap(HttpServletRequest request) {
		Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			for (int i = 0; i < cookies.length; i++) {
				cookieMap.put( cookies[i].getName(),  cookies[i]) ;
			}
		}
		return cookieMap;
	}
}

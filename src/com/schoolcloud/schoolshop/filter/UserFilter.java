package com.schoolcloud.schoolshop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.schoolcloud.schoolshop.bean.user.User;

/**
 * Servlet Filter implementation class UserFilter
 */
public class UserFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        String nowUrl = (String) session.getAttribute("nowUrl");
        if(nowUrl!=null&&!"".equals(nowUrl)){
        	session.removeAttribute("nowUrl");
        }
        String url = req.getRequestURI();
        if(url.endsWith(".htm")||url.endsWith(".jsp")){
        session.setAttribute("nowUrl", url);
        }
        System.out.println(url);
        if(user!=null){
        	chain.doFilter(req, res);
        }else if (url.endsWith(".js")||url.endsWith(".css")||url.endsWith(".png")||url.endsWith(".jpg")||url.endsWith(".gif")||url.endsWith(".html")) {
        	chain.doFilter(req, res);
		} else if(url.endsWith("user/login.jsp")){
        	chain.doFilter(req, res);
		}else if (url.contains("user/login.htm")||url.contains("main")||url.contains("cart")||url.contains("product")||url.contains("share")||url.contains("shopping")||url.contains("cartmanage")||url.contains("admin")) {
			chain.doFilter(req, res);
		}else if(url.contains("index.jsp")){
			chain.doFilter(req, res);
		}else if(url.contains("createCode.htm")){
			chain.doFilter(req, res);
		}else{
			res.sendRedirect("../../front/user/login.jsp ");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

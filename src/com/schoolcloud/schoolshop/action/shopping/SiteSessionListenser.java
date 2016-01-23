package com.schoolcloud.schoolshop.action.shopping;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SiteSessionListenser implements HttpSessionListener {
	private static Map<String, HttpSession> sessions = new HashMap<String, HttpSession>();
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		// TODO 自动生成的方法存根
		sessions.put(event.getSession().getId(), event.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO 自动生成的方法存根
		sessions.remove(event.getSession().getId());
	}
    public static HttpSession getSession(String sessionID) {
		return sessions.get(sessionID);
	}
    
    public static void removeSession(String sessionID)
	{
		if(sessionID!=null)
		{
			sessions.remove(sessionID);
		}
	}
}

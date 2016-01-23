package com.schoolcloud.schoolshop.utils;

import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

public class ConfigUtils {
	private static final Logger log = Logger.getLogger(ConfigUtils.class);
	static Properties p = null;
	static{
		p = new Properties();
		try {
			p.load(ConfigUtils.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			log.error("config.properties load :"+e.getMessage());
		}
	}
	/**
	 * 根据key得到其值
	 * @param key
	 * @return
	 */
	public static String getText(String key) {
		String str = p.getProperty(key);
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(getText("QN_API_KEY"));
	}
	
}

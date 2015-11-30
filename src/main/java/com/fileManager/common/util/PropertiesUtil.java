package com.fileManager.common.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * 项目名称:fileManager
 * 创建日期:2015年9月11日下午2:11:53
 * 描述: 读取配置文件
 * @author Administrator
 * @version 
 */
public class PropertiesUtil {

	private static Properties properties = null;

	private static String config = "config.properties";

	static {
		Resource resource = new ClassPathResource(config);
		try {
			properties = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e1) {
			properties = null;
		}
	}

	public static String getPropertiesValueByKey(String key) {
		if (properties != null) {
			return properties.getProperty(key);
		} else {
			return "不存在" + config + "文件";
		}
	}
}

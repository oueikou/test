package com.fileManager.common.util;

import java.util.UUID;
/**
 * 项目名称:fileManager
 * 创建日期:2015年9月11日下午1:27:09
 * 描述: UUID工具类
 * @author Administrator
 * @version 
 */
public class UUIDGenerator {
	public UUIDGenerator() {
	}

	/**
	 * 描述： 获取UUID
	 *
	 * @author Administrator
	 * @return
	 */
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	/**
	 * 描述： 获取UUID，去掉“-”
	 *
	 * @author Administrator
	 * @return
	 */
	public static String getUUIDWithoutHyphen(){
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString();
		// 去掉"-"符号
		uuidStr = uuidStr.substring(0, 8) + uuidStr.substring(9, 13) + uuidStr.substring(14, 18) + uuidStr.substring(19, 23) + uuidStr.substring(24);
		return uuidStr;
	}
	
	/**
	 * 描述： 测试
	 */
	public static void main(String[] args) {
		System.out.println(getUUIDWithoutHyphen());
	}
	
}

package com.fileManager.common.util;

import java.util.Random;
/**
 * 项目名称:fileManager
 * 创建日期:2015年9月11日下午1:10:36
 * 描述: 公共工具类
 * @author Administrator
 * @version 
 * @since JDK 1.8
 */
public class CommonUtil {
	
	/**
	 * 描述： 生成随机字符串（含数字、大小写字母）
	 *
	 * @author Administrator
	 * @param length 随机字符串长度
	 * @return 随机字符串,包含数字、大小写字母
	 * @since JDK 1.8
	 */
	public static String getRandomString(int length) {
		if (length <= 0) {
			return "";
		}
		char[] randomChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
		Random random = new Random();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			stringBuffer.append(randomChar[Math.abs(random.nextInt()) % randomChar.length]);
		}
		return stringBuffer.toString();
	}
	
	
	/**
	 * 描述： 获取令牌（UUID+10位随机字符串）
	 *
	 * @author Administrator
	 * @return
	 */
	public static String getToken(){
		String token = "";
		token = UUIDGenerator.getUUIDWithoutHyphen()+getRandomString(10);
		return token;
	}
	
	
	/**
	 * 描述： 测试
	 *
	 * @author Administrator
	 * @param args
	 * @since JDK 1.8
	 */
	public static void main(String[] args) {
		System.out.println(getToken());
	}
}

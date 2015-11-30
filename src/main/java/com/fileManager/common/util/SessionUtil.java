package com.fileManager.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fileManager.entity.user.User;

public class SessionUtil {
	
	public static String getCurrentLang() {
		return "zh_cn";
	}
	
	public static User getLoginUser(){
		HttpServletRequest request =  ((ServletRequestAttributes)   
                RequestContextHolder.currentRequestAttributes()).getRequest();
		HttpSession hs=request.getSession(true);
		if(hs.getAttribute(getKey())!=null){
			User user=(User) hs.getAttribute(getKey());
			return user;
		}
		return null;
	}
	
	public static String getKey(){
		return Constants.LOGIN_USER_KEY;
	}
}

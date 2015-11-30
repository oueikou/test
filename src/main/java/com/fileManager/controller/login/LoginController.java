package com.fileManager.controller.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fileManager.entity.user.User;
import com.fileManager.service.user.UserService;
/**
 * 描述:登录
 * 项目名称:fileManager
 * 创建日期:2015年9月22日上午10:59:51
 * @author Administrator
 * @version
 */
@Controller
@RequestMapping("")
public class LoginController {
	
	@Autowired
	private UserService userSevice;
	
	/**
	 * 描述： 用户登录
	 * @author Administrator
	 * @param user
	 * @return
	 */
	@RequestMapping("login.do")
	public ModelAndView login(User user, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> resultMap = userSevice.loginChk(user, request);
		String status = String.valueOf(resultMap.get("status"));
		if(status!=null && status.equals("200")){
			mav.setViewName("demand/receive");
		}else{
			String message = String.valueOf(resultMap.get("message"));
			mav.addObject("message", message);
			mav.setViewName("login/login");
		}
		return mav;
	}
}

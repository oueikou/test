package com.fileManager.controller.register;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fileManager.entity.user.User;
import com.fileManager.service.user.UserService;
/**
 * 描述:注册
 * 项目名称:fileManager
 * 创建日期:2015年9月22日下午2:26:29
 * @author Administrator
 * @version
 */
@Controller
@RequestMapping("")
public class RegisterController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(RegisterController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("register.do")
	public ModelAndView register(User user) {
		logger.info("register(User) - start");

		int flg = userService.insertUser(user);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("demand/receive");

		logger.info("register(User) - end");
		return mav;
	}
}

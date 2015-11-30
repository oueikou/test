package com.fileManager.service.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fileManager.common.enums.DeleteStatus;
import com.fileManager.common.enums.DisableStatus;
import com.fileManager.common.util.Constants;
import com.fileManager.common.util.SessionUtil;
import com.fileManager.dao.user.UserDao;
import com.fileManager.entity.user.User;
import com.fileManager.service.common.impl.BaseServiceImpl;
import com.fileManager.service.user.UserService;

/**
 * 描述:用户 service
 * 项目名称:fileManager
 * 创建日期:2015年9月22日上午11:33:49
 * @author Administrator
 * @version
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;

	@Autowired
	public void setUserDao() {
		super.setBaseDao(userDao);
	}

	/**
	 * 描述：按条件获取用户集合
	 */
	public List<User> getUserListByParam(User user) {
		logger.info("getUserListByParam(User) - start");
		List<User> userList = userDao.selectListByParam(user);
		logger.info("getUserListByParam(User) - end");
		return userList;
	}

	/**
	 * 描述：插入用户
	 */
	public int insertUser(User user) {
		logger.info("insertUser(User) - start");

		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		user.setPassword(bCrypt.encode(user.getPassword()));
		int flg = super.insertSelective(user);

		logger.info("insertUser(User) - end");
		return flg;
	}

	/**
	 * TODO 描述：1.登录验证；2.通过验证的用户信息加入session
	 */
	public Map<String, Object> loginChk(User user, HttpServletRequest request) {
		logger.info("loginChk(User) - start");
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("status", "200");
		if(user.getLoginName()!=null && !user.getLoginName().equals("") && user.getPassword()!=null && !user.getPassword().equals("")){
			BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
			String rawPassword = user.getPassword();
			user.setPassword(null);
			user.setIsDeleted(DeleteStatus.IS_NOT_DELETED.getStatus());
			user.setIsDisabled(DisableStatus.IS_NOT_DISABLED.getStatus());
			List<User> userList = userDao.selectListByParam(user);
			if(userList!=null && userList.size()>0){
				User u = userList.get(0);
				String encodedPassword = u.getPassword();
				Boolean p = bCrypt.matches(rawPassword, encodedPassword);
				if(p){
					HttpSession hs = request.getSession(true);
					hs.setAttribute(SessionUtil.getKey(), u);
					hs.setAttribute(Constants.USER_LOGIN_NAME, u.getLoginName());
					resultMap.put("status", "200");
					resultMap.put("message", "登录成功！");
					logger.info("用户名密码正确，登录成功！");
				}else{
					resultMap.put("status", "301");
					resultMap.put("message", "登录出错，请检查用户名密码是否正确！");
					logger.info("登录出错，用户名："+u.getLoginName()+"登录密码错误！");
				}
			}else{
				resultMap.put("status", "301");
				resultMap.put("message", "登录出错，请检查用户名密码是否正确！");
				logger.info("登录出错，未查到登录名为："+user.getLoginName()+"的用户！");
			}
		}else{
			resultMap.put("status", "300");
			resultMap.put("message", "登录出错，请检查用户名密码是否正确！");
			logger.info("用户名或密码空值");
		}
		
		logger.info("loginChk(User) - end");
		return resultMap;
	}
	
}

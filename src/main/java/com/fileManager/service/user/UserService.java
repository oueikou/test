package com.fileManager.service.user;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.fileManager.entity.user.User;
import com.fileManager.service.common.BaseService;
/**
 * 描述:用户
 * 项目名称:fileManager
 * 创建日期:2015年9月22日上午11:25:00
 * @author Administrator
 * @version
 */
public interface UserService extends BaseService<User, Integer>{
	/**
	 * 描述：按条件获取用户集合
	 * @author Administrator
	 * @param user
	 * @return
	 */
	public List<User> getUserListByParam(User user);
	
	/**
	 * 描述： 插入用户
	 * @author Administrator
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * 描述： 登录验证
	 * @author Administrator
	 * @param user
	 * @return
	 */
	public Map<String, Object> loginChk(User user, HttpServletRequest request);
	
}

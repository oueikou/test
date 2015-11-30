/**
 * Copyright (C) 2006-2012 Tuniu All rights reserved
 * Author: 
 * Date: Tue Sep 22 11:13:11 CST 2015
 * Description:
 */
package com.fileManager.dao.user;

import java.util.List;

import com.fileManager.dao.common.BaseDao;
import com.fileManager.entity.user.User;

public interface UserDao extends BaseDao<User, Integer>{
	/**
	 * 描述： 按条件查询用户列表
	 * @param user
	 * @return
	 */
	public List<User> selectListByParam(User user);
}
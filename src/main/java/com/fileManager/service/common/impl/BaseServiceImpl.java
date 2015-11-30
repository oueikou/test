package com.fileManager.service.common.impl;

import org.apache.log4j.Logger;

import java.io.Serializable;

import com.fileManager.dao.common.BaseDao;
import com.fileManager.service.common.BaseService;


public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BaseServiceImpl.class);

	private BaseDao<T, ID> baseDao;

	public void setBaseDao(BaseDao<T, ID> baseDao) {
		if (logger.isDebugEnabled()) {
			logger.debug("setBaseDao(BaseDao<T,ID>) - 开始^^^^^^^^^^");
		}

		this.baseDao = baseDao;

		if (logger.isDebugEnabled()) {
			logger.debug("setBaseDao(BaseDao<T,ID>) - 结束^^^^^^^^^^");
		}
	}

	public int deleteByPrimaryKey(ID id) {
		if (logger.isDebugEnabled()) {
			logger.debug("deleteByPrimaryKey(ID) - 物理删除开始^^^^^^^^^^");
		}

		int returnint = baseDao.deleteByPrimaryKey(id);
		if (logger.isDebugEnabled()) {
			logger.debug("deleteByPrimaryKey(ID) - 物理删除结束^^^^^^^^^^");
		}
		return returnint;
	}

	public int insert(T record) {
		if (logger.isDebugEnabled()) {
			logger.debug("insert(T) - 插入开始^^^^^^^^^^");
		}

		int returnint = baseDao.insert(record);
		if (logger.isDebugEnabled()) {
			logger.debug("insert(T) - 插入结束^^^^^^^^^^");
		}
		return returnint;
	}

	public int insertSelective(T record) {
		if (logger.isDebugEnabled()) {
			logger.debug("insertSelective(T) - 插入开始^^^^^^^^^^");
		}

		int returnint = baseDao.insertSelective(record);
		if (logger.isDebugEnabled()) {
			logger.debug("insertSelective(T) - 插入结束^^^^^^^^^^");
		}
		return returnint;
	}

	public T selectByPrimaryKey(ID id) {
		if (logger.isDebugEnabled()) {
			logger.debug("selectByPrimaryKey(ID) - 查询开始^^^^^^^^^^");
		}

		T returnT = baseDao.selectByPrimaryKey(id);
		if (logger.isDebugEnabled()) {
			logger.debug("selectByPrimaryKey(ID) - 查询结束^^^^^^^^^^");
		}
		return returnT;
	}

	public int updateByPrimaryKeySelective(T record) {
		if (logger.isDebugEnabled()) {
			logger.debug("updateByPrimaryKeySelective(T) - 更新开始^^^^^^^^^^");
		}

		int returnint = baseDao.updateByPrimaryKeySelective(record);
		if (logger.isDebugEnabled()) {
			logger.debug("updateByPrimaryKeySelective(T) - 更新结束^^^^^^^^^^");
		}
		return returnint;
	}

	public int updateByPrimaryKey(T record) {
		if (logger.isDebugEnabled()) {
			logger.debug("updateByPrimaryKey(T) - 更新开始^^^^^^^^^^");
		}

		int returnint = baseDao.updateByPrimaryKey(record);
		if (logger.isDebugEnabled()) {
			logger.debug("updateByPrimaryKey(T) - 更新结束^^^^^^^^^^");
		}
		return returnint;
	}

}

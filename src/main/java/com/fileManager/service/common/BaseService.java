package com.fileManager.service.common;

import java.io.Serializable;

import com.fileManager.dao.common.BaseDao;


public interface BaseService<T, ID extends Serializable> {
	void setBaseDao(BaseDao<T, ID> baseDao);

	int deleteByPrimaryKey(ID id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(ID id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}

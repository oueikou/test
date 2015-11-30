package com.fileManager.service.example.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fileManager.dao.example.DemandReceiveDao;
import com.fileManager.entity.example.DemandReceive;
import com.fileManager.service.common.impl.BaseServiceImpl;
import com.fileManager.service.example.DemandReceiveService;


/**
 * 项目名称:fileManager
 * 创建日期:2015年9月10日下午5:25:37
 * 描述:
 * @author Administrator
 * @version 
 * @since JDK 1.8
 */
@Service
public class DemandReceiveServiceImpl extends BaseServiceImpl<DemandReceive, Long> implements DemandReceiveService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(DemandReceiveServiceImpl.class);

	@Autowired
	DemandReceiveDao demandReceiveDao;

	@Autowired
	public void setBaseDao() {
		super.setBaseDao(demandReceiveDao);
	}

	public int addDemandReceive(DemandReceive demandReceive) {
		if (logger.isDebugEnabled()) {
			logger.info("addDemandReceive(DemandReceive) ----------- start");
		}

		int returnint = demandReceiveDao.insert(demandReceive);
		if (logger.isDebugEnabled()) {
			logger.info("addDemandReceive(DemandReceive) ---------- end");
		}
		return returnint;
	}

	public DemandReceive getDemandReceiveById(Long demandReceiveId) {
		if (logger.isDebugEnabled()) {
			logger.info("getDemandReceiveById(Long) ---------- start");
		}

		DemandReceive returnDemandReceive = demandReceiveDao.selectByPrimaryKey(demandReceiveId);
		if (logger.isDebugEnabled()) {
			logger.info("getDemandReceiveById(Long) --------- end");
		}
		return returnDemandReceive;
	}

	
}

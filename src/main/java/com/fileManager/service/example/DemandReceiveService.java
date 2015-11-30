package com.fileManager.service.example;

import com.fileManager.entity.example.DemandReceive;
import com.fileManager.service.common.BaseService;


public interface DemandReceiveService extends BaseService<DemandReceive, Long>{
	public int addDemandReceive(DemandReceive demandReceive);
	public DemandReceive getDemandReceiveById(Long demandReceiveId);
}

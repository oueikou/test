/**
 * Copyright (C) 2006-2012 Tuniu All rights reserved
 * Author: 
 * Date: Wed Jul 15 09:34:52 CST 2015
 * Description:
 */
package com.fileManager.entity.example;

import java.util.Date;

/**
 *  DemandReceive
 *  DEMAND_RECEIVE
 */
public class DemandReceive {
    /**
     * 需求发送单ID
     * DEMAND_RECEIVE.DEMAND_RECEIVE_ID
     */
    private Long demandReceiveId;

    /**
     * 服务人数
     * DEMAND_RECEIVE.DEMAND_SEND_ID
     */
    private Long demandSendId;

    /**
     * 服务区域
     * DEMAND_RECEIVE.RECEIVE_STORE_ID
     */
    private Long receiveStoreId;

    /**
     * 需求发送机构
     * DEMAND_RECEIVE.RECEIVE_ORG_ID
     */
    private Long receiveOrgId;

    /**
     * 需求发送人
     * DEMAND_RECEIVE.RECEIVE_USER_ID
     */
    private Long receiveUserId;

    /**
     * 接受日期
     * DEMAND_RECEIVE.RECEIVE_DATE
     */
    private Date receiveDate;

    /**
     * 1-已撤销 2-已接受 3-已成交 4-已关闭
     * DEMAND_RECEIVE.STATUS
     */
    private Integer status;

    /**
     * 是否删除
     * DEMAND_RECEIVE.IS_DELETED
     */
    private Integer isDeleted;

    /**
     * 创建人
     * DEMAND_RECEIVE.CREATE_BY
     */
    private Long createBy;

    /**
     * 创建时间
     * DEMAND_RECEIVE.CREATE_DT
     */
    private Date createDt;

    /**
     * 更新人
     * DEMAND_RECEIVE.UPDATE_BY
     */
    private Long updateBy;

    /**
     * 更新时间
     * DEMAND_RECEIVE.UPDATE_DT
     */
    private Date updateDt;

    /**
     * @return DEMAND_RECEIVE.DEMAND_RECEIVE_ID
     */
    public Long getDemandReceiveId() {
        return demandReceiveId;
    }

    /**
     * @param Long demandReceiveId (DEMAND_RECEIVE.DEMAND_RECEIVE_ID )
     */
    public void setDemandReceiveId(Long demandReceiveId) {
        this.demandReceiveId = demandReceiveId;
    }

    /**
     * @return DEMAND_RECEIVE.DEMAND_SEND_ID
     */
    public Long getDemandSendId() {
        return demandSendId;
    }

    /**
     * @param Long demandSendId (DEMAND_RECEIVE.DEMAND_SEND_ID )
     */
    public void setDemandSendId(Long demandSendId) {
        this.demandSendId = demandSendId;
    }

    /**
     * @return DEMAND_RECEIVE.RECEIVE_STORE_ID
     */
    public Long getReceiveStoreId() {
        return receiveStoreId;
    }

    /**
     * @param Long receiveStoreId (DEMAND_RECEIVE.RECEIVE_STORE_ID )
     */
    public void setReceiveStoreId(Long receiveStoreId) {
        this.receiveStoreId = receiveStoreId;
    }

    /**
     * @return DEMAND_RECEIVE.RECEIVE_ORG_ID
     */
    public Long getReceiveOrgId() {
        return receiveOrgId;
    }

    /**
     * @param Long receiveOrgId (DEMAND_RECEIVE.RECEIVE_ORG_ID )
     */
    public void setReceiveOrgId(Long receiveOrgId) {
        this.receiveOrgId = receiveOrgId;
    }

    /**
     * @return DEMAND_RECEIVE.RECEIVE_USER_ID
     */
    public Long getReceiveUserId() {
        return receiveUserId;
    }

    /**
     * @param Long receiveUserId (DEMAND_RECEIVE.RECEIVE_USER_ID )
     */
    public void setReceiveUserId(Long receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    /**
     * @return DEMAND_RECEIVE.RECEIVE_DATE
     */
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**
     * @param Date receiveDate (DEMAND_RECEIVE.RECEIVE_DATE )
     */
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    /**
     * @return DEMAND_RECEIVE.STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param Integer status (DEMAND_RECEIVE.STATUS )
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return DEMAND_RECEIVE.IS_DELETED
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * @param Integer isDeleted (DEMAND_RECEIVE.IS_DELETED )
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * @return DEMAND_RECEIVE.CREATE_BY
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * @param Long createBy (DEMAND_RECEIVE.CREATE_BY )
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * @return DEMAND_RECEIVE.CREATE_DT
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * @param Date createDt (DEMAND_RECEIVE.CREATE_DT )
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * @return DEMAND_RECEIVE.UPDATE_BY
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * @param Long updateBy (DEMAND_RECEIVE.UPDATE_BY )
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return DEMAND_RECEIVE.UPDATE_DT
     */
    public Date getUpdateDt() {
        return updateDt;
    }

    /**
     * @param Date updateDt (DEMAND_RECEIVE.UPDATE_DT )
     */
    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }
}
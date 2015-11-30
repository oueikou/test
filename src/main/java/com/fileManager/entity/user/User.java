/**
 * Copyright (C) 2006-2012 Tuniu All rights reserved
 * Author: 
 * Date: Tue Sep 22 11:13:11 CST 2015
 * Description:
 */
package com.fileManager.entity.user;

import java.io.Serializable;
import java.util.Date;

/**
 *  User
 *  fm_user
 */
public class User implements Serializable{
    /**
	 * serialVersionUID:TODO描述：
	 */
	private static final long serialVersionUID = 1239348638186691617L;

	/**
     * 主键id
     * fm_user.user_id
     */
    private Integer userId;

    /**
     * 登录名
     * fm_user.login_name
     */
    private String loginName;

    /**
     * 真实姓名
     * fm_user.real_name
     */
    private String realName;

    /**
     * 登录密码
     * fm_user.password
     */
    private String password;

    /**
     * 用户类型：1-超级管理员
     * fm_user.user_type
     */
    private Integer userType;

    /**
     * 是否可用：0-可用，1-禁用，默认值是0
     * fm_user.is_disabled
     */
    private Integer isDisabled;

    /**
     * 逻辑删除标识：0-正常, 1-已删除，默认值是0
     * fm_user.is_deleted
     */
    private Integer isDeleted;

    /**
     * 手机号
     * fm_user.mobile
     */
    private String mobile;

    /**
     * 邮箱
     * fm_user.email
     */
    private String email;

    /**
     * 身份证
     * fm_user.identity_card
     */
    private String identityCard;

    /**
     * 令牌
     * fm_user.token
     */
    private String token;

    /**
     * 创建人id
     * fm_user.create_by
     */
    private Integer createBy;

    /**
     * 创建时间
     * fm_user.create_dt
     */
    private Date createDt;

    /**
     * 更新人id
     * fm_user.update_by
     */
    private Integer updateBy;

    /**
     * 更新时间
     * fm_user.update_dt
     */
    private Date updateDt;

    /**
     * @return fm_user.user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param Integer userId (fm_user.user_id )
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return fm_user.login_name
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * @param String loginName (fm_user.login_name )
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * @return fm_user.real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param String realName (fm_user.real_name )
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return fm_user.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param String password (fm_user.password )
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return fm_user.user_type
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * @param Integer userType (fm_user.user_type )
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * @return fm_user.is_disabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * @param Integer isDisabled (fm_user.is_disabled )
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * @return fm_user.is_deleted
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * @param Integer isDeleted (fm_user.is_deleted )
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * @return fm_user.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param String mobile (fm_user.mobile )
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return fm_user.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param String email (fm_user.email )
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return fm_user.identity_card
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * @param String identityCard (fm_user.identity_card )
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    /**
     * @return fm_user.token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param String token (fm_user.token )
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * @return fm_user.create_by
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * @param Integer createBy (fm_user.create_by )
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * @return fm_user.create_dt
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * @param Date createDt (fm_user.create_dt )
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * @return fm_user.update_by
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * @param Integer updateBy (fm_user.update_by )
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return fm_user.update_dt
     */
    public Date getUpdateDt() {
        return updateDt;
    }

    /**
     * @param Date updateDt (fm_user.update_dt )
     */
    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }
}
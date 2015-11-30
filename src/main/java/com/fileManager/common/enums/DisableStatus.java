package com.fileManager.common.enums;

/**
 * 删除状态
 */
public enum DisableStatus {
	/**
	 * 已禁用
	 */
	IS_DISABLED(1, "已禁用"),
	/**
	 * 未禁用
	 */
	IS_NOT_DISABLED(0, "未禁用");
    
    DisableStatus(int status, String des) {
        this.status = status;
        this.des = des;
    }

    private final int status;
    private final String des;
    
    public int getStatus() {
        return status;
    }

    public String getDes() {
        return des;
    }

    public static DisableStatus valueOf(Integer status) {
        for (DisableStatus value : values()) {
            if (status != null && value.status == status) {
                return value;
            }
        }
        return null;
    }
}

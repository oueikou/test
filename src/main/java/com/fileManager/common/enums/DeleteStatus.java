package com.fileManager.common.enums;

/**
 * 删除状态
 */
public enum DeleteStatus {
	/**
	 * 已删除
	 */
	IS_DELETED(1, "已删除"),
	/**
	 * 未删除
	 */
	IS_NOT_DELETED(0, "未删除");
    
    DeleteStatus(int status, String des) {
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

    public static DeleteStatus valueOf(Integer status) {
        for (DeleteStatus value : values()) {
            if (status != null && value.status == status) {
                return value;
            }
        }
        return null;
    }
}

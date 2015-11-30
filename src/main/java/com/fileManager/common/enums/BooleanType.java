package com.fileManager.common.enums;

/**
 * Boolean值枚举
 * 
 * @author liuwei 2014年11月29日 下午1:57:37
 */
public enum BooleanType {

    yes(1),

    no(0);

    BooleanType(int type) {
        this.type = type;
    }

    public static BooleanType valueOf(Integer type) {
        for (BooleanType value : values()) {
            if (type != null && value.type == type) {
                return value;
            }
        }
        return null;
    }

    public int getType() {
        return type;
    }

    private final int type;
}

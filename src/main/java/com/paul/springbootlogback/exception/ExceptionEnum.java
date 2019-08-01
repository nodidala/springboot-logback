package com.paul.springbootlogback.exception;

/**
 * @author paul
 * @Description
 * @date 2019/8/1 17:15
 * 异常枚举类
 */
public enum ExceptionEnum {
    ERROR_NOFOUND("无法找到相应的数据");

    private String value;

    public String getValue() {
        return value;
    }

    ExceptionEnum(String value){
        this.value = value;
    }

    public String toString() {
        return value;
    }

}

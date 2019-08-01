package com.paul.springbootlogback.exception;

/**
 * @author paul
 * @Description 自定义No Found异常
 * @date 2019/8/1 17:16
 */
public class NoFoundExcepiton extends Exception {
    private static final long serialVersionUID = -5955607821816077172L;

    public NoFoundExcepiton(String errorInfo) {
        super(errorInfo);
    }

}

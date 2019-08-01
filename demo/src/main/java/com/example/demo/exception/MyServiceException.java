package com.example.demo.exception;

/**
 * @Classname MyServiceException
 * @Description TODO
 * @Date 2019/7/4
 * @Created by wangzheng
 */
public class MyServiceException extends MyException {

    private static final int STATUS = 2000;

    public MyServiceException() {
        super(STATUS);
    }

    public MyServiceException(String msg) {
        super(STATUS, msg);
    }

    public MyServiceException(int status, String msg) {
        super(status, msg);
    }
}
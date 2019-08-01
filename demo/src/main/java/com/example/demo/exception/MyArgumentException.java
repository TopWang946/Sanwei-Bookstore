package com.example.demo.exception;

/**
 * @Classname MyArgumentException
 * @Description TODO
 * @Date 2019/7/4
 * @Created by wangzheng
 */
public class MyArgumentException extends MyException {

    private static final int STATUS = 3000;

    public MyArgumentException() {
        super(STATUS);
    }

    public MyArgumentException(String msg) {
        super(STATUS, msg);
    }

    public MyArgumentException(int status, String msg) {
        super(status, msg);
    }
}
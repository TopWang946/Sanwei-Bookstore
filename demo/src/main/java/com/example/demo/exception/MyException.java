package com.example.demo.exception;

import java.util.logging.Level;

/**
 * @Classname MyException
 * @Description TODO
 * @Date 2019/7/4
 * @Created by wangzheng
 */
public abstract class MyException extends RuntimeException {
    private int status = 9999;

    public MyException(int status) {
        super();
        this.status = status;
    }

    public MyException(int status, String msg) {
        super(msg);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public MyException setStatus(int status) {
        this.status = status;
        return this;
    }
}
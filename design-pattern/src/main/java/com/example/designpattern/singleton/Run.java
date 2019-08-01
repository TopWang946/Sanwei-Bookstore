package com.example.designpattern.singleton;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class Run {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
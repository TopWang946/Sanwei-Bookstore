package com.example.designpattern.singleton;

/**
 * @Classname Singleton
 * @Description 饿汉单例
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello Singleton");
    }
}
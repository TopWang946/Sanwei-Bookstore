package com.example.designpattern.singleton;

/**
 * @Classname LazySingleton
 * @Description 懒汉单例
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton(){}

    private static synchronized LazySingleton getSingleton(){
        if(singleton == null){
            return new LazySingleton();
        }
        return singleton;
    }
}
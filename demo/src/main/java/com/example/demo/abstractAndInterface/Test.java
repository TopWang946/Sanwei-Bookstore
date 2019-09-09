package com.example.demo.abstractAndInterface;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/9/4
 * @Created by wangzheng
 */
public class Test {
    /**
     * 静态代码块
     */
    static{
        System.out.println("执行静态代码块...");
    }

    /**
     * 构造代码块
     */
    {
        System.out.println("执行构造代码块...");
    }

    /**
     * 无参构造函数
     */
    public Test(){
        System.out.println("执行无参构造函数...");
    }

    /**
     * 有参构造函数
     * @param id
     */
    public Test(String id){
        System.out.println("执行有参构造函数...");
    }

    public static void main(String[] args) {
        System.out.println("----------------------");
        new Test();
        System.out.println("----------------------");
        new Test("1");
    }
}
package com.example.designpattern.abstractFactory.product;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Circle
 * @Description 抽象工厂模式-具体产品
 * @Date 2019/8/1
 * @Created by wangzheng
 */
@Slf4j
public class Circle implements Shape {
    @Override
    public void showShape() {
        log.info("展示：圆 圆 圆形");
    }
}
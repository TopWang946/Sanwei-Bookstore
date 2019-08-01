package com.example.designpattern.factory.product;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Square
 * @Description 工厂模式-具体产品
 * @Date 2019/8/1
 * @Created by wangzheng
 */
@Slf4j
public class Square implements Shape {
    @Override
    public void show() {
      log.info("展示：方 方 方形");
    }
}
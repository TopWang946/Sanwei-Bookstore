package com.example.designpattern.abstractFactory.product;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Red
 * @Description TODO
 * @Date 2019/8/1
 * @Created by wangzheng
 */
@Slf4j
public class Red implements Color {
    @Override
    public void showColor() {
        log.info("展示：红 红 红色");
    }
}
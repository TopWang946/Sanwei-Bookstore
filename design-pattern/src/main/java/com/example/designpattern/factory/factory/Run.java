package com.example.designpattern.factory.factory;

import com.example.designpattern.factory.factory.ShapeFactory;
import com.example.designpattern.factory.product.Shape;

/**
 * @Classname Run
 * @Description 工厂模式
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class Run {

    public static void main(String[] args){
        com.example.designpattern.factory.factory.ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("圆");
        shape.show();

        Shape shape2 = shapeFactory.getShape("方");
        shape2.show();
    }
}
package com.example.designpattern.abstractFactory.factory;

import com.example.designpattern.abstractFactory.product.Color;
import com.example.designpattern.abstractFactory.product.Shape;

/**
 * @Classname Run
 * @Description 抽象工厂模式
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class Run {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("圆");
        shape.showShape();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("红");
        color.showColor();
    }

}
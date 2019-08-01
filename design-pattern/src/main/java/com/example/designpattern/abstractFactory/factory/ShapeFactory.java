package com.example.designpattern.abstractFactory.factory;

import com.example.designpattern.abstractFactory.product.Circle;
import com.example.designpattern.abstractFactory.product.Color;
import com.example.designpattern.abstractFactory.product.Shape;
import com.example.designpattern.abstractFactory.product.Square;

/**
 * @Classname ShapeFactory
 * @Description 抽象工厂模式-具体工厂
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class ShapeFactory implements AbstractFactory {

    public Shape getShape(String param) {
        if("圆".equals(param)){
            return new Circle();
        }else if("方".equals(param)){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
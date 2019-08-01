package com.example.designpattern.abstractFactory.factory;

import com.example.designpattern.abstractFactory.product.Color;
import com.example.designpattern.abstractFactory.product.Green;
import com.example.designpattern.abstractFactory.product.Red;
import com.example.designpattern.abstractFactory.product.Shape;

/**
 * @Classname ColorFactory
 * @Description 抽象工厂模式-具体工厂
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if("红".equals(color)){
            return new Red();
        }else if("绿".equals(color)){
            return new Green();
        }
        return null;
    }
}
package com.example.designpattern.abstractFactory.factory;

import com.example.designpattern.abstractFactory.product.Color;
import com.example.designpattern.abstractFactory.product.Shape;

/**
 * @Interfacename AbstractFactory
 * @Description 抽象工厂模式-抽象工厂
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public interface AbstractFactory {

    Shape getShape(String shape);
    Color getColor(String color);
}

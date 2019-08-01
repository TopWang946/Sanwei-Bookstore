package com.example.designpattern.factory.factory;

import com.example.designpattern.factory.product.Circle;
import com.example.designpattern.factory.product.Shape;
import com.example.designpattern.factory.product.Square;

/**
 * @Classname ShapeFactory
 * @Description 工厂模式-工厂
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class ShapeFactory {

    private Shape shape;

    public Shape getShape(String param) {
        if("圆".equals(param)){
            shape = new Circle();
            return shape;
        }else if("方".equals(param)){
            shape = new Square();
            return shape;
        }
        return null;
    }
}
package com.example.designpattern.abstractFactory.factory;

/**
 * @Classname FactoryProducer
 * @Description 工厂生成器
 * @Date 2019/8/1
 * @Created by wangzheng
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if("SHAPE".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
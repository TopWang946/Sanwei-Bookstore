package com.example.demo.roundOff;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Classname Test
 * @Description 四舍五入练习
 * @Date 2019/9/3
 * @Created by wangzheng
 */
public class Test {
    public static void main(String[] args){
        BigDecimal d = new BigDecimal(100000);
        BigDecimal r = new BigDecimal(0.001875*3);
        BigDecimal i = d.multiply(r).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(i);
        System.out.println(new java.text.DecimalFormat("#.00").format(3.1445926));


        BigDecimal t = new BigDecimal("123.2348");
        System.out.println(t.setScale(2,RoundingMode.HALF_EVEN));
    }
}
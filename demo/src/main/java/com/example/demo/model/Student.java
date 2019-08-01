package com.example.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2019/6/16
 * @Created by wangzheng
 */
@Data
@EqualsAndHashCode
public class Student {
    private String name;
    private int age;
}
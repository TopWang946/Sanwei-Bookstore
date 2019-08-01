package com.example.demo.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/7/2
 * @Created by wangzheng
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
}
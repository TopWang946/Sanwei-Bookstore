package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Classname BlogProperties
 * @Description TODO
 * @Date 2019/5/21
 * @Created by wangzheng
 */
@Component
@PropertySource(value = "classpath:application-dev.properties", encoding = "UTF-8")
@ConfigurationProperties(prefix = "com.topwang.blog")
public class BlogProperties {
    //    @Value("${com.topwang.blog.name}")
    private String name;

    //    @Value("${com.topwang.blog.title}")
    private String title;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
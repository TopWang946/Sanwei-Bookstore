package com.example.demo.deepOrShallowCopy;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Classname Test
 * @Description 深浅拷贝练习
 * @Date 2019/9/3
 * @Created by wangzheng
 */
public class Test {
    public static void main(String[] args){
        Person wang = new Person();
        wang.setName("小王").setEmail("下班别走，还有个任务要安排给你");

        Person ming = wang.clone();
        ming.setName("小明");
        Person mei = wang.clone();
        mei.setName("小美");

        System.out.println(wang.getName()+","+wang.getEmail());
        System.out.println(ming.getName()+","+ming.getEmail());
        System.out.println(mei.getName()+","+mei.getEmail());
    }
}

@Data
@Accessors(chain = true)
class Person implements Cloneable{
    private String name;
    private String email;

    public Person clone(){
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
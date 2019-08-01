package com.example.demo.rest;

import com.example.demo.exception.MyArgumentException;
import com.example.demo.exception.MyServiceException;
import com.example.demo.model.BlogProperties;
import com.example.demo.model.Student;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/5/21
 * @Created by wangzheng
 */
@RestController
public class HelloController {

    @Autowired
    private BlogProperties blogProperties;

    @ApiIgnore
    @RequestMapping("/hello")
    public String hello() {
        StringBuilder stringBuilder = new StringBuilder("Hello World")
                .append(blogProperties.getName())
                .append(" ")
                .append(blogProperties.getTitle())
                .append(" ")
                .append(blogProperties.getAge());
        return stringBuilder.toString();
    }

    @ApiIgnore
    @RequestMapping("/throwServiceException")
    public String throwServiceException() throws Exception {
        throw new MyServiceException("业务异常");
    }

    @ApiIgnore
    @RequestMapping("/throwArgumentException")
    public String throwArgumentException() throws Exception {
        throw new MyArgumentException("参数异常");
    }

//    public static void main(String[] args){
//        System.out.println("aaaaaaaaaa");
//        Student student=new Student();
//        System.out.println(student.toString());
//        Double i=1.;
//        System.out.println(i.equals(1));
//        String a=new String("a");
//        String b=new String("a");
//        String c=a;
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(a.hashCode()==b.hashCode());
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println();
//    }
}
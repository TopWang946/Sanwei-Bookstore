package com.example.demo.rest;

import com.example.demo.model.BlogProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void hello() {
        System.out.println(blogProperties.getName());
        System.out.println(blogProperties.getTitle());
        System.out.println(blogProperties.getAge());
        System.out.println(2 / 100);
        String osName = System.getProperty("os.name");

        String user = System.getProperty("user.name");

        System.out.println("当前操作系统是：" + osName);

        System.out.println("当前用户是：" + user);
        System.out.println("当前用户是：" + System.currentTimeMillis());
    }
}
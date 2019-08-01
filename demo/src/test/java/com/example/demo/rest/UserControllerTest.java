//package com.example.demo.rest;
//
//import com.fasterxml.jackson.databind.node.JsonNodeCreator;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockServletContext;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.alibaba.fastjson.JSON;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@Slf4j
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//public class UserControllerTest {
//
//    private MockMvc mvc;
//
//    @Before
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(
//                new HelloController(),
//                new UserController()).build();
//    }
//
//    @Test
//    public void getHello() throws Exception {
//        mvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("Hello World")));
//    }
//
//    @Test
//    public void testUserController() throws Exception {
//        RequestBuilder requestBuilder=null;
//        requestBuilder = get("/users");
//        mvc.perform(requestBuilder)
//                .andExpect(status().isOk()).toString();
////                .andExpect(content().string(equalTo("[]")));
//        log.error("=========================："+JSON.toJSONString(requestBuilder));
//    }
//}
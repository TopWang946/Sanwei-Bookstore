package com.example.demo.exception;

import com.example.demo.base.ObjectResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Classname MyExceptionHandler
 * @Description TODO
 * @Date 2019/7/4
 * @Created by wangzheng
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ObjectResponse> defaultErrorHandler(Exception e) {
        ObjectResponse response = new ObjectResponse();
        response.setStatus(9999);
        response.setMsg("系统错误");
        ResponseEntity<ObjectResponse> res = ResponseEntity.ok(response);
        return res;
    }

    @ExceptionHandler(value = MyServiceException.class)
    public ResponseEntity<ObjectResponse> serviceErrorHandler(MyServiceException e) {
        ObjectResponse response = new ObjectResponse();
        response.setStatus(e.getStatus());
        response.setMsg(e.getMessage());
        ResponseEntity<ObjectResponse> res = ResponseEntity.ok(response);
        return res;
    }

    @ExceptionHandler(value = MyArgumentException.class)
    public ResponseEntity<ObjectResponse> argumentErrorHandler(MyArgumentException e) {
        ObjectResponse response = new ObjectResponse();
        response.setStatus(e.getStatus());
        response.setMsg(e.getMessage());
        ResponseEntity<ObjectResponse> res = ResponseEntity.ok(response);
        return res;
    }
}
package com.cd.bootclient;

import api.HelloServiceApi;
import model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceImpl implements HelloServiceApi {

    @Value("${server.port}")
    private String port;

    @Override
    public String hello(@RequestParam("name") String s) {

        return "hello, i'am " + s + " from port: " + port;
    }

    @Override
    public User queryUser(@RequestParam("name") String s, @RequestParam("age") int i) {

        User user = new User("zhangsan", 23);
        return user;
    }

    @Override
    public String updateUser(User user) {
        return "update success";
    }
}

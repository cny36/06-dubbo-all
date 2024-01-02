package com.cny.provider;

import com.cny.basic.HelloService;

public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "hello：" + name;
    }

}

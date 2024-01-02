package com.cny.basic;

import com.cny.basic.HelloService;

public class HelloServiceMock implements HelloService {

    @Override
    public String hello(String name) {
        return "当前网络繁忙，请稍后重试。";
    }
}

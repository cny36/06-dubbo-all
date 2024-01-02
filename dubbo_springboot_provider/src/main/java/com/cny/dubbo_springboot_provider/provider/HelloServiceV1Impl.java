package com.cny.dubbo_springboot_provider.provider;

import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")//服务分版本
public class HelloServiceV1Impl implements HelloService {
    @Override
    public String hello(String name) {
        System.out.println("调用1.0");
        return "dubbo_springboot_say_hello: Version1 " + name;
    }
}

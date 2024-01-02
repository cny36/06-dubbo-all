package com.cny.dubbo_springboot_provider.provider;

import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "2.0")//服务分版本
public class HelloServiceV2Impl implements HelloService {

    @Override
    public String hello(String name) {
        return "dubbo_springboot_say_hello: Version2 " + name;
    }
}

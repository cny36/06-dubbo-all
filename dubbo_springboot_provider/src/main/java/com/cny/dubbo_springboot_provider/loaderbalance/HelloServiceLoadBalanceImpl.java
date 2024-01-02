package com.cny.dubbo_springboot_provider.loaderbalance;

import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "loaderbalance")
public class HelloServiceLoadBalanceImpl implements HelloService {

    @Override
    public String hello(String name) {
        System.out.println("调用了服务方法");
        return "service hello";
    }
}

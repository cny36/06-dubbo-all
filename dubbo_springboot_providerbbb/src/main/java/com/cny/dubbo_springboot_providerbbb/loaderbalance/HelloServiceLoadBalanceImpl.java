package com.cny.dubbo_springboot_providerbbb.loaderbalance;

import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "loaderbalance")
public class HelloServiceLoadBalanceImpl implements HelloService {

    @Override
    public String hello(String name) {
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("调用了服务B方法");
        return "serviceB hello";
    }
}

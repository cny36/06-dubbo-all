package com.cny.dubbo_springboot_provider.provider;

import com.cny.basic.HelloService;
import lombok.SneakyThrows;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "mock", timeout = 4000)// 服务降级 默认超时时间是1秒
public class MockHelloServiceImpl implements HelloService {

    @SneakyThrows
    @Override
    public String hello(String name) {
        Thread.sleep(3000);
        return "mockHello: "+ name;
    }
}

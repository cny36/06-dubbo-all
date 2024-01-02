package com.cny.dubbo_springboot_provider.provider;

import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "chinese")// 服务分组
public class ChineseHelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "你好: " + name;
    }
}

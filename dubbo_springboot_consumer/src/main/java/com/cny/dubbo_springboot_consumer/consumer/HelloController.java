package com.cny.dubbo_springboot_consumer.consumer;

import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(version = "1.0", cache = "lru")
    private HelloService helloServiceV1;
    @DubboReference(version = "2.0")
    private HelloService helloServiceV2;

    @DubboReference(group = "chinese")
    private HelloService chineseHelloService;
    @DubboReference(group = "english")
    private HelloService englishHelloService;

    @DubboReference(version = "mock", mock = "true")
    private HelloService mockHelloService;


    @RequestMapping("/hello")
    public void hello(@RequestParam String name) {
        System.out.println("---------------服务分版本&&调用结果缓存-------------");
        System.out.println(helloServiceV1.hello(name));
        System.out.println(helloServiceV1.hello(name));
        System.out.println(helloServiceV2.hello(name));
        System.out.println("---------------服务分组-------------");
        System.out.println(chineseHelloService.hello(name));
        System.out.println(englishHelloService.hello(name));
        System.out.println("---------------服务降级&&服务超时-------------");
        System.out.println(mockHelloService.hello(name));
    }

}

package com.cny.dubbo_springboot_consumer.loaderbalance;

import com.cny.basic.AsyncService;
import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class LoaderBalanceController {

    @DubboReference(version = "loaderbalance", loadbalance = "random")
    private HelloService helloService;

    @DubboReference(version = "loaderbalance", cluster = "failover ", retries = 2)
    private HelloService clusterService;


    @RequestMapping("/load")
    public void hello() {
        for (int i = 0; i < 10; i++) {
            helloService.hello("load");
        }
    }

    @RequestMapping("/cluster")
    public void cluster() {
        clusterService.hello("cluster");
    }

}

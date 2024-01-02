package com.cny.dubbo_springboot_consumer.async;

import com.cny.basic.AsyncService;
import com.cny.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController {

    @DubboReference(methods = {@Method(name = "doAsync1",async = true), @Method(name = "doAsync2",async = true)})
    private AsyncService asyncService;


    @RequestMapping("/async")
    public void hello() {
        System.out.println("---------------全链路异步化 消费端-------------");
        long begin = System.currentTimeMillis();
        System.out.println("异步调用如下：");

        CompletableFuture<String> future1 = asyncService.doAsync1();
        CompletableFuture<String> future2 = asyncService.doAsync2();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        // 有结果后异步通知
        future1.whenComplete((result, throwable) -> {
            if(throwable != null){
                throwable.printStackTrace();
            } else {
                System.out.println("doAsync1 result = " + result);
            }
        });

        future2.whenComplete((result, throwable) -> {
            if(throwable != null){
                throwable.printStackTrace();
            } else {
                System.out.println("doAsync2 result = " + result);
            }
        });




    }

}

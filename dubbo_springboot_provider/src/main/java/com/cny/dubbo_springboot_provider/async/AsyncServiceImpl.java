package com.cny.dubbo_springboot_provider.async;

import com.cny.basic.AsyncService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.concurrent.CompletableFuture;

@DubboService(timeout = 4000)
public class AsyncServiceImpl implements AsyncService {
    @Override
    public CompletableFuture<String> doAsync1() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "doAsync1";
        });
        return future;
    }

    @Override
    public CompletableFuture<String> doAsync2() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "doAsync2";
        });
        return future;
    }



    @Override
    public String doSync1() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "doSync1";
    }

    @Override
    public String doSync2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "doSync2";
    }
}

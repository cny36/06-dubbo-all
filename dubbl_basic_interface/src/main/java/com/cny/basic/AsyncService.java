package com.cny.basic;

import java.util.concurrent.CompletableFuture;

public interface AsyncService {
    // 异步操作
    CompletableFuture<String> doAsync1();

    CompletableFuture<String> doAsync2();

    // 同步操作
    String doSync1();

    String doSync2();
}

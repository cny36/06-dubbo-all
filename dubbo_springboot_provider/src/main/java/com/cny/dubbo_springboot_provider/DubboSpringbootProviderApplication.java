package com.cny.dubbo_springboot_provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@EnableDubbo
@SpringBootApplication
public class DubboSpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootProviderApplication.class, args);
    }

}

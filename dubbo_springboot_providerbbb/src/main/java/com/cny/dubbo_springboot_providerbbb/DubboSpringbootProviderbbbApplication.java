package com.cny.dubbo_springboot_providerbbb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboSpringbootProviderbbbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootProviderbbbApplication.class, args);
    }

}

package service.jdk.impl;

import service.jdk.Log;

public class Logback implements Log {
    @Override
    public void info(String msg) {
        System.out.println("logback info " + msg);
    }
 }

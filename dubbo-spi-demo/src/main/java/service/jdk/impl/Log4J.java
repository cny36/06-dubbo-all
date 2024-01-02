package service.jdk.impl;

import service.jdk.Log;

public class Log4J implements Log {
    @Override
    public void info(String msg) {
        System.out.println("log4J info " + msg);
    }
 }

package service.dubbo.impl;

import service.dubbo.Protocol;


public class RmiProtocol implements Protocol {
    @Override
    public void communicate() {
        System.out.println("采用Rmi协议进行通讯");
    }
}

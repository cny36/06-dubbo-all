package service.dubbo.impl;

import service.dubbo.Protocol;


public class DubboProtocol implements Protocol {
    @Override
    public void communicate() {
        System.out.println("采用dubbo协议进行通讯");
    }
}

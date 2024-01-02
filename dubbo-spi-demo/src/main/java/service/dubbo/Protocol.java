package service.dubbo;

import org.apache.dubbo.common.extension.SPI;

@SPI("dubbo")
public interface Protocol {
    void communicate();
}

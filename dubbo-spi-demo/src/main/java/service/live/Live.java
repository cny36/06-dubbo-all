package service.live;

import org.apache.dubbo.common.extension.SPI;

@SPI("mobile")
public interface Live {
    void liveSale();
}

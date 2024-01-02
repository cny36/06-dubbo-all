package service.live.wrapper;

import service.live.Live;

public class FaceLiveWrapper implements Live {

    private Live live;

    public FaceLiveWrapper(Live live){
        this.live = live;
    }

    @Override
    public void liveSale() {
        live.liveSale();

        // 增强
        System.out.println("瘦脸已开启......");
    }
}

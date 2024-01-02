package service.live.wrapper;

import service.live.Live;

public class BeautyLiveWrapper implements Live {

    private Live live;

    public BeautyLiveWrapper(Live live){
        this.live = live;
    }

    @Override
    public void liveSale() {
        live.liveSale();

        // 增强
        System.out.println("美颜已开启......");
    }
}

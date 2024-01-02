package service.live;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Main2 {
    public static void main(String[] args) {
        ExtensionLoader<Live> extensionLoader = ExtensionLoader.getExtensionLoader(Live.class);

        extensionLoader.getDefaultExtension().liveSale();
    }
}

package test;

import org.apache.dubbo.common.extension.ExtensionDirector;
import org.apache.dubbo.common.extension.ExtensionLoader;
import service.dubbo.Protocol;

public class DubboMain {
    public static void main(String[] args) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);

        Protocol protocol = extensionLoader.getExtension("dubbo");
        protocol.communicate();

        Protocol protocol2 = extensionLoader.getExtension("rmi");
        protocol2.communicate();

        Protocol defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.communicate();


    }
}

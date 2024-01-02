import com.cny.basic.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
        context.start();
        HelloService demoService = (HelloService) context.getBean("helloService");
        String hello = demoService.hello("world");
        System.out.println(hello);
    }
}

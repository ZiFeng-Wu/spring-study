import com.zifeng.spring.service.EventDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author 吴梓锋
 * @version 1.0.0
 * @date 2022/04/02 16:11:29
 * @description
 */
public class StartSpringDemo {
    @Autowired
    EventDemoService eventDemoService;

    public static void main(String[] args) {
        String configFile = "conf/spring-context.xml";
        AbstractApplicationContext context = new FileSystemXmlApplicationContext(configFile);
        context.registerShutdownHook();

        EventDemoService bean = context.getBean(EventDemoService.class);
        bean.publicEventDemo();

    }

}

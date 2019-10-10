package housekeeping.aspect;

import housekeeping.configurations.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext (AppConfig.class)){
            MyInterface bean = ctx.getBean ("myBean",MyInterface.class);
            System.out.println (bean.sayHello ("Homer") );
            System.out.println (bean.sayGoodbye ("Homer") );
        }
    }
}

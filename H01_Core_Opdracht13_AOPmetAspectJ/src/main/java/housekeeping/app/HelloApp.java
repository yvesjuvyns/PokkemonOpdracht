package housekeeping.app;


import housekeeping.configurations.AppConfig;
import housekeeping.school.ClassRoom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class HelloApp {







    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        ClassRoom classRoom = ctx.getBean("classRoom",ClassRoom.class);

        classRoom.printYourName();
        




    }


}

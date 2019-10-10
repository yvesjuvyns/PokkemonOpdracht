package housekeeping.configurations;

import housekeeping.aspect.MyBean;
import housekeeping.aspect.MyInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("housekeeping.*")
@EnableAspectJAutoProxy
public class AppConfig {



    @Bean
    public MyInterface myBean() {
        return new MyBean ();
    }
}

package ytespring.egitim.demo.practice3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {


    @Bean
    public BeanTest getBeanTest() {
        return new BeanTest();
    }
}

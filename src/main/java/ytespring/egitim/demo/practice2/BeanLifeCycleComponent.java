package ytespring.egitim.demo.practice2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleComponent {

    public BeanLifeCycleComponent() {
        System.out.println("Practice2Component constructor called!");
    }


    @PostConstruct
    private void init() {
        System.out.println("Practice2Component initialized!");
    }


    public void print() {
        System.out.println("print method in Practice2Component is working!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Practice2Component is being destroyed!");
    }
}

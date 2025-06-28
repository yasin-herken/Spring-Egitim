package ytespring.egitim.demo.practice1;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {

    public void print() {
        System.out.println("Constructor Injection Bean is working!");
    }

}

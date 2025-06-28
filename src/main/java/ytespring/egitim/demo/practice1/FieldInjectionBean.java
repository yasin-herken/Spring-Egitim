package ytespring.egitim.demo.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {

    public void print() {
        System.out.println("Field Injection Bean is working!");
    }

}

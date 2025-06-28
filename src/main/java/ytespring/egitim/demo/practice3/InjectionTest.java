package ytespring.egitim.demo.practice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionTest {


    private BeanTest beanTest;

    private ComponentTest componentTest2;

    @Autowired
    public InjectionTest(BeanTest beanTest, ComponentTest componentTest2) {
        this.beanTest = beanTest;
        this.componentTest2 = componentTest2;
    }

    public void print() {
        System.out.println("Injection Test is working!");
        beanTest.print();
        componentTest2.print();
    }
}

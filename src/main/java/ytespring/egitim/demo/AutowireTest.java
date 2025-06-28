package ytespring.egitim.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireTest {

    // Field injection
    @Autowired
    private ComponentTest componentTest;

    public void test() {
        componentTest.print();
    }
}

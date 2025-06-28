package ytespring.egitim.demo.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {

    @Autowired
    private FieldInjectionBean fieldInjectionBean;

    private final ConstructorInjectionBean constructorInjectionBean;
    private SetterInjectionBean setterInjectionBean;

    @Autowired
    DependencyInjectionTest(final ConstructorInjectionBean constructorInjectionBean) {
        this.constructorInjectionBean = constructorInjectionBean;
    }

    @Autowired
    public void setSetterInjectionBean(final SetterInjectionBean setterInjectionBean) {
        this.setterInjectionBean = setterInjectionBean;
    }

    public void test() {
        fieldInjectionBean.print();
        constructorInjectionBean.print();
        setterInjectionBean.print();
    }


}

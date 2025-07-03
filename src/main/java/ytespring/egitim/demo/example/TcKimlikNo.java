package ytespring.egitim.demo.example;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TcKimlikNoValidator.class)
public @interface TcKimlikNo {

    String message() default "Geçersiz TC Kimlik Numarası";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

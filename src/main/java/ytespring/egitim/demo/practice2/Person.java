package ytespring.egitim.demo.practice2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private String surname;
    private int age;

    public void incrementAge() {
        this.age++;
    }
}

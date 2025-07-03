package ytespring.egitim.demo.practice2;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @ResponseBody
    @RequestMapping("/person")
    public ResponseEntity<List<Person>> getPerson(@RequestBody List<Person> personList) {
        personList.forEach(Person::incrementAge);
        return ResponseEntity.ok(personList);
    }
}

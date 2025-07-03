package ytespring.egitim.demo.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    // Ruquest Param

    @RequestMapping("/test")
    public void test(@RequestParam String name, @RequestParam String username) {
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
    }

    // Path Variable
    //@RequestMapping("/courses/{courseNumber}")
    //public void course(@PathVariable Long courseNumber) {
    //    System.out.println("Course Number: " + courseNumber);
    //}

    @GetMapping("/test2")
    public ResponseEntity<String> test2() {
        return ResponseEntity.status(HttpStatus.OK)
                .header("hataVarMi", "false")
                .contentType(MediaType.APPLICATION_JSON)
                .body("Test Başarılı");
    }
}

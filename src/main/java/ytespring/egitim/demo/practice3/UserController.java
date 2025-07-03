package ytespring.egitim.demo.practice3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ytespring.egitim.demo.example.User;

@RestController
public class UserController {

    @PostMapping("/user")
    public void validateUser(@RequestBody @Valid User user) {
    }

    @ExceptionHandler(value = {IllegalArgumentException.class})
    public String handleException(IllegalArgumentException e) {
        return "Hatali İstek! " + e.getMessage();
    }
}

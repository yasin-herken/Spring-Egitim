package ytespring.egitim.demo.practice4.login.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ytespring.egitim.demo.practice4.login.service.AuthenticationService;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginRequest loginRequest) {
        return authenticationService.login(loginRequest);
    }

    @PostMapping("/logout")
    public void logout() {
        authenticationService.logout();
    }
}

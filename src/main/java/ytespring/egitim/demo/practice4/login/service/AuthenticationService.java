package ytespring.egitim.demo.practice4.login.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import ytespring.egitim.demo.practice4.login.controller.LoginRequest;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final SecurityContextRepository securityContextRepository;

    public String login(LoginRequest loginRequest) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(loginRequest.username(), loginRequest.password());

        Authentication authenticatedAuthentication = authenticationManager.authenticate(token);
        if (authenticatedAuthentication.isAuthenticated()) {
            return "Authentication is successful";
        }
        return "Authentication failed";

    }

    public void logout() {
        SecurityContextHolder.clearContext();
        saveContext();
    }

    private void saveContext() {
        if (RequestContextHolder.getRequestAttributes() != null) {
            var request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            var response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            securityContextRepository.saveContext(SecurityContextHolder.getContext(), request, response);
        }
    }
}

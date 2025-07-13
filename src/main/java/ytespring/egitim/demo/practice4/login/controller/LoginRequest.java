package ytespring.egitim.demo.practice4.login.controller;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(
        @NotEmpty
        String username,
        @NotEmpty
        String password

) {
}
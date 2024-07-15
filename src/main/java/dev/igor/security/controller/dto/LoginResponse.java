package dev.igor.security.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}

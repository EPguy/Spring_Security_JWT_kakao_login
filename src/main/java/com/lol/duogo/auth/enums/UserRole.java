package com.lol.duogo.auth.enums;

import com.lol.duogo.exception.ErrorCode;
import org.springframework.http.HttpStatus;

public enum UserRole {
    USER("user"),
    ADMIN("admin");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

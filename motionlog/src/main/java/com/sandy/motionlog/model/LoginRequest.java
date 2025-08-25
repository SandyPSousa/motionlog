package com.sandy.motionlog.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String senha;
}
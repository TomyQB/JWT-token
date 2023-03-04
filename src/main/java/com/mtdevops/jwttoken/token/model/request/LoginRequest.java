package com.mtdevops.jwttoken.token.model.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String username;
    private String password;
}

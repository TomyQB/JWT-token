package com.mtdevops.jwttoken.token.model.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {

    private long id;
    private String type;
    private String token;
    private String username;
    private List<String> roles;

    public JwtResponse(long id, String token, String username, List<String> roles) {
        this.id = id;
        this.type = "Bearer";
        this.token = token;
        this.username = username;
        this.roles = roles;
    }

}

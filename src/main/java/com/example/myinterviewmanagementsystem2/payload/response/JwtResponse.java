package com.example.myinterviewmanagementsystem2.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private long id;
    private String username;
    private String email;
    private List<String> roles1;

    public JwtResponse(String token, long id, String username, String email, List<String> roles1) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles1 = roles1;
    }
}

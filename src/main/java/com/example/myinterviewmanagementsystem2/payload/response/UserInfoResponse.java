package com.example.myinterviewmanagementsystem2.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class UserInfoResponse {
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
}

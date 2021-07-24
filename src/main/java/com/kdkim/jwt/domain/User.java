package com.kdkim.jwt.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private int userId;
    private String username;
    private String password;
    private String nickname;
    private int activated;
    // private List<Authority> authorities;
}

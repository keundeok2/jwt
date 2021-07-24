package com.kdkim.jwt;

import com.kdkim.jwt.domain.User;
import com.kdkim.jwt.mapper.IUserMapper;
import com.kdkim.jwt.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JwtApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void test() {

        System.out.println(userService.getUser("admin"));
        System.out.println(userService.getUserAuthorities(1));
    }

}

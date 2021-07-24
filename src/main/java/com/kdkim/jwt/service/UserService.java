package com.kdkim.jwt.service;

import com.kdkim.jwt.domain.Authority;
import com.kdkim.jwt.domain.User;
import com.kdkim.jwt.mapper.IUserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private IUserMapper userMapper;

    public User getUser(String username) {
        return userMapper.getUserByUsername(username);
    }

    public List<String> getUserAuthorities(int userId) {
        return userMapper.getUserAuthorities(userId);
    }

}

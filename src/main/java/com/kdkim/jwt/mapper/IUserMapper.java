package com.kdkim.jwt.mapper;

import com.kdkim.jwt.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {

    public User getUserByUsername(String username);

    public List<String> getUserAuthorities(int userId);

}

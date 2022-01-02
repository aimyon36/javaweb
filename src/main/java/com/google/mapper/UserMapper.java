package com.google.mapper;

import com.google.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    //根据用户名获取用户信息
    User getUserByName(String username);
}

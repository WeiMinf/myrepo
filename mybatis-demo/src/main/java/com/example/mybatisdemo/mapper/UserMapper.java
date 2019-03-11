package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper {

    User findById(Integer id);

    User findUser(@Param("id")Integer id,@Param("userName") String userName);

    User findUser(Map map);
}

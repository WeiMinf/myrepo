package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    public User findUser(Integer id, String userName) {
        return userMapper.findUser(id, userName);
    }

    public User findUser2(Integer id, String userName) {
        Map map=new HashMap();
        map.put("id",id);
        map.put("userName",userName);
        return userMapper.findUser(map);
    }

}

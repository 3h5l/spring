package com.cn.hl.service.impl;

import com.cn.hl.mapper.UserMapper;
import com.cn.hl.pojo.User;
import com.cn.hl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll() {

        List<User> users = userMapper.selectAll();
        return users;
    }
}

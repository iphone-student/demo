package com.dahua.hzcommon.service.impl;


import com.dahua.hzcommon.dao.User;

import com.dahua.hzcommon.mapper.UserMapper;
import com.dahua.hzcommon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> findUser(){
            return userMapper.findUser();
    }
    @Cacheable(cacheNames = "id", key = "#id")
    public List<User> findById(int id){
            return userMapper.findById(id);
    }
    public int addUser(String name,int age,String sex){
            return userMapper.addUser(name, age, sex);
    }
    public int UpdateUser( int id,String name, int age, String sex){
            return userMapper.UpdateUser( id, name, age, sex);
    }
    public int deleteUser( int id){
            return userMapper.deleteUser( id);
    }

}

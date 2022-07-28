package com.dahua.redis.service.impl;


import com.dahua.redis.dao.User;
import com.dahua.redis.mapper.UserMapper;
import com.dahua.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    public List<User> findUser(){
            return userMapper.findUser();
    }
    public Object findId(int id){
        String key = "User"+ id;
        Object userObj = redisTemplate.opsForValue().get(key);
        if(userObj == null){

            synchronized (this.getClass()){
                userObj = redisTemplate.opsForValue().get(key);
                if(userObj == null){
                    System.out.println("查询数据库+++++++++++++++++++");
                    List<User> user = userMapper.findId(id);
                    redisTemplate.opsForValue().set(key,user);
                    return user;
                }else{
                    System.out.println("查询缓存--------（同步代码块）—------");
                    return userObj;
                }
            }
        }else{
            System.out.println("查询缓存-----------------");
        }
            return userMapper.findId(id);
    }
@Cacheable(cacheNames = "user",key = "#id")
    public User getById(Integer id){
        return userMapper.getById(id);
    }

}

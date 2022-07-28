package com.dahua.redis.controller;


import com.dahua.redis.dao.User;

import com.dahua.redis.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class redisController {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserServiceimpl userService;


    @GetMapping("/redis/get/{key}")
    public Object get(@PathVariable("key")String key){
        return redisTemplate.opsForValue().get(key);
    }
    @PostMapping("/redis/get/{key}/{value}")
    public Object set(@PathVariable("key")String key,@PathVariable("value")String value){
         redisTemplate.opsForValue().set(key,value);
         return "success";
    }
    @GetMapping("/redis/getById/{id}")
    public User getById(@PathVariable("id")Integer id){
        return userService.getById(id);

    }
}

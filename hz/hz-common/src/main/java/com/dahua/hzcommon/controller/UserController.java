package com.dahua.hzcommon.controller;


import com.dahua.hzcommon.dao.User;
import com.dahua.hzcommon.service.UserService;
import com.dahua.hzcommon.service.impl.UserServiceimpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "UserController", description = "用户信息管理")
public class UserController {

    @Autowired
    private UserServiceimpl userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/findUser")
    public List<User> findUser(){

        List<User> a = userService.findUser();

        return a;
    }
    @PostMapping("/findById")
    public List<User> findById(int id){
        List<User> a = userService.findById(id);
        redisTemplate.opsForValue().set("id",id);


        return a;
    }
    @PostMapping("/addUser")
    public Map addUser( String name, int age, String sex){
        Map map = new HashMap();
        int a = userService.addUser(name,age,sex);
        if (a>0) {
            map.put("操作代码", 2200);
        }
        return map;
    }
    @PostMapping("/UpdateUser")
    public Map UpdateUser( int id,String name, int age, String sex){
        Map map = new HashMap();
        int a = userService.UpdateUser(id,name,age,sex);
        if (a>0) {
            map.put("修改成功", 200);
        }
        return map;
    }
    @GetMapping("/deleteUser")
    public Map deleteUser( int id){
        Map map = new HashMap();
        int a = userService.deleteUser(id);
        if (a>0) {
            map.put("删除成功", 200);
        }
        return map;
    }

}

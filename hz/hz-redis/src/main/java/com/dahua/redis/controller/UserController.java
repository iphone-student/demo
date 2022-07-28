package com.dahua.redis.controller;



import com.dahua.redis.dao.User;
import com.dahua.redis.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Api(tags = "UserController", description = "商品优选管理")
public class UserController {

    @Autowired
    private UserServiceimpl userService;

    @RequestMapping("/findUser")
    public List<User> findUser(){

        List<User> a = userService.findUser();

        return a;
    }
    @RequestMapping("/findId/{id}")
    public Object findId(@PathVariable("id") int id){

       Object a = userService.findId(id);

        return a;
    }

}

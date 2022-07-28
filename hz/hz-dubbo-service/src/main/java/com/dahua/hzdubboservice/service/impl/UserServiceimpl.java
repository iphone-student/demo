package com.dahua.hzdubboservice.service.impl;

import com.dahua.hzcommon.dao.User;
import com.dahua.hzcommon.mapper.UserMapper;
import com.dahua.hzcommon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> findUser(){
            return userMapper.findUser();
    }

}

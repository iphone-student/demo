package com.dahua.redis.service;


import com.dahua.redis.dao.User;

import java.util.List;

public interface UserService {

    public List<User> findUser ();
    public Object findId (int id);
    public User getById(Integer id);
}

package com.dahua.hzcommon.service;

import com.dahua.hzcommon.dao.User;

import java.util.List;

public interface UserService {

    public List<User> findUser ();
    public List<User> findById (int id);
    public int addUser(String name,int age,String sex);
    public int UpdateUser( int id,String name, int age, String sex);
    public int deleteUser( int id);
}

package com.dahua.hzcommon.mapper;

import com.dahua.hzcommon.dao.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> findUser();
    public List<User> findById(int id);
    public int addUser(String name,int age,String sex);
    public int UpdateUser( int id,String name, int age, String sex);
    public int deleteUser( int id);
}

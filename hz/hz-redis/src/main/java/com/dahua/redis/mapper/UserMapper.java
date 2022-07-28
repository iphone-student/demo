package com.dahua.redis.mapper;


import com.dahua.redis.dao.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> findUser();
    public List<User> findId(int id);
    @Select("SELECT * FROM user WHERE id=#{id}")
    public User getById(Integer id);
    @Update("UPDATE user SET name =#{name},age=#{age},sex=#{sex} WHERE id=#{id}")
    public void updateById(User user);
    @Delete("DELETE FROM user WHERE id=#{id}")
    public void deleteById(Integer id);
    @Insert("INSERT INTO user(name,age,sex) VALUES(#{name},#{age},#{sex})")
    public void insertUser(User user);








}

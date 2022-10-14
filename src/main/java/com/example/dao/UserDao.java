package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("insert into t_user (name, age, email) values(#{name}, #{age})")
    int save(User user);
    @Update("update t_user set name = #{name}, age = #{age}, email = #{email} where id = #{id}")
    int update(User user);
    @Delete("delete from t_user where id = #{id}")
    int delete(Integer id);
    @Select("select id, name, age, email from t_user where id = #{id}")
    User getById(Integer id);
    @Select("select id, name, age, email from t_user")
    List<User> getAll();
}

package com.example.demo2.dao;

import com.example.demo2.entity.Resource;
import com.example.demo2.entity.Role;
import com.example.demo2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    List<User> showAllUsers();
    int addUser(User user);
    int deleteUserById(int uid);
    int updateUser(User user);
    User findUserById(int uid);
    Role findRoleByUid(int uid);
    Resource findResouceByUser(int uid);




}

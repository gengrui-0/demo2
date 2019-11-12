package com.example.demo2.service;
import com.example.demo2.entity.User;
import com.example.demo2.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> showAllUsers(){
        return userMapper.showAllUsers();
    }
    public int addUser(User user){
        return userMapper.addUser(user);
    }
    public int deleteUserById(int uid){
        return userMapper.deleteUserById(uid);
    }
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
    public User findUserById(int uid){
        return userMapper.findUserById(uid);
    }
}

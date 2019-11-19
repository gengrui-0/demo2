package com.example.demo2.controller;


import com.example.demo2.entity.Resource;
import com.example.demo2.entity.Role;
import com.example.demo2.entity.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequestMapping(value = "/user", method = { RequestMethod.GET, RequestMethod.POST })
@RestController

public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")

    public List<User> showallusers() {
        return userService.showAllUsers();
    }


    @RequestMapping("/add")

    public String addRole( User user) {
        int result= userService.addUser(user);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }



    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete( int uid) {
        int result = userService.deleteUserById(uid);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update( User user) {
        int result = userService.updateUser(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @RequestMapping(value = "/finduser", method = RequestMethod.GET)
    public User findUserById( int uid) {
        return  userService.findUserById(uid);
    }

    @RequestMapping(value = "/findrole", method = RequestMethod.GET)
    public List<Role> findRoleByUid( int uid) {
        return  userService.findRoleByUid(uid);
    }

    @RequestMapping(value = "/findresource", method = RequestMethod.GET)
    public List<Resource> findResourceByUser( int uid) {
        return  userService.findResourceByUser(uid);
    }
}
package com.example.demo2.controller;


import com.example.demo2.entity.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showallusers")
    @ResponseBody
    public List<User> showAllUsers() {
        return userService.showAllUsers();
    }


    @RequestMapping("/adduser")
    @ResponseBody
    public String addUser(User user) {
        int result= userService.addUser(user);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }



    @RequestMapping(value = "/deleteuserbyid", method = RequestMethod.GET)
    public String delete(int uid) {
        int result = userService.deleteUserById(uid);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }


    @RequestMapping(value = "/updateuser", method = RequestMethod.GET)
    public String update(User user) {
        int result = userService.updateUser(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    @RequestMapping(value = "/finduserbyid", method = RequestMethod.GET)
    public User findUserById(int uid) {
        return  userService.findUserById(uid);
    }
}
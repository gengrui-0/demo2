package com.example.demo2.controller;

import com.example.demo2.entity.Resource;
import com.example.demo2.entity.Role;
import com.example.demo2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/role", method = { RequestMethod.GET, RequestMethod.POST })
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Role> showAllUsers() {
        return roleService.showAllRoles();
    }


    @RequestMapping("/add")
    @ResponseBody
    public String addRole(@RequestBody Role role) {
       int result= roleService.addRole(role);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }



    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestBody int roid) {
        int result = roleService.deleteRoleById(roid);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(@RequestBody Role role) {
        int result = roleService.updateUser(role);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    @RequestMapping(value = "/findrole", method = RequestMethod.GET)
    public Role findRoleById(@RequestBody int roid) {
        return  roleService.findRoleById(roid);
    }

    @RequestMapping(value = "/findResource", method = RequestMethod.GET)
    public Resource findResourceByRole(@RequestBody int roid) {
        return  roleService.findResourceByRole(roid);
    }
}

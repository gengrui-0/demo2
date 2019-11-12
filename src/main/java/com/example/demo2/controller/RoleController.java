package com.example.demo2.controller;

import com.example.demo2.entity.Role;
import com.example.demo2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/role", method = { RequestMethod.GET, RequestMethod.POST })
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/showallroles")
    @ResponseBody
    public List<Role> showAllUsers() {
        return roleService.showAllRoles();
    }


    @RequestMapping("/addrole")
    @ResponseBody
    public String addRole(Role role) {
       int result= roleService.addRole(role);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }



    @RequestMapping(value = "/deleterolebyid", method = RequestMethod.GET)
    public String delete(int roid) {
        int result = roleService.deleteRoleById(roid);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }


    @RequestMapping(value = "/updaterole", method = RequestMethod.GET)
    public String update(Role role) {
        int result = roleService.updateUser(role);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    @RequestMapping(value = "/findrolebyid", method = RequestMethod.GET)
    public Role findRoleById(int roid) {
        return  roleService.findRoleById(roid);
    }
}

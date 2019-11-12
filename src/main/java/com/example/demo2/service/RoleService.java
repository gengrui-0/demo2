package com.example.demo2.service;
import com.example.demo2.dao.RoleMapper;

import com.example.demo2.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;
    public List<Role> showAllRoles(){
        return roleMapper.showAllRoles();
    }
    public int addRole(Role role){
        return roleMapper.addRole(role);
    }
    public int deleteRoleById(int roid){
        return roleMapper.deleteRoleById(roid);
    }
    public int updateUser(Role role){
        return roleMapper.updateRole(role);
    }
    public Role findRoleById(int roid){
        return  roleMapper.findRoleById(roid);
    }
}

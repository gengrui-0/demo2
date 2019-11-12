package com.example.demo2.dao;

import com.example.demo2.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface RoleMapper {
    List<Role> showAllRoles();
    int addRole(Role role);
    int deleteRoleById(int roid);
    int updateRole(Role role);
    Role findRoleById(int roid);

}

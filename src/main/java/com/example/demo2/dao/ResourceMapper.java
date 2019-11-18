package com.example.demo2.dao;

import com.example.demo2.entity.Resource;
import com.example.demo2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ResourceMapper {
    List<Resource> showAllResources();
    int addResource(Resource resource);
    int deleteResourceById(int reid);
    int updateResource(Resource resource);
    Resource findResourceById(int reid);
    User findUserByResouce(int reid);
}

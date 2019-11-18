package com.example.demo2.service;

import com.example.demo2.dao.ResourceMapper;
import com.example.demo2.entity.Resource;
import com.example.demo2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceMapper resourceMapper;
    public List<Resource> showAllResources(){

        return resourceMapper.showAllResources();
    }
    public int addResource(Resource resource){

        return resourceMapper.addResource(resource);
    }
    public int deleteResourceById(int reid){

        return resourceMapper.deleteResourceById(reid);
    }
    public int updateResource(Resource role){

        return resourceMapper.updateResource(role);
    }
    public Resource findResourceById(int reid){

        return  resourceMapper.findResourceById(reid);
    }
    public User findUserByResource(int reid){
        return resourceMapper.findUserByResouce(reid);
    }
}

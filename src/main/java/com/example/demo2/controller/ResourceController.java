package com.example.demo2.controller;

import com.example.demo2.entity.Resource;
import com.example.demo2.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/resource", method = { RequestMethod.GET, RequestMethod.POST })
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @RequestMapping("/showallresources")
    @ResponseBody
    public List<Resource> showAllUsers() {
        return resourceService.showAllResources();
    }


    @RequestMapping("/addresource")
    @ResponseBody
    public String addResource(Resource resource) {
        int result= resourceService.addResource(resource);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }



    @RequestMapping(value = "/deleteresourcebyid", method = RequestMethod.GET)
    public String delete(int reid) {
        int result = resourceService.deleteResourceById(reid);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }


    @RequestMapping(value = "/updateresource", method = RequestMethod.GET)
    public String update(Resource resource) {
        int result = resourceService.updateResource(resource);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    @RequestMapping(value = "/findresourcebyid", method = RequestMethod.GET)
    public Resource findRoleById(int reid) {
        return  resourceService.findResourceById(reid);
    }
}

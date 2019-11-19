package com.example.demo2.controller;

import com.example.demo2.entity.Resource;
import com.example.demo2.entity.User;
import com.example.demo2.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/resource", method = { RequestMethod.GET, RequestMethod.POST })
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Resource> showAllUsers() {

        return resourceService.showAllResources();
    }


    @RequestMapping("/add")
    @ResponseBody
    public String addResource(@RequestBody  Resource resource) {
        int result= resourceService.addResource(resource);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }



    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestBody int reid) {
        int result = resourceService.deleteResourceById(reid);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(@RequestBody Resource resource) {
        int result = resourceService.updateResource(resource);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    @RequestMapping(value = "/findresource", method = RequestMethod.GET)
    public Resource findResourceById(@RequestBody int reid) {
        return  resourceService.findResourceById(reid);
    }

    @RequestMapping(value = "/finduser", method = RequestMethod.GET)
    public User findUserByResouce(@RequestBody int reid) {

        return  resourceService.findUserByResource(reid);
    }
}

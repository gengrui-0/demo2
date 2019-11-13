package com.example.demo2.entity;

import java.util.List;

public class Role {
    private int roid;
    private  String roname;
    private List<Resource> resourceList;

    public int getRoid() {
        return roid;
    }

    public void setRoid(int roid) {
        this.roid = roid;
    }

    public String getRoname() {
        return roname;
    }

    public void setRoname(String roname) {
        this.roname = roname;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }
}

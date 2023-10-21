package com.shravan.UserManagement.controller;

import com.shravan.UserManagement.Model.MyPermission;
import com.shravan.UserManagement.service.PermissionService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PermissionController {
    @Autowired
    PermissionService permissionService;
    @PostMapping("permission/{name}")
    public String AddPermission(@PathVariable String name){
        //MyPermission p=newPer;
        System.out.println(name);
        return permissionService.AddPermission(name);
    }
}

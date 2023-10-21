package com.shravan.UserManagement.controller;

import com.shravan.UserManagement.Model.Role;
import com.shravan.UserManagement.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("Roles")
    public String AddRole(@RequestBody Role newRole){
        return roleService.AddRole(newRole);
    }
}

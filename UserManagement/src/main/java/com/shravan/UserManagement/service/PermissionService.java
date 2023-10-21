package com.shravan.UserManagement.service;

import com.shravan.UserManagement.Model.MyPermission;
import com.shravan.UserManagement.Repo.PermissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {
    @Autowired
    PermissionRepo permissionRepo;

    public String AddPermission(String name) {
        MyPermission p=new MyPermission(null,name);
        p.setName(name);
        permissionRepo.save(p);
        return ":Add Permission";
    }
}

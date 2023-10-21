package com.shravan.UserManagement.service;

import com.shravan.UserManagement.Model.Role;
import com.shravan.UserManagement.Repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepo roleRepo;

    public String AddRole(Role newRole) {
        roleRepo.save(newRole);
        return "ADD Role";
    }
}

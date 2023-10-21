package com.shravan.UserManagement.controller;

import com.shravan.UserManagement.Model.UserProfile;
import com.shravan.UserManagement.service.UserProfleService;
import com.shravan.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {
    @Autowired
    UserProfleService userProfleService;
    @PostMapping("Userprofile")
    public String AddUserprofile(@RequestBody UserProfile newUserpro){
        return userProfleService. AddUserprofile(newUserpro);
    }
}

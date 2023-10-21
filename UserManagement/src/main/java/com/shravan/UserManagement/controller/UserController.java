package com.shravan.UserManagement.controller;

import com.shravan.UserManagement.Model.User;
import com.shravan.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("User")
    public String AddUser(@RequestBody User newUser){
        return userService.AddUser(newUser);
    }
    @GetMapping("User/Get")
    public List<User> getAll(){
        return userService.getAll();
    }
}

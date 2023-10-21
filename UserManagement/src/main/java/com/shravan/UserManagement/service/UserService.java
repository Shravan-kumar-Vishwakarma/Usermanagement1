package com.shravan.UserManagement.service;

import com.shravan.UserManagement.Model.User;
import com.shravan.UserManagement.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String AddUser(User newUser) {
        userRepo.save(newUser);
        return "Added User";
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }
}

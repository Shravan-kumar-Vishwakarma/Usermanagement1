package com.shravan.UserManagement.service;

import com.shravan.UserManagement.Model.UserProfile;
import com.shravan.UserManagement.Repo.UesrProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfleService {
    @Autowired
    UesrProfileRepo uesrProfileRepo;

    public String AddUserprofile(UserProfile newUserpro) {
        uesrProfileRepo.save(newUserpro);
        return "ADD USERPROFILE";
    }
}

package com.shravan.UserManagement.Repo;

import com.shravan.UserManagement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

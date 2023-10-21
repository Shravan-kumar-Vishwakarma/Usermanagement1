package com.shravan.UserManagement.Repo;

import com.shravan.UserManagement.Model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UesrProfileRepo extends JpaRepository<UserProfile,Long> {
}

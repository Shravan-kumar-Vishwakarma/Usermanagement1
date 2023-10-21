package com.shravan.UserManagement.Repo;

import com.shravan.UserManagement.Model.MyPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepo extends JpaRepository<MyPermission,Long> {
}

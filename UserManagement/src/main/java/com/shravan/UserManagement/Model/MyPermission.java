package com.shravan.UserManagement.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class MyPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(nullable = false, unique = true)
    private String name;

//    @ManyToMany
//    private Set<Role> roles;
}

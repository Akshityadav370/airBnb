package com.airBnbApp.airBnbApp.entity;

import com.airBnbApp.airBnbApp.entity.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String name;

    @ElementCollection(fetch = FetchType.EAGER) // should be used when putting EnumType.STRING
    // the above will create a new table 'app_user_roles', where the user roles are seen,
    // one to many mapping will happen here
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}

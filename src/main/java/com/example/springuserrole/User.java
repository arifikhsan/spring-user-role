package com.example.springuserrole;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@RequiredArgsConstructor
@Entity(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Role role;

    public User(String name, Role role) {
        this.name = name;
        this.role = role;
    }
}

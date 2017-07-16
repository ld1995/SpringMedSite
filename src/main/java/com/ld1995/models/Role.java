package com.ld1995.models;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name="role")
    private String role;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }
}

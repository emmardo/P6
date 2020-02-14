package com.openclassrooms.P6.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "role")
@EntityListeners(AuditingEntityListener.class)
public class Role {

    //Change roleId to not AUTO generated?
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId;

    @OneToOne(mappedBy = "User")
    private User user;

    @NotBlank
    public enum Roles {

        Admin(1),
        User(2);

        private int role;

        Roles(int role) {
            this.role = role;
        }

        int getRole() {

            return role;
        }
    }

    private Roles roles;

    public Role() {
    }

    public Role(int roleId, Roles roles) {

        this.roleId = roleId;
        this.roles = roles;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

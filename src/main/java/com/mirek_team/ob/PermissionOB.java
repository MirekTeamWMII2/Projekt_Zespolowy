package com.mirek_team.ob;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "uprawnienia")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class PermissionOB extends BaseOB implements Serializable{

    private String name;

    @ManyToMany(targetEntity = RoleOB.class, fetch = FetchType.EAGER)
    private List<RoleOB> roles;

    public PermissionOB(String name, List<RoleOB> roles) {
        this.name = name;
        this.roles = roles;
    }

    public PermissionOB() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoleOB> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleOB> roles) {
        this.roles = roles;
    }

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        super.setTechDate(new Date());
    }
}

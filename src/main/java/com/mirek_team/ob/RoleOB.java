package com.mirek_team.ob;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "role")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class RoleOB extends BaseOB implements Serializable{

    private String name;
    @ManyToMany(targetEntity = PermissionOB.class, fetch = FetchType.EAGER)
    private List<PermissionOB> premissions;

    @ManyToMany(targetEntity = UserOB.class, fetch = FetchType.EAGER)
    private List<UserOB> users;

    public RoleOB( String name, List<UserOB> users, List<PermissionOB> premissions) {
        this.name = name;
        this.users = users;
        this.premissions = premissions;
    }

    public RoleOB() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserOB> getUsers() {
        return users;
    }

    public void setUsers(List<UserOB> users) {
        this.users = users;
    }

    public List<PermissionOB> getPremissions() {
        return premissions;
    }

    public void setPremissions(List<PermissionOB> premissions) {
        this.premissions = premissions;
    }

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        super.setTechDate(new Date());
    }
}

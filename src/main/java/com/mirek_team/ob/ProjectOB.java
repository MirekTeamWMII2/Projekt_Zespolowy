package com.mirek_team.ob;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "projekty")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class ProjectOB extends BaseOB implements Serializable{
    private String name;
    private String version;
    private String description;

    @ManyToOne(targetEntity = PriorityOB.class, fetch = FetchType.EAGER)
    private PriorityOB priority;

    @ManyToMany(targetEntity = UserOB.class, fetch = FetchType.EAGER)
    private List<UserOB> users;

    @OneToMany(targetEntity = TicketOB.class, fetch = FetchType.EAGER)
    private List<TicketOB> ticets;

    public ProjectOB(String name, String version, String description, PriorityOB priority, List<UserOB> users, List<TicketOB> ticets) {
        this.name = name;
        this.version = version;
        this.description = description;
        this.priority = priority;
        this.users = users;
        this.ticets = ticets;
    }

    public ProjectOB(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PriorityOB getPriority() {
        return priority;
    }

    public void setPriority(PriorityOB priority) {
        this.priority = priority;
    }

    public List<UserOB> getUsers() {
        return users;
    }

    public void setUsers(List<UserOB> users) {
        this.users = users;
    }

    public List<TicketOB> getTicets() {
        return ticets;
    }

    public void setTicets(List<TicketOB> ticets) {
        this.ticets = ticets;
    }

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        super.setTechDate(new Date());
    }
}

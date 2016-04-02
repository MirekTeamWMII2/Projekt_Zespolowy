package com.mirek_team.ob;

import com.mirek_team.Enums.EUserType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "uzytkownicy")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class UserOB extends BaseOB implements Serializable{

    private String name;
    private String lastName;
    private String email;
    private String login;
    private String password;
    private Boolean active;
    private EUserType type;

    @ManyToMany(targetEntity = RoleOB.class, fetch = FetchType.EAGER)
    private List<RoleOB> roles;

    @ManyToMany(targetEntity = ProjectOB.class, fetch = FetchType.EAGER)
    private List<ProjectOB> projects;

    @ManyToMany(targetEntity = TicketOB.class, fetch = FetchType.EAGER)
    private List<TicketOB> tickets;

    @OneToMany(targetEntity = HistoryOB.class, fetch = FetchType.EAGER)
    private List<HistoryOB> history;

    @OneToMany(targetEntity = AttachmentOB.class, fetch = FetchType.EAGER)
    private List<AttachmentOB> attachments;

    public UserOB(String name, String lastName, String email, String login, String password,
                    Boolean active, EUserType type, List<RoleOB> roles, List<ProjectOB> projects,
                    List<TicketOB> tickets, List<HistoryOB> history, List<AttachmentOB> attachments) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.login = login;
        this.password = password;
        this.active = active;
        this.type = type;
        this.roles = roles;
        this.projects = projects;
        this.tickets = tickets;
        this.history = history;
        this.attachments = attachments;
    }

    public UserOB(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public EUserType getType() {
        return type;
    }

    public void setType(EUserType type) {
        this.type = type;
    }

    public List<RoleOB> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleOB> roles) {
        this.roles = roles;
    }

    public List<ProjectOB> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectOB> projects) {
        this.projects = projects;
    }

    public List<TicketOB> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketOB> tickets) {
        this.tickets = tickets;
    }

    public List<HistoryOB> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryOB> history) {
        this.history = history;
    }

    public List<AttachmentOB> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentOB> attachments) {
        this.attachments = attachments;
    }

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        super.setTechDate(new Date());
    }

}

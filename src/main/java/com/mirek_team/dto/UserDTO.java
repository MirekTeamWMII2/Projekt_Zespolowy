package com.mirek_team.dto;

import com.mirek_team.Enums.EUserType;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class UserDTO extends BaseDTO{
    private String name;
    private String lastName;
    private String email;
    private String login;
    private String password;
    private Boolean active;
    private EUserType type;
    private List<RoleDTO> roles;
    private List<ProjectDTO> projects;
    private List<TicketDTO> tickets;
    private List<HistoryDTO> history;
    private List<AttachmentDTO> attachments;

    public UserDTO(long id, Date techDate, String name, String lastName, String email, String login, String password,
                   Boolean active, EUserType type, List<RoleDTO> roles, List<ProjectDTO> projects,
                   List<TicketDTO> tickets, List<HistoryDTO> history, List<AttachmentDTO> attachments) {
        super(id, techDate);
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

    public UserDTO() {
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

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }

    public List<ProjectDTO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDTO> projects) {
        this.projects = projects;
    }

    public List<TicketDTO> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketDTO> tickets) {
        this.tickets = tickets;
    }

    public List<HistoryDTO> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryDTO> history) {
        this.history = history;
    }

    public List<AttachmentDTO> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments;
    }
}

package com.mirek_team.dto;

import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class ProjectDTO extends BaseDTO{
    private String name;
    private String version;
    private String description;
    private PriorityDTO priority;
    private List<UserDTO> users;
    private List<TicketDTO> ticets;

    public ProjectDTO(long id, Date techDate, String name, String version, String description, PriorityDTO priority, List<UserDTO> users, List<TicketDTO> ticets) {
        super(id, techDate);
        this.name = name;
        this.version = version;
        this.description = description;
        this.priority = priority;
        this.users = users;
        this.ticets = ticets;
    }

    public ProjectDTO() {
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

    public PriorityDTO getPriority() {
        return priority;
    }

    public void setPriority(PriorityDTO priority) {
        this.priority = priority;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    public List<TicketDTO> getTicets() {
        return ticets;
    }

    public void setTicets(List<TicketDTO> ticets) {
        this.ticets = ticets;
    }
}

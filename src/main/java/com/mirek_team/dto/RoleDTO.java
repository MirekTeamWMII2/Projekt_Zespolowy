package com.mirek_team.dto;

import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class RoleDTO extends BaseDTO {
    private String name;
    private List<PermissionDTO> premissions;
    private List<UserDTO> users;

    public RoleDTO(long id, Date techDate, String name, List<PermissionDTO> premissions, List<UserDTO> users) {
        super(id, techDate);
        this.name = name;
        this.premissions = premissions;
        this.users = users;
    }

    public RoleDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionDTO> getPremissions() {
        return premissions;
    }

    public void setPremissions(List<PermissionDTO> premissions) {
        this.premissions = premissions;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }
}

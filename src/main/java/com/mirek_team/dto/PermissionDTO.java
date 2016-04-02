package com.mirek_team.dto;

import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class PermissionDTO extends BaseDTO{
    private String name;
    private List<RoleDTO> roles;

    public PermissionDTO(long id, Date techDate, String name, List<RoleDTO> roles) {
        super(id, techDate);
        this.name = name;
        this.roles = roles;
    }

    public PermissionDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }
}

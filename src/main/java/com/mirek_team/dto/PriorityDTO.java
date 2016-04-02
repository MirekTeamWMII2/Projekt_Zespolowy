package com.mirek_team.dto;

import com.mirek_team.Enums.EUnitType;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class PriorityDTO extends BaseDTO {
    private String name;
    private int ammount;
    private EUnitType unit;
    private List<ProjectDTO> projects;

    public PriorityDTO(long id, Date techDate, String name, int ammount, EUnitType unit, List<ProjectDTO> projects) {
        super(id, techDate);
        this.name = name;
        this.ammount = ammount;
        this.unit = unit;
        this.projects = projects;
    }

    public PriorityDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public EUnitType getUnit() {
        return unit;
    }

    public void setUnit(EUnitType unit) {
        this.unit = unit;
    }

    public List<ProjectDTO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDTO> projects) {
        this.projects = projects;
    }
}

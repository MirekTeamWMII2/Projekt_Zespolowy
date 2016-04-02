package com.mirek_team.ob;

import com.mirek_team.Enums.EUnitType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "priorytety")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class PriorityOB extends BaseOB implements Serializable{

    private String name;
    private int ammount;
    private EUnitType unit;

    @OneToMany(targetEntity = ProjectOB.class, fetch = FetchType.EAGER)
    private List<ProjectOB> projects;

    public PriorityOB(String name, int ammount, EUnitType unit, List<ProjectOB> projects) {
        this.name = name;
        this.ammount = ammount;
        this.unit = unit;
        this.projects = projects;
    }

    public PriorityOB() {
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

    public List<ProjectOB> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectOB> projects) {
        this.projects = projects;
    }

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        super.setTechDate(new Date());
    }
}

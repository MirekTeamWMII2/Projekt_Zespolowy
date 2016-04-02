package com.mirek_team.dto;

import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class BaseDTO {
    private long id;
    private Date techDate;

    public BaseDTO(long id, Date techDate) {
        this.id = id;
        this.techDate = techDate;
    }

    public BaseDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTechDate() {
        return techDate;
    }

    public void setTechDate(Date techDate) {
        this.techDate = techDate;
    }
}

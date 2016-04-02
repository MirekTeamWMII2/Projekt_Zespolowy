package com.mirek_team.ob;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Piotr Uszler on 01.04.2016.
 */
@MappedSuperclass
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class BaseOB {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
    private long id;

    @Column(name = "techdate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date techDate;

    public BaseOB() {
    }

    public BaseOB(long id){
        this.id = id;
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

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        techDate = new Date();
    }
}

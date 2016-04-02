package com.mirek_team.ob;

import com.mirek_team.Enums.ETicketType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "zgloszenia")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class TicketOB extends BaseOB implements Serializable {

    private ETicketType type;
    private String description;

    @ManyToOne(targetEntity = ProjectOB.class, fetch = FetchType.EAGER)
    private ProjectOB project;

    @ManyToMany(targetEntity = UserOB.class, fetch = FetchType.EAGER)
    private List<UserOB> users;

    @OneToMany(targetEntity = HistoryOB.class, fetch = FetchType.EAGER)
    private List<HistoryOB> history;

    @OneToMany(targetEntity = AttachmentOB.class, fetch = FetchType.EAGER)
    private List<AttachmentOB> attachments;

    public TicketOB(ETicketType type, String description, ProjectOB project, List<UserOB> users, List<HistoryOB> history, List<AttachmentOB> attachments) {
        this.type = type;
        this.description = description;
        this.project = project;
        this.users = users;
        this.history = history;
        this.attachments = attachments;
    }

    public TicketOB() {
    }

    public ETicketType getType() {
        return type;
    }

    public void setType(ETicketType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectOB getProject() {
        return project;
    }

    public void setProject(ProjectOB project) {
        this.project = project;
    }

    public List<UserOB> getUsers() {
        return users;
    }

    public void setUsers(List<UserOB> users) {
        this.users = users;
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

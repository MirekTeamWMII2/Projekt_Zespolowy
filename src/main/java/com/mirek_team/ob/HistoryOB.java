package com.mirek_team.ob;

import com.mirek_team.Enums.EHistoryType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "historia")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class HistoryOB extends BaseOB implements Serializable {

    @ManyToOne(targetEntity = TicketOB.class, fetch = FetchType.EAGER)
    private TicketOB ticket;

    @ManyToOne(targetEntity = UserOB.class, fetch = FetchType.EAGER)
    private UserOB user;

    @OneToMany(targetEntity = AttachmentOB.class, fetch = FetchType.EAGER)
    private List<AttachmentOB> attachments;

    private EHistoryType historyType;
    private String description;

    public HistoryOB(TicketOB ticket, UserOB user, EHistoryType historyType, String description, List<AttachmentOB> attachments) {
        this.ticket = ticket;
        this.user = user;
        this.historyType = historyType;
        this.description = description;
        this.attachments = attachments;
    }

    public HistoryOB() {
    }

    public TicketOB getTicket() {
        return ticket;
    }

    public void setTicket(TicketOB ticket) {
        this.ticket = ticket;
    }

    public UserOB getUser() {
        return user;
    }

    public void setUser(UserOB user) {
        this.user = user;
    }

    public EHistoryType getHistoryType() {
        return historyType;
    }

    public void setHistoryType(EHistoryType historyType) {
        this.historyType = historyType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

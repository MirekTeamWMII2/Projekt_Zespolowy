package com.mirek_team.ob;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "zalaczniki")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class AttachmentOB extends BaseOB implements Serializable {

    @ManyToOne(targetEntity = TicketOB.class, fetch = FetchType.EAGER)
    private TicketOB ticket;

    @OneToOne(targetEntity = BinaryOB.class, fetch = FetchType.EAGER)
    private BinaryOB binary;

    @ManyToOne(targetEntity = UserOB.class, fetch = FetchType.EAGER)
    private UserOB user;

    @ManyToOne(targetEntity = HistoryOB.class, fetch = FetchType.EAGER)
    private HistoryOB history;

    private String fileName;
    private String mimeType;

    public AttachmentOB(TicketOB ticket, BinaryOB binary, String fileName, String mimeType, UserOB user, HistoryOB history) {
        this.ticket = ticket;
        this.binary = binary;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.user = user;
        this.history = history;
    }

    public AttachmentOB() {
    }

    public TicketOB getTicket() {
        return ticket;
    }

    public void setTicket(TicketOB ticket) {
        this.ticket = ticket;
    }

    public BinaryOB getBinary() {
        return binary;
    }

    public void setBinary(BinaryOB binary) {
        this.binary = binary;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public UserOB getUser() {
        return user;
    }

    public void setUser(UserOB user) {
        this.user = user;
    }

    public HistoryOB getHistory() {
        return history;
    }

    public void setHistory(HistoryOB history) {
        this.history = history;
    }

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        super.setTechDate(new Date());
    }
}

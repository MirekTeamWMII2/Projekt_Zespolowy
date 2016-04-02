package com.mirek_team.dto;

import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class AttachmentDTO extends BaseDTO{
    private String fileName;
    private String mimeType;
    private TicketDTO ticket;
    private BinaryDTO binary;
    private HistoryDTO history;
    private UserDTO user;

    public AttachmentDTO(long id, Date techDate, String fileName, String mimeType, TicketDTO ticket, BinaryDTO binary, HistoryDTO history, UserDTO user) {
        super(id, techDate);
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.ticket = ticket;
        this.binary = binary;
        this.history = history;
        this.user = user;
    }

    public AttachmentDTO() {
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

    public TicketDTO getTicket() {
        return ticket;
    }

    public void setTicket(TicketDTO ticket) {
        this.ticket = ticket;
    }

    public BinaryDTO getBinary() {
        return binary;
    }

    public void setBinary(BinaryDTO binary) {
        this.binary = binary;
    }

    public HistoryDTO getHistory() {
        return history;
    }

    public void setHistory(HistoryDTO history) {
        this.history = history;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}

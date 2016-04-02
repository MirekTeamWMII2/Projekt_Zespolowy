package com.mirek_team.dto;

import com.mirek_team.Enums.EHistoryType;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class HistoryDTO extends BaseDTO{
    private EHistoryType historyType;
    private String description;
    private TicketDTO ticket;
    private UserDTO user;
    private List<AttachmentDTO> attachments;

    public HistoryDTO(long id, Date techDate, EHistoryType historyType, String description, TicketDTO ticket, UserDTO user, List<AttachmentDTO> attachments) {
        super(id, techDate);
        this.historyType = historyType;
        this.description = description;
        this.ticket = ticket;
        this.user = user;
        this.attachments = attachments;
    }

    public HistoryDTO() {
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

    public TicketDTO getTicket() {
        return ticket;
    }

    public void setTicket(TicketDTO ticket) {
        this.ticket = ticket;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public List<AttachmentDTO> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments;
    }
}

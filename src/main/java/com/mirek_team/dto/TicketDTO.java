package com.mirek_team.dto;

import com.mirek_team.Enums.ETicketType;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class TicketDTO extends BaseDTO{

    private ETicketType type;
    private String description;
    private ProjectDTO project;
    private List<UserDTO> users;
    private List<HistoryDTO> history;
    private List<AttachmentDTO> attachments;

    public TicketDTO(long id, Date techDate, ETicketType type, String description, ProjectDTO project, List<UserDTO> users, List<HistoryDTO> history, List<AttachmentDTO> attachments) {
        super(id, techDate);
        this.type = type;
        this.description = description;
        this.project = project;
        this.users = users;
        this.history = history;
        this.attachments = attachments;
    }

    public TicketDTO() {
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

    public ProjectDTO getProject() {
        return project;
    }

    public void setProject(ProjectDTO project) {
        this.project = project;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    public List<HistoryDTO> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryDTO> history) {
        this.history = history;
    }

    public List<AttachmentDTO> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments;
    }
}

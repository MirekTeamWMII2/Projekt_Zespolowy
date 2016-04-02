package com.mirek_team.dto;

import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@ApiModel
public class BinaryDTO extends BaseDTO{
    private Byte binary;
    private AttachmentDTO attachment;

    public BinaryDTO(long id, Date techDate, Byte binary, AttachmentDTO attachment) {
        super(id, techDate);
        this.binary = binary;
        this.attachment = attachment;
    }

    public BinaryDTO() {
    }

    public Byte getBinary() {
        return binary;
    }

    public void setBinary(Byte binary) {
        this.binary = binary;
    }

    public AttachmentDTO getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentDTO attachment) {
        this.attachment = attachment;
    }
}

package com.mirek_team.ob;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Piotr Uszler on 02.04.2016.
 */
@Entity
@Table(name = "binaria")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class BinaryOB extends BaseOB implements Serializable{

    private Byte binary;

    @OneToOne(targetEntity = AttachmentOB.class, fetch = FetchType.EAGER)
    private AttachmentOB attachment;

    public BinaryOB(Byte binary,AttachmentOB attachment) {
        this.binary = binary;
        this.attachment = attachment;
    }

    public BinaryOB() {
    }

    public Byte getBinary() {
        return binary;
    }

    public void setBinary(Byte binary) {
        this.binary = binary;
    }

    public AttachmentOB getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentOB attachment) {
        this.attachment = attachment;
    }

    @PrePersist
    @PreUpdate
    private void setCurrentDate() {
        super.setTechDate(new Date());
    }
}

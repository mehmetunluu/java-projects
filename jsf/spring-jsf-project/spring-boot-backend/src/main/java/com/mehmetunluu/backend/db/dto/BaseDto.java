package com.mehmetunluu.backend.db.dto;

import java.time.LocalDateTime;

/**
 * Created by Mehmet ÜNLÜ on 18.06.2016.
 */
public abstract class BaseDto {

    private Long id;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String createdUser;
    private String mofiedUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getMofiedUser() {
        return mofiedUser;
    }

    public void setMofiedUser(String mofiedUser) {
        this.mofiedUser = mofiedUser;
    }
}

package com.mehmetunluu.backend.db;


import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Mehmet ÜNLÜ on 18.06.2016.
 */
@MappedSuperclass
public  abstract class BaseModel {

    @Column(name = "id")
    @GeneratedValue
    @Id
    private Long id;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "modified_user")
    private String mofiedUser;

    public BaseModel() {
    }

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

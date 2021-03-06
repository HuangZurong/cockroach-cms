package com.cockroach.cockcms.cms.entity.main;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Wave
 * @version v 0.1 2015/8/27 23:42
 */
@Entity
@Table(name = "book_favor", schema = "", catalog = "cockcms")
public class BookFavorEntity {
    private int id;
    private String userId;
    private String bookId;
    private Timestamp gmtCreate;
    private String createUserId;
    private Timestamp gmtModify;
    private String modifyUserId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "book_id")
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Basic
    @Column(name = "create_user_id")
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "gmt_modify")
    public Timestamp getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Timestamp gmtModify) {
        this.gmtModify = gmtModify;
    }

    @Basic
    @Column(name = "modify_user_id")
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookFavorEntity that = (BookFavorEntity) o;

        if (id != that.id) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModify != null ? !gmtModify.equals(that.gmtModify) : that.gmtModify != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (gmtModify != null ? gmtModify.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        return result;
    }
}

package com.marcio.springsecuritybasicsec7.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "notice_details")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    @Column(name = "notice_id")
    private int noticeId;
    @Column(name="notice_summary")
    private String noticeSummary;
    @Column(name="notice_details")
    private String noticeDetails;
    @Column(name="notic_beg_dt")
    private String noticeBeginAt;
    @Column(name="notic_end_dt")
    private String noticeEndAt;
    @Column(name="create_at")
    @CreationTimestamp
    private String createAt;
    @Column(name="update_at")
    @UpdateTimestamp
    private String updateAt;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeSummary() {
        return noticeSummary;
    }

    public void setNoticeSummary(String noticeSummary) {
        this.noticeSummary = noticeSummary;
    }

    public String getNoticeDetails() {
        return noticeDetails;
    }

    public void setNoticeDetails(String noticeDetails) {
        this.noticeDetails = noticeDetails;
    }

    public String getNoticeBeginAt() {
        return noticeBeginAt;
    }

    public void setNoticeBeginAt(String noticeBeginAt) {
        this.noticeBeginAt = noticeBeginAt;
    }

    public String getNoticeEndAt() {
        return noticeEndAt;
    }

    public void setNoticeEndAt(String noticeEndAt) {
        this.noticeEndAt = noticeEndAt;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}

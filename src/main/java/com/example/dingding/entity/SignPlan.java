package com.example.dingding.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 20:40
 * description:
 */

public class SignPlan {
    private int id;
    private int gId;
    private int uId;
    private String spName;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date startTime;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date endTime;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date endDate;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

package com.example.dingding.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/26 19:14
 * description:SignPlan
 */

public class SignPlanDto {
    private int id;
    private int gId;
    private int uId;
    private String spname;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date starttime;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date endtime;
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

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

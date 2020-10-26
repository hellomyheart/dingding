package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 20:40
 * description:
 */
@TableName("sign_plan")
@NoArgsConstructor
public class SignPlan {
    @TableId(type = IdType.AUTO)
    private int id;
    private int gId;
    private int uId;
    private String spName;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date startTime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date endTime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date startDate;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
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

    public SignPlan(int id) {
        this.id = id;
    }
}

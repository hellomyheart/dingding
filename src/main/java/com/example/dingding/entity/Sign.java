package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 20:38
 * description:打卡表
 */
@TableName("sign")
@NoArgsConstructor
public class Sign {
    @TableId(type = IdType.AUTO)
    private int id;
    private int spId;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private int uId;

    private Date signTime;

    public Sign(int getgId, int getuId, String spname, Date starttime, Date endtime, Date startDate, Date endDate) {

    }

    public Sign(int getuId) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpId() {
        return spId;
    }

    public void setSpId(int spId) {
        this.spId = spId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

}

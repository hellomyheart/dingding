package com.example.dingding.entity;

import java.util.Date;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 20:38
 * description:打卡表
 */

public class Sign {
    private int id;
    private int spId;
    private int uId;
    private Date signTime;

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

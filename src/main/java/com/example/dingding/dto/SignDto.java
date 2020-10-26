package com.example.dingding.dto;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/26 19:10
 * description:Sign
 */

public class SignDto {
    private int spId;
    private int uId;

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

    @Override
    public String toString() {
        return "SignDto{" +
                "spId=" + spId +
                ", uId=" + uId +
                '}';
    }
}

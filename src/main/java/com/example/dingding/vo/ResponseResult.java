package com.example.dingding.vo;

import com.example.dingding.core.type.RType;
import lombok.Data;


/**
 * @description 统一返回结果集
 * @className: ResponseResult
 * @package: cn.hellomyheart.kataba.vo
 * @author: Stephen Shen
 * @date: 2020/10/19 下午3:52
 */

public class ResponseResult<T> {

    /**
     * return code
     */
    private int code;
    /**
     * message
     */
    private String msg;

    /**
     * data
     */
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResponseResult getResponseResult(int code, String msg, T data){
        ResponseResult responseResult = new ResponseResult<>();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        responseResult.setData(data);
        return responseResult;
    }


    /**
     * 成功
     * @return
     */
    public static ResponseResult ok() {
        return getResponseResult(RType.成功.getVal(),"OK",null);
    }

    /**
     * 成功,带参
     * @return
     */
    public static <T> ResponseResult ok(T data) {
        return getResponseResult(RType.成功.getVal(),"OK",data);
    }

    /**
     * 失败
     * @return
     */
    public static ResponseResult fail() {
        return getResponseResult(RType.失败.getVal(),"FAIL",null);
    }
}

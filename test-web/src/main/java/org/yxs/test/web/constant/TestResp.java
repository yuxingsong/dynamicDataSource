package org.yxs.test.web.constant;

import java.io.Serializable;

/**
 * Created by yuxingsong on 2018/1/31 0031.
 */
public class TestResp implements Serializable {
   private  String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

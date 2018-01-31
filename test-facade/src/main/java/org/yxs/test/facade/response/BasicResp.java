package org.yxs.test.facade.response;

import java.io.Serializable;
import java.util.List;

public class BasicResp<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 8285007923632630378L;
    private String resultCode;
    private String resultMsg;
    private T data;
    private List<T> dataList;

    public BasicResp() {
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public BasicResp(String code, String message) {
        super();
        this.resultCode = code;
        this.resultMsg = message;
    }

    public static BasicResp build(String code, String message) {
        return new BasicResp(code, message);
    }

    public static BasicResp defaultFail() {
        return build("9999", "系统异常");
    }

    public static BasicResp defaultSucesss() {
        return build("0000", "成功");
    }
}
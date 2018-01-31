package org.yxs.test.facade.response;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class BasicPageResponse<T extends Serializable> implements Serializable{
    private static final long serialVersionUID = 8285007923632630377L;
    public static final Integer DEFAULT_PAGE_SIZE = Integer.valueOf(10);
    private String resultCode;
    private String resultMsg;
    private Integer pageNo = Integer.valueOf(1);
    private Integer pageSize;
    private Integer totalPage;
    private Integer totalCount;
    private List<T> dataList;

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

    public BasicPageResponse() {
        this.pageSize = DEFAULT_PAGE_SIZE;
        this.totalPage = Integer.valueOf(0);
        this.totalCount = Integer.valueOf(0);
        this.dataList = Collections.emptyList();
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if(pageNo == null) {
            this.pageNo = pageNo;
        } else {
            this.pageNo = Integer.valueOf(pageNo.intValue() < 1?1:pageNo.intValue());
        }

    }
    public void setTotalPage(Integer totalPage) {
        if(totalPage == null) {
            this.totalPage = totalPage;
        } else {
            this.totalPage = Integer.valueOf(totalPage.intValue() < 1?1:totalPage.intValue());
        }

    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize == null) {
            this.pageSize = pageSize;
        } else {
            this.pageSize = pageSize.intValue() < 1?DEFAULT_PAGE_SIZE:pageSize;
        }

    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = Integer.valueOf(totalCount.intValue() < 0?0:totalCount.intValue());
    }

    public Integer getTotalPage() {
        return this.totalPage;
    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public static BasicPageResponse build(String resultCode, String resultMsg) {
        BasicPageResponse neptunePageResponse =new BasicPageResponse();
        neptunePageResponse.setResultCode(resultCode);
        neptunePageResponse.setResultMsg(resultMsg);
        return neptunePageResponse;
    }

}

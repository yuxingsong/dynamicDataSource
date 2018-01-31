package org.yxs.test.facade.request;

import java.io.Serializable;

/**
 * Created by yuxingsong on 2018/1/31 0031.
 */
public class UserReq implements Serializable{
    private Integer id;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    private String dataSource;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

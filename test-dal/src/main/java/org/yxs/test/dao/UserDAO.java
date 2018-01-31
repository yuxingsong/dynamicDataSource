package org.yxs.test.dao;

import org.yxs.test.entity.UserEntity;

/**
 * Created by yuxingsong on 2018/1/31 0031.
 */
public interface UserDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}

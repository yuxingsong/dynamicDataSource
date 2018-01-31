package org.yxs.test.service.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yxs.test.facade.UserFacade;
import org.yxs.test.facade.response.BasicResp;
import org.yxs.test.facade.response.UserDTO;
import org.yxs.test.service.UserService;

/**
 * Created by yuxingsong on 2018/1/31 0031.
 */
@Service
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private UserService userService;

    @Override
    public BasicResp<UserDTO> queryUserById(Integer id) {
        return userService.queryUserById(id);
    }
}

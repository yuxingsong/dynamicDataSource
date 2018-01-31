package org.yxs.test.facade;

import org.yxs.test.facade.response.BasicResp;
import org.yxs.test.facade.response.UserDTO;

/**
 * Created by yuxingsong on 2018/1/31 0031.
 */
public interface UserFacade {

    BasicResp<UserDTO> queryUserById(Integer id);
}

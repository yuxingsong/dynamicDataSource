package org.yxs.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yxs.test.dao.UserDAO;
import org.yxs.test.entity.UserEntity;
import org.yxs.test.facade.response.BasicResp;
import org.yxs.test.facade.response.UserDTO;

/**
 * Created by yuxingsong on 2018/1/31 0031.
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public BasicResp<UserDTO> queryUserById(Integer id) {
        UserEntity userEntity=userDAO.selectByPrimaryKey(id);
        BasicResp<UserDTO> resp=BasicResp.defaultSucesss();
        UserDTO userDTO=new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setName(userEntity.getName());
        userDTO.setGender(userEntity.getGender());
        userDTO.setAge(userEntity.getAge());
        resp.setData(userDTO);
        return resp;
    }
}

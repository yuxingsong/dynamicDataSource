package org.yxs.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yxs.test.facade.UserFacade;
import org.yxs.test.facade.request.UserReq;
import org.yxs.test.facade.response.BasicResp;
import org.yxs.test.facade.response.UserDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by yuxingsong on 2017/10/13 0013.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserFacade userFacade;

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public BasicResp<UserDTO> query(@RequestBody UserReq userReq,HttpServletRequest request) {
        HttpSession session =request.getSession();
        session.setAttribute("ds",userReq.getDataSource());
        return userFacade.queryUserById(userReq.getId());
    }
}

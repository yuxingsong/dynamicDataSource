package org.yxs.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yxs.test.web.constant.TestResp;

/**
 * Created by yuxingsong on 2017/10/13 0013.
 */
@Controller
@RequestMapping(value = "/yxs",method = RequestMethod.GET)
public class MockController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public TestResp hello() {
        TestResp resp=new TestResp();
        resp.setCode("1231");
        resp.setMsg("fdsafdsa");
        return resp;
    }
}

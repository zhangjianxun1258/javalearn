package com.demo.controll;

import com.demo.pojo.User;
import com.demo.sdk.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mybatis")
public class MyBatisController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUserById(Long id){
        return iUserService.getUser(id);
    }
}

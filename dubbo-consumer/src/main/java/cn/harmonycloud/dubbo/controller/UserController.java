package cn.harmonycloud.dubbo.controller;

import cn.harmonycloud.dubbo.entity.UserModel;
import cn.harmonycloud.dubbo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/getUser")
    public UserModel getUser(int id) {
        return userService.getUser(id);
    }
}

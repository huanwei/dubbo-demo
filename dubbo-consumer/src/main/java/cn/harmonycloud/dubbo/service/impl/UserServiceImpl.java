package cn.harmonycloud.dubbo.service.impl;


import cn.harmonycloud.dubbo.entity.UserModel;
import cn.harmonycloud.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class UserServiceImpl {

    @Reference(version = "1.0.0")
    private UserService userService;

    public UserModel getUser(int id) {
        return userService.getUser(id);
    }
}

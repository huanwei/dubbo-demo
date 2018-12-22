package cn.harmonycloud.dubbo.service.impl;

import cn.harmonycloud.dubbo.entity.UserModel;
import cn.harmonycloud.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public UserModel getUser(int id) {
        switch (id) {
            case 1:
                return new UserModel(id, "a", 10, "杭州");
            case 2:
                return new UserModel(id, "b", 20, "上海");
            case 3:
                return new UserModel(id, "c", 30, "北京");
            default:
                return new UserModel(id, "d", 40, "中国");
        }
    }
}

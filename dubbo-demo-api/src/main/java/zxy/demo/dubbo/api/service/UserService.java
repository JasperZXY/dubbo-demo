package zxy.demo.dubbo.api.service;


import java.util.List;

import zxy.demo.dubbo.api.domain.User;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll();
}

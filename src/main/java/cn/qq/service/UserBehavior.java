package cn.qq.service;

import cn.qq.model.Users;

/**
 * Created by Administrator on 2019/5/16.
 */
public interface UserBehavior {

    int login(String userName, String password);

    int register(Users users);
}

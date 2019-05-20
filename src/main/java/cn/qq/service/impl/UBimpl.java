package cn.qq.service.impl;

import cn.qq.dao.UsersMapper;
import cn.qq.model.Users;
import cn.qq.service.UserBehavior;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/5/16.
 */
@Service("UBimpl")
public class UBimpl implements UserBehavior {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public int login(String userName, String password) {

        return 0;
    }

    @Override
    public int register(Users users) {
        return 0;
    }
}

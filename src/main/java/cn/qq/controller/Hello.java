package cn.qq.controller;

import cn.qq.dao.UsersMapper;
import cn.qq.model.Users;
import cn.qq.utils.Local2Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2019/5/15.
 */
@RestController
@Slf4j
public class Hello {

    @Autowired
    private UsersMapper usersMapper;

    @RequestMapping("/test")
    public String hello(){
        Users users=new Users();
        users.setUserName("qqq");
        users.setPassword("123");
        users.setCreatetime(Local2Date.Local2Date());
        //LocalDate.now()
        try{
        usersMapper.insert(users);}
        catch (Exception e){
            e.getMessage();
        }
        return  "hello";
    }
}

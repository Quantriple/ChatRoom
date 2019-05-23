package cn.qq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/5/15.
 */
@RestController
@Slf4j
public class Hello {



    @RequestMapping("/test")
    public String hello(){
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.warn("warn");
        return  null;
    }
}

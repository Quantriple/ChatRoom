package cn.qq.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2019/5/21.
 */
@ControllerAdvice
public class GlobeExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultHandler(HttpServletRequest req, Exception e) {


        return null;
    }

}

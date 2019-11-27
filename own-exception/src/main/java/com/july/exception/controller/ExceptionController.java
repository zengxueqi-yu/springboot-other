package com.july.exception.controller;

import com.july.exception.util.BnException;
import com.july.exception.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义异常处理接口类
 * @author zqk
 * @since 2019/11/21
 */
@RestController
public class ExceptionController {

    @RequestMapping("/test")
    public Result test(){
        int num = 1;
        BnException.of(num > 0,"自定义异常信息");
        return Result.ok("测试自定义异常信息");
    }

}

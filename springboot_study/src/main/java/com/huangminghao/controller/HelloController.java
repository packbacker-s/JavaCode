package com.huangminghao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/21
 * @Time:15:59
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/nihao")
    public String hello() {
        return "hello";
    }
}

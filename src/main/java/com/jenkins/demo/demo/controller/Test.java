package com.jenkins.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanChengLong
 * @date 2019/7/25
 * @desc 测试
 */
@RestController
public class Test {

    @RequestMapping("/test")

    public String test() {
        return "cccc";
    }

}

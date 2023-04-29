package com.atwzs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @ClassName HelloController
 * @Description
 * @Author WangZhisheng
 * @Date 9:43 2023/4/28
 * @Version 11.0.15
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/", params = {"username", "password=123"})
    public String login() {
        System.out.println("米博士");
        return "login";
    }

    @RequestMapping("/?*")
    public String success(HttpServletRequest request) {
        System.out.println("67890-0987");
        return "login";
    }

    @ResponseBody
    @RequestMapping("/test/{id}/{username}")
    public String test(@PathVariable("id") Integer id, @PathVariable("username") String name) {
        System.out.println(id + " " + name);
        return "sucess";
    }

    @PostMapping("/test/show")
    public void test11(@RequestParam("name") String name,@RequestParam("password") String password) {
        System.out.println(name);
        System.out.println(password);
    }
}


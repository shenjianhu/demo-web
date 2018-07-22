package com.hsj.user.controller;

import com.hsj.user.UserService;
import com.hsj.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(("/user"))
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/hello")
    public String hello(){
        System.out.println("接收到请求 ，Hello");
        return "hi";
    }

    @RequestMapping(value = "/login")
    public String login(User user, HttpServletRequest request){
        try {
            User curUser = userService.login(user);
            if(curUser == null){
                System.out.println("登陆失败");
                return "error";
            }else {
                System.out.println("登陆成功");
                return "index";
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("登录失败");
            return "error";
        }
    }
}

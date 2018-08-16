package jxufe.lwl.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {
    @RequestMapping("{module}Manager")
    public String toManager(@PathVariable("module")String module, HttpSession session){
            return module+"Manager";
    }
    @RequestMapping("login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("welcome")
    public String toWelcome(){
        return "welcome";
    }
    @RequestMapping("manager")
    public String toMain(){
        return "manager";
    }
}
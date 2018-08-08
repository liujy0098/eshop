package jxufe.lwl.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("{module}Manager")
    public String toManager(@PathVariable("module")String module){
        return module+"Manager";
    }
}

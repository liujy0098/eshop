package jxufe.lwl.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/8/9.
 */
@Controller
public class AdvertismentController {

    @RequestMapping("/ad/adlist")
    public String find_Ad(){

        return "ad/adlist";
    }
}

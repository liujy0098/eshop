package jxufe.lwl.eshop.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import jxufe.lwl.eshop.tools.WXUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/8/15 0015.
 */
@Controller
public class WXController {


    @Value("${appid}")
    private String appid;

    @Value("${secret}")
    private String secret;

    @RequestMapping("wcUser")
    @ResponseBody
    public Object getUser(@RequestParam(name = "code",defaultValue = "")String code){
        String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid="+appid+"&secret="+secret+"&code="+code+"&grant_type=authorization_code";
        String string=new WXUtil().get(url);
        JSONObject object=JSON.parseObject(string);
        System.out.println(object);
        return object;
    }
}

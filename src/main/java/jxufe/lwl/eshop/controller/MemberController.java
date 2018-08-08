package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.MemberinfoDAO;
import jxufe.lwl.eshop.entity.Memberinfo;
import jxufe.lwl.eshop.service.MemberinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/8/8 0008.
 */
@Controller
public class MemberController {
    @Autowired
    private MemberinfoService memberinfoService;

    @RequestMapping("/memberinfo/list")
    @ResponseBody
    public List<Memberinfo> findAll() {
        List<Memberinfo> list = memberinfoService.findAll();
        return list;
    }

}

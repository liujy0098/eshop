package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.MemberinfoDAO;
import jxufe.lwl.eshop.entity.Memberinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("memberinfo")
public class MemberinfoController {
    @Autowired
    private MemberinfoDAO memberinfoDAO;
    @RequestMapping("list")
    @ResponseBody
    public List<Memberinfo> list(){

        return memberinfoDAO.findAll();
    }
}

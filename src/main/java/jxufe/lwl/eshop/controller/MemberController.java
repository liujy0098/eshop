package jxufe.lwl.eshop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jxufe.lwl.eshop.dao.MemberinfoDAO;
import jxufe.lwl.eshop.entity.Memberinfo;
import jxufe.lwl.eshop.service.MemberinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/8 0008.
 */
@Controller
@RequestMapping("/memberinfo/")
public class MemberController {
    @Autowired
    private MemberinfoService memberinfoService;

    @RequestMapping("list")
    @ResponseBody
    public List<Memberinfo> findAll() {
        List<Memberinfo> list = memberinfoService.findAll();
        return list;
    }

    @RequestMapping("pageList")
    @ResponseBody
    public Object findAllPage(@RequestParam(name = "page",defaultValue = "1")Integer page,@RequestParam(name = "rows",defaultValue = "10")Integer rows){
        PageHelper.startPage(page,rows);
        List<Memberinfo> list = memberinfoService.findAll();
        PageInfo pageInfo=new PageInfo(list);
        Map map=new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",list);
        return map;
    }

    @RequestMapping("saveMember")
    @ResponseBody
    public Object saveMember(@RequestParam(name = "memberId",defaultValue = "0")Integer memberId,@RequestParam(name = "memberMobile",defaultValue = "null")String memberMobile,@RequestParam(name = "memberName",defaultValue = "null")String memberName,@RequestParam(name = "memberPasswd",defaultValue = "null")String memberPasswd){
        Memberinfo memberinfo=new Memberinfo(memberId,memberMobile,memberName,memberPasswd);
        return memberinfoService.saveMember(memberinfo);
    }

}

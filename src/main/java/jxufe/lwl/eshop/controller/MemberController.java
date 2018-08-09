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
    public void saveMember(Memberinfo memberinfo){
        memberinfoService.saveMember(memberinfo);
    }

    @RequestMapping("deleteMember")
    @ResponseBody
    public Object deleteMember(@RequestParam(name ="id",defaultValue = "0")Integer memberId){
        return memberinfoService.deleteMember(memberId);
    }

}

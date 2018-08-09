package jxufe.lwl.eshop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jxufe.lwl.eshop.dao.MemberinfoDAO;
import jxufe.lwl.eshop.entity.Memberinfo;
import jxufe.lwl.eshop.service.MemberinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
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

//    @RequestMapping("saveMember")
//    public void saveMember(@RequestParam(name="memberId",defaultValue = "null")Integer memberId,
//                           @RequestParam(name="memberMobile",defaultValue = "null")String memberMobile,
//                           @RequestParam(name="memberName",defaultValue = "null")String memberName,
//                           @RequestParam(name="memberBirthday",defaultValue = "null")Long memberBirthday,
//                           @RequestParam(name="memberPasswd",defaultValue = "null")String memberPasswd,
//                           @RequestParam(name="memberEmail",defaultValue = "null")String memberEmail,
//                           @RequestParam(name="memberWw",defaultValue = "null")String memberWw,
//                           @RequestParam(name="memberLoginNum",defaultValue = "null")Integer memberLoginNum,
//                           @RequestParam(name="createTime",defaultValue = "null")Date createTime,
//                           @RequestParam(name="memberLoginTime",defaultValue = "null")Date memberLoginTime,
//                           @RequestParam(name="memberOldLoginTime",defaultValue = "null")Date memberOldLoginTime,
//                           @RequestParam(name="memberLoginIp",defaultValue = "null")String memberLoginIp,
//                           @RequestParam(name="memberOldLoginIp",defaultValue = "null")String memberOldLoginIp,
//                           @RequestParam(name="isSell",defaultValue = "true")Boolean isSell,
//                           @RequestParam(name="memberState",defaultValue = "true")Boolean memberState
//                           ){
//        Memberinfo memberinfo=new Memberinfo(memberId,memberMobile,memberName,memberBirthday,memberPasswd,memberEmail,memberWw,memberLoginNum,createTime,memberLoginTime,memberOldLoginTime,memberLoginIp,memberOldLoginIp,isSell,memberState);
//        memberinfoService.saveMember(memberinfo);
//    }

    @RequestMapping("saveMember")
    @ResponseBody
    public Object saveMember(@RequestParam(name="memberId",defaultValue = "null")Integer memberId, @RequestParam(name="memberMobile",defaultValue = "null")String memberMobile, @RequestParam(name="memberName",defaultValue = "null")String memberName,@RequestParam(name="memberPasswd",defaultValue = "null")String memberPasswd, @RequestParam(name="memberEmail",defaultValue = "null")String memberEmail){
        if(memberinfoService.findByPK(memberId)!=null){
            memberinfoService.deleteMember(memberId);
        }
        Memberinfo memberinfo=new Memberinfo(memberId,memberMobile,memberName,memberPasswd,memberEmail);
        return memberinfoService.saveMember(memberinfo);
    }
    @RequestMapping("deleteMember")
    @ResponseBody
    public Object deleteMember(@RequestParam(name ="id",defaultValue = "0")Integer memberId){
        return memberinfoService.deleteMember(memberId);
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }


}

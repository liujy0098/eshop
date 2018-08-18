package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.AdminDAO;
import jxufe.lwl.eshop.entity.Admin;
import jxufe.lwl.eshop.entity.Admin;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminDAO adminDAO;

    @RequestMapping("list")
    @ResponseBody
    public List<Admin> list(){
        return adminDAO.findAll();
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(Admin admin){
        String password=admin.getAdminPassword();
        password=DigestUtils.md5Hex(password);
        admin.setAdminPassword(password);
        System.out.println(password);
        admin.setCreatedTime(new Date());
        adminDAO.insertSelective(admin);
        return "YES";
    }

    @RequestMapping("remove")
    public void remove(@RequestBody int[] ids) {
        for(int id:ids)
            adminDAO.deleteByPrimaryKey(id);
    }

    @RequestMapping("update")
    public String update(Admin admin){
        adminDAO.updateByPrimaryKeySelective(admin);
        return "adminManager";
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }





    @RequestMapping("login")
    @ResponseBody
    public String login(String adminName, String adminPassword, HttpSession session){
        adminPassword=DigestUtils.md5Hex(adminPassword);
        Admin admin=adminDAO.login(adminName,adminPassword);
        if(admin==null)
            return "NO";
        else {
            session.setAttribute("adminName",admin.getAdminName());
            return "YES";
        }
    }

    @RequestMapping("pwd")
    @ResponseBody
    public String pwd(String oldAdminPassword,String adminPassword, HttpSession session){
        String adminName=(String)session.getAttribute("adminName");
        oldAdminPassword=DigestUtils.md5Hex(oldAdminPassword);
        adminPassword=DigestUtils.md5Hex(adminPassword);

        Admin admin=adminDAO.login(adminName,oldAdminPassword);
        if(admin==null)
            return "NO";
        else {
            admin.setAdminPassword(adminPassword);
            adminDAO.updateByPrimaryKeySelective(admin);
            return "YES";
        }
    }

    @RequestMapping("signout")
    @ResponseBody
    public String signout(HttpSession session){
            session.removeAttribute("adminName");
            return "YES";
    }

}

package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.AdminDAO;
import jxufe.lwl.eshop.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminController {
    @Autowired
    private AdminDAO adminDAO;

    @RequestMapping("admin")
    public String login(int adminLoginNum, String adminPassword, HttpSession session){
        Admin admin=adminDAO.login(adminLoginNum,adminPassword);
        if(admin==null)
            return "NO";
        else {
            session.setAttribute("admin",admin.getAdminName());
            return "YES";
        }
    }
}

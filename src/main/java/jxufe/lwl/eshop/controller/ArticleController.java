package jxufe.lwl.eshop.controller;

import com.github.pagehelper.PageHelper;
import jxufe.lwl.eshop.dao.ArticleinfoDAO;
import jxufe.lwl.eshop.entity.Articleinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleinfoDAO articleDAO;

    @RequestMapping("list")
    @ResponseBody
    public List<Articleinfo> list(){
        return articleDAO.findAll();
    }

    @RequestMapping("add")
    public String add(Articleinfo articleinfo){
        articleDAO.insertSelective(articleinfo);
        return "articleManager";
    }

    @RequestMapping("remove")
    @ResponseBody
    public void remove(@RequestBody int[] ids) {
        for(int id:ids)
         articleDAO.deleteByPrimaryKey(id);

    }

    @RequestMapping("update")
    public String update(Articleinfo articleinfo){
        articleDAO.updateByPrimaryKeySelective(articleinfo);
        return "articleManager";
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
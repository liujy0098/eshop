package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.ArticleinfoDAO;
import jxufe.lwl.eshop.entity.Articleinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleinfoDAO articleDAO;

    @RequestMapping("list")
    public List<Articleinfo> list(){
        return articleDAO.findAll();
    }

    @RequestMapping("add")
    public void add(Articleinfo articleinfo){
        articleDAO.insertSelective(articleinfo);
    }

    @RequestMapping("delete")
    public void delete(@RequestParam("id") int articleId){
        articleDAO.deleteByPrimaryKey(articleId);
    }

    @RequestMapping("update")
    public void update(Articleinfo articleinfo){
        articleDAO.updateByPrimaryKeySelective(articleinfo);
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
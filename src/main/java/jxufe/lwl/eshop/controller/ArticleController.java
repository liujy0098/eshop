package jxufe.lwl.eshop.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import jxufe.lwl.eshop.dao.ArticleinfoDAO;
import jxufe.lwl.eshop.entity.Articleinfo;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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
        String str="http://192.168.1.123:9527/postnews?"+
                "articleTitle="+articleinfo.getArticleTitle()+
                "&articlePicUrl="+articleinfo.getArticlePicUrl();
        System.out.println(str);

        get(str);

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

    private JSONObject get(String uri){
        HttpMethod httpMethod=new GetMethod(uri);
        HttpClient httpClient=new HttpClient();
        try {
            httpClient.executeMethod(httpMethod);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String jsonString= null;
        try {
            jsonString = httpMethod.getResponseBodyAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(jsonString);
    }
}
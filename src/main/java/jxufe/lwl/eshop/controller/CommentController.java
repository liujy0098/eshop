package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.GoodsCommentDAO;
import jxufe.lwl.eshop.entity.GoodsComment;
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
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private GoodsCommentDAO commentDAO;

    @RequestMapping("list")
    public List<GoodsComment> list(){
        return commentDAO.findAll();
    }

    @RequestMapping("add")
    public void add(GoodsComment goodsComment){
        commentDAO.insertSelective(goodsComment);
    }

    @RequestMapping("delete")
    public void delete(@RequestParam("id") int scommId){
        commentDAO.deleteByPrimaryKey(scommId);
    }

    @RequestMapping("update")
    public String update(GoodsComment goodsComment){
        commentDAO.updateByPrimaryKeySelective(goodsComment);
        return "index";
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}

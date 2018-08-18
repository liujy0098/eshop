package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.GoodsCommentDAO;
import jxufe.lwl.eshop.entity.GoodsComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private GoodsCommentDAO commentDAO;

    @RequestMapping("list")
    @ResponseBody
    public List<GoodsComment> list(){
        return commentDAO.findAll();
    }

    @RequestMapping("add")
    public String add(GoodsComment goodsComment){
        commentDAO.insertSelective(goodsComment);
        return "commentManager";
    }

    @RequestMapping("remove")
    public void remove(@RequestBody int[] ids) {
        for(int id:ids)
        commentDAO.deleteByPrimaryKey(id);
    }

    @RequestMapping("update")
    public String update(GoodsComment goodsComment){
        commentDAO.updateByPrimaryKeySelective(goodsComment);
        return "commentManager";
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}

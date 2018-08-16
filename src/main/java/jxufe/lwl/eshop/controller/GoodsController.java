package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.GoodsinfoDAO;
import jxufe.lwl.eshop.dao.GoodsinfoDAO;
import jxufe.lwl.eshop.entity.Goodsinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsinfoDAO goodsDAO;

    @RequestMapping("list")
    @ResponseBody
    public List<Goodsinfo> list(){
        return goodsDAO.findAll();
    }

    @RequestMapping("add")
    public String add(Goodsinfo goodsinfo){
        goodsDAO.insertSelective(goodsinfo);
        return "goodsManager";
    }

    @RequestMapping("remove")
    public void remove(@RequestBody int[] ids) {
        for(int id:ids)
        goodsDAO.deleteByPrimaryKey(id);
    }

    @RequestMapping("update")
    public String update(Goodsinfo goodsinfo){
        goodsDAO.updateByPrimaryKeySelective(goodsinfo);
        return "goodsManager";
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}

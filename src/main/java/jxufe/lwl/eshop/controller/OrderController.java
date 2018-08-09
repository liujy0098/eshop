package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.OrderinfoDAO;
import jxufe.lwl.eshop.entity.GoodsComment;
import jxufe.lwl.eshop.entity.Orderinfo;
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
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderinfoDAO orderinfoDAO;

    @RequestMapping("list")
    public List<Orderinfo> list(){
        return orderinfoDAO.findAll();
    }

    @RequestMapping("add")
    public void add(Orderinfo orderinfo){
        orderinfoDAO.insertSelective(orderinfo);
    }

    @RequestMapping("delete")
    public void delete(@RequestParam("id") int orderId){
        orderinfoDAO.deleteByPrimaryKey(orderId);
    }

    @RequestMapping("update")
    public void update(Orderinfo orderinfo){
        orderinfoDAO.updateByPrimaryKeySelective(orderinfo);
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}

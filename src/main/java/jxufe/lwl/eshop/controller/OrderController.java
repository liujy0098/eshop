package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.OrderinfoDAO;
import jxufe.lwl.eshop.dao.OrderinfoGoodsDAO;
import jxufe.lwl.eshop.entity.Orderinfo;
import jxufe.lwl.eshop.entity.OrderinfoGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderinfoDAO orderinfoDAO;

    @Autowired
    private OrderinfoGoodsDAO goodslistDao;

    @RequestMapping("list")
    @ResponseBody
    public List<Orderinfo> list(){
        return orderinfoDAO.findAll();
    }

    @RequestMapping("add")
    public String add(Orderinfo orderinfo){
        orderinfoDAO.insertSelective(orderinfo);
        return "orderManager";
    }

    @RequestMapping("remove")
    public void remove(@RequestBody int[] ids) {
        for(int id:ids) orderinfoDAO.deleteByPrimaryKey(id);
    }

    @RequestMapping("update")
    public String update(Orderinfo orderinfo){
        orderinfoDAO.updateByPrimaryKeySelective(orderinfo);
        return "orderManager";
    }

    @RequestMapping("goodslist")
    @ResponseBody
    public List<OrderinfoGoods> goodslist(long orderSn){
        return goodslistDao.findByOrderId(orderSn);
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}

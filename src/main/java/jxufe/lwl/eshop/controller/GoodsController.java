package jxufe.lwl.eshop.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jxufe.lwl.eshop.entity.Advertisment;
import jxufe.lwl.eshop.entity.Goodsinfo;
import jxufe.lwl.eshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/14.
 */
@Controller
@RequestMapping("/Goods/")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("goods_List")
    @ResponseBody
    public Object good_List(@RequestParam(name = "page",defaultValue = "1") Integer page,@RequestParam(name = "rows",defaultValue = "10") Integer rows){
        PageHelper.startPage(page,rows);
        List<Goodsinfo> list = goodsService.findAll();
        PageInfo<Goodsinfo> pageInfo = new PageInfo(list);
        Map map = new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",list);
        return map;
    }



    @RequestMapping("sava_Goods")
    @ResponseBody
    public void saveAd(@RequestParam(name="goodsId",defaultValue = "null")Integer goodsId,
                       @RequestParam(name="goodsName",defaultValue = "null")String goodsName,
                       @RequestParam(name="goodsSubtitle",defaultValue = "null")String goodsSubtitle,
                       @RequestParam(name="gcId",defaultValue = "null")Integer gcId,
                       @RequestParam(name="gcName",defaultValue = "null")String gcName,
                       @RequestParam(name="goodsImage",defaultValue = "null")String goodsImage,
                       @RequestParam(name="goodsClick",defaultValue = "null")Integer goodsClick,
                       @RequestParam(name="goodsState",defaultValue = "null")Integer goodsState,
                       @RequestParam(name="goodsCommend",defaultValue = "null")Integer goodsCommend,
                       @RequestParam(name="goodsDescription",defaultValue = "null")String goodsDescription,
                       @RequestParam(name="goodsCloseReason",defaultValue = "null")String goodsCloseReason,
                       @RequestParam(name="commentNum",defaultValue = "null")Integer commentNum,
                       @RequestParam(name="thumbsUpNum",defaultValue = "null")Long thumbsUpNum,
                       @RequestParam(name="salenumNum",defaultValue = "null")Integer salenumNum,
                       @RequestParam(name="goodsCollectNum",defaultValue = "null")Integer goodsCollectNum,
                       @RequestParam(name="isDel",defaultValue = "null")Integer isDel,
                       @RequestParam(name="memberId",defaultValue = "null")String memberId,
                       @RequestParam(name="stock",defaultValue = "null")Integer stock,
                       @RequestParam(name="updateTime",defaultValue = "null")Long updateTime,
                       @RequestParam(name="createTime",defaultValue = "null")String createTime,
                       @RequestParam(name="goodsOldprice",defaultValue = "null")Double goodsOldprice,
                       @RequestParam(name="goodPrice",defaultValue = "null")Double goodPrice) {
        Date good_createTime = null;
        java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            good_createTime = formatter.parse(createTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(goodsId!=null){
            Goodsinfo goods = new Goodsinfo(goodsId,goodsName,goodsSubtitle,gcId,gcName,goodsImage,goodsClick,goodsState,goodsCommend,goodsDescription,goodsCloseReason,commentNum,thumbsUpNum,salenumNum,goodsCollectNum,isDel,memberId,stock,updateTime,good_createTime,goodsOldprice,goodPrice);
            int row = goodsService.insertSelective(goods);
        }

    }


    @RequestMapping("del_goods")
    @ResponseBody
    public void delGoods(@RequestParam(name="id",defaultValue = "null")Integer id) {
        int row = goodsService.deleteByPrimaryKey(id);
    }


}

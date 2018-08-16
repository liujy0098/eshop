package jxufe.lwl.eshop.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jxufe.lwl.eshop.entity.Advertisment;

import jxufe.lwl.eshop.service.AdvertismentService;
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
 * Created by Administrator on 2018/8/9.
 */
@Controller
@RequestMapping("/Advertisment/")
public class AdvertismentController {

    @Autowired
    private AdvertismentService advertismentService;

//    @RequestMapping("id")
//    @ResponseBody
//    public Object findById(@RequestParam(name ="advId",defaultValue = "1" ) Integer advId,
//                           @RequestParam(name="page",defaultValue = "1") Integer page,
//                            @RequestParam(name = "rows",defaultValue = "10") Integer rows){
//        PageHelper.startPage(page,rows);
//        Advertisment ad = advertismentService.findById(advId);
//        List<Advertisment> list = new ArrayList<>();
//        list.add(ad);
//        PageInfo pageInfo = new PageInfo(list);
//        Map map = new HashMap();
//        map.put("page",pageInfo.getTotal());
//        map.put("rows",list);
//       return map;
//    }

    @RequestMapping("ad_List")
    @ResponseBody
    public Object findAll(@RequestParam(name="page",defaultValue = "1") Integer page,@RequestParam(name="rows",defaultValue = "10") Integer rows){
        PageHelper.startPage(page,rows);
        List<Advertisment> list = advertismentService.findAll();
        PageInfo<Advertisment> pageInfo = new PageInfo(list);
        Map map = new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",list);
        return map;
    }

    @RequestMapping("sava_Ad")
        @ResponseBody
        public void saveAd(@RequestParam(name="advId",defaultValue = "null")Integer advId,
                @RequestParam(name="advTitle",defaultValue = "null")String advTitle,
                @RequestParam(name="advPicUrl",defaultValue = "null")String advPicUrl,
                @RequestParam(name="advOffline",defaultValue = "null")Short advOffline,
                @RequestParam(name="advOrder",defaultValue = "null")Integer advOrder,
                @RequestParam(name="advLinkUrl",defaultValue = "null")String advLinkUrl,
                @RequestParam(name="advCratetime",defaultValue = "null")String advCratetime,
                @RequestParam(name="advUpdatetime",defaultValue = "null")String advUpdatetime) {
            Date adv_Cratetime = null;
            Date adv_Updatetime = null;
            java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                adv_Cratetime = formatter.parse(advCratetime);
                adv_Updatetime = formatter.parse(advUpdatetime);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            if(advId!=null){
                    Advertisment ad = new Advertisment(advId,advTitle,advPicUrl,advOffline,advOrder,advLinkUrl,adv_Cratetime,adv_Updatetime);
                    int row = advertismentService.savaAdById(ad);
            }

    }


    @RequestMapping("del_Ad")
    @ResponseBody
    public void delAd(@RequestParam(name="id",defaultValue = "null")Integer id) {
        int row = advertismentService.deleteByPrimaryKey(id);
    }

}

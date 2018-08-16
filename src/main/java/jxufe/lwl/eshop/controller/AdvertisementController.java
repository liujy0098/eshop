package jxufe.lwl.eshop.controller;

import jxufe.lwl.eshop.dao.AdvertisementDAO;
import jxufe.lwl.eshop.entity.Advertisment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("advertisement")
public class AdvertisementController {
    @Autowired
    private AdvertisementDAO advertisementDAO;

    @RequestMapping("list")
    @ResponseBody
    public List<Advertisment> list(){
        return advertisementDAO.findAll();
    }

    @RequestMapping("add")
    public String add(Advertisment advertisment){
        advertisementDAO.insertSelective(advertisment);
        return "advertisementManager";
    }

    @RequestMapping("remove")
    public void remove(@RequestBody int[] ids) {
        for(int id:ids)
        advertisementDAO.deleteByPrimaryKey(id);
    }

    @RequestMapping("update")
    public String update(Advertisment advertisment){
        advertisementDAO.updateByPrimaryKeySelective(advertisment);
        return "advertisementManager";
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}

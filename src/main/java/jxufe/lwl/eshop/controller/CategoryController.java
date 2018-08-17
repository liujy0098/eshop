package jxufe.lwl.eshop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jxufe.lwl.eshop.entity.GoodsCategory;
import jxufe.lwl.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/10 0010.
 */
@Service
@RequestMapping("/category/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;





    @RequestMapping("list")
    @ResponseBody
    public Object list(){
        return categoryService.findAll();
    }
    @RequestMapping("pageList")
    @ResponseBody
    public Object findAll(@RequestParam(name="page",defaultValue = "1")int page,@RequestParam(name = "rows",defaultValue = "10")int rows){
        PageHelper.startPage(page, rows);
        List<GoodsCategory> list=categoryService.findAll();
        PageInfo pageInfo=new PageInfo(list);
        Map map=new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",list);
        return map;
    }

    @RequestMapping("addCategory")
    @ResponseBody
    public Object addCategory(@RequestParam(name="catName",defaultValue = "null")String catName,@RequestParam(name = "parentId",defaultValue = "0")int parentId){
        return categoryService.addCateGory(catName,parentId);
    }

    @RequestMapping("setCategoryName")
    @ResponseBody
    public Object setCategoryName(@RequestParam(name = "catId",defaultValue = "0") int catId,@RequestParam(name="catName",defaultValue = "null")String catName){
       return  categoryService.setCategoryName(catId,catName);
    }


    @RequestMapping("deleteCategory")
    @ResponseBody
    public Object deleteCategory(@RequestBody int[] ids){
        int count=0;
        for (int id:ids
                ) {
            categoryService.deleteCategory(id);
            count++;
        }
        return count;
    }

    @RequestMapping("saveCategory")
    @ResponseBody
    public Object save(@RequestParam(name = "catId",defaultValue = "0")int catId,
                       @RequestParam(name = "parentId",defaultValue = "0")int parentId,
                       @RequestParam(name = "catName",defaultValue = "null")String catName,
                       @RequestParam(name = "sort",defaultValue = "0")int sort,
                       @RequestParam(name = "isOffline",defaultValue = "0")Boolean isOffline) throws UnsupportedEncodingException {
        if (categoryService.findByPK(catId)!=null){
            categoryService.deleteCategory(catId);
        }
        GoodsCategory goodsCategory=new GoodsCategory();
        goodsCategory.setCatId(catId);
        goodsCategory.setParentId(parentId);
        goodsCategory.setCatName(catName);
        goodsCategory.setSort(sort);
        goodsCategory.setIsOffline(isOffline);
        return categoryService.saveCategory(goodsCategory);
    }

    @RequestMapping("update")
    public Object updateCategory(GoodsCategory goodsCategory){
        categoryService.updateCategory(goodsCategory);
        return "categoryManager";
    }

    @RequestMapping("add")
    public Object addCategory(GoodsCategory goodsCategory){
        categoryService.saveCategory(goodsCategory);
        return "categoryManager";
    }


    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}

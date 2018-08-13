package jxufe.lwl.eshop.service;

import jxufe.lwl.eshop.entity.GoodsCategory;

import java.util.List;

/**
 * Created by Administrator on 2018/8/10 0010.
 */
public interface CategoryService {
    int addCateGory(String catName,int parentId);
    int setCategoryName(int catId,String catName);
    List<GoodsCategory> findAll();
    int deleteCategory(int catId);
    GoodsCategory findByPK(int catId);
    int saveCategory(GoodsCategory goodsCategory);
}

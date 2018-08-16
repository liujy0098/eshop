package jxufe.lwl.eshop.service.impl;

import jxufe.lwl.eshop.dao.GoodsCategoryDAO;
import jxufe.lwl.eshop.entity.GoodsCategory;
import jxufe.lwl.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/8/10 0010.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private GoodsCategoryDAO goodsCategoryDAO;

    public int addCateGory(String catName,int parentId){
        GoodsCategory goodsCategory=new GoodsCategory();
        goodsCategory.setCatName(catName);
        goodsCategory.setParentId(parentId);
        return goodsCategoryDAO.insertSelective(goodsCategory);
    }

    public int setCategoryName(int catId,String catName){
        GoodsCategory goodsCategory=new GoodsCategory();
        goodsCategory.setCatId(catId);
        goodsCategory.setCatName(catName);
        return goodsCategoryDAO.updateByPrimaryKeySelective(goodsCategory);
    }

    @Override
    public List<GoodsCategory> findAll() {
        return goodsCategoryDAO.findAll();
    }

    public int deleteCategory(int catId){
        return goodsCategoryDAO.deleteByPrimaryKey(catId);
    }

    @Override
    public GoodsCategory findByPK(int catId) {
        return goodsCategoryDAO.selectByPrimaryKey(catId);
    }

    public int saveCategory(GoodsCategory goodsCategory){
        return goodsCategoryDAO.insertSelective(goodsCategory);
    }

    @Override
    public int updateCategory(GoodsCategory goodsCategory) {
        return goodsCategoryDAO.updateByPrimaryKeySelective(goodsCategory);
    }
}

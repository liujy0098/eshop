package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.GoodsCategory;

import java.util.List;


/**
 * GoodsCategoryDAO继承基类
 */
public interface GoodsCategoryDAO extends MyBatisBaseDao<GoodsCategory, Integer> {
    List<GoodsCategory> findAll();
}
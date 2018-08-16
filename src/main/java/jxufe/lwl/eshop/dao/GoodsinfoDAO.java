package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Goodsinfo;

import java.util.List;

/**
 * GoodsinfoDAO继承基类
 */
public interface GoodsinfoDAO extends MyBatisBaseDao<Goodsinfo, Integer> {
    List<Goodsinfo> findAll();
}
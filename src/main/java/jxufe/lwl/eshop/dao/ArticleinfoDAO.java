package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Articleinfo;

import java.util.List;

/**
 * ArticleinfoDAO继承基类
 */
public interface ArticleinfoDAO extends MyBatisBaseDao<Articleinfo, Integer> {
    List<Articleinfo> findAll();
}
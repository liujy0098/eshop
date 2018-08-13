package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Orderinfo;

import java.util.List;

/**
 * OrderinfoDAO继承基类
 */
public interface OrderinfoDAO extends MyBatisBaseDao<Orderinfo, Integer> {
    List<Orderinfo> findAll();
}
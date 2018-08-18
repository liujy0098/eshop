package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.OrderinfoGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * OrderinfoGoodsDAO继承基类
 */
public interface OrderinfoGoodsDAO extends MyBatisBaseDao<OrderinfoGoods, OrderinfoGoods> {
    List<OrderinfoGoods> findByOrderId(@Param("orderSn") long orderSn);
}
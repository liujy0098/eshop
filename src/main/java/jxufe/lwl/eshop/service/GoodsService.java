package jxufe.lwl.eshop.service;

import jxufe.lwl.eshop.entity.Goodsinfo;

import java.util.List;

/**
 * Created by Administrator on 2018/8/14.
 */
public interface GoodsService {
    List<Goodsinfo> findAll();

    int insertSelective(Goodsinfo goods);

    int deleteByPrimaryKey(Integer id);
}

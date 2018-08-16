package jxufe.lwl.eshop.service.impl;

import jxufe.lwl.eshop.dao.GoodsinfoDAO;
import jxufe.lwl.eshop.entity.Goodsinfo;
import jxufe.lwl.eshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/8/14.
 */
@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsinfoDAO goodsinfoDAO;


    @Override
    public List<Goodsinfo> findAll() {
        return goodsinfoDAO.findAll();
    }

    @Override
    public int insertSelective(Goodsinfo goods) {
        return goodsinfoDAO.insertSelective(goods);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return goodsinfoDAO.deleteByPrimaryKey(id);
    }

}

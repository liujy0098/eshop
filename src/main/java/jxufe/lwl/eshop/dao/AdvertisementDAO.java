package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Advertisment;

import java.util.List;

/**
 * AdvertisementDAO继承基类
 */
public interface AdvertisementDAO extends MyBatisBaseDao<Advertisment, Integer> {
    Advertisment findById(int id);
    List<Advertisment> findAll();
    int savaAdById(Advertisment ad);
    int deleteByPrimaryKey(Integer id);
}
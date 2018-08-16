package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Advertisment;

import java.util.List;

/**
 * AdvertisementDAO继承基类
 */
public interface AdvertisementDAO extends MyBatisBaseDao<Advertisment, Integer> {
    List<Advertisment> findAll();
}
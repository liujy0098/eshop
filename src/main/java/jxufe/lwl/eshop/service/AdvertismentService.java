package jxufe.lwl.eshop.service;

import jxufe.lwl.eshop.entity.Advertisment;

import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */
public interface AdvertismentService {
    Advertisment findById(int id);

    List<Advertisment> findAll();

    int savaAdById(Advertisment ad);

    int deleteByPrimaryKey(Integer advId);
}

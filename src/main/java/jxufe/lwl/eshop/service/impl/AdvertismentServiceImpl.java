package jxufe.lwl.eshop.service.impl;

import jxufe.lwl.eshop.dao.AdvertisementDAO;
import jxufe.lwl.eshop.entity.Advertisment;
import jxufe.lwl.eshop.service.AdvertismentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;


/**
 * Created by Administrator on 2018/8/9.
 */
@Service
public class AdvertismentServiceImpl implements AdvertismentService{
    @Autowired
    private AdvertisementDAO advertisementDAO;

    @Override
    public Advertisment findById(int id) {
        return advertisementDAO.findById(id);
    }

    @Override
    public List<Advertisment> findAll(){
        return advertisementDAO.findAll();
    }

    @Override
    public int savaAdById(Advertisment ad) {
        return advertisementDAO.savaAdById(ad);
    }

    @Override
    public int deleteByPrimaryKey(Integer advId) {
        return advertisementDAO.deleteByPrimaryKey(advId);
    }
}

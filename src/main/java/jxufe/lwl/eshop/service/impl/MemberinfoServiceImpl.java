package jxufe.lwl.eshop.service.impl;

import jxufe.lwl.eshop.dao.MemberinfoDAO;
import jxufe.lwl.eshop.entity.Memberinfo;
import jxufe.lwl.eshop.service.MemberinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/8/8 0008.
 */
@Service
public class MemberinfoServiceImpl implements MemberinfoService{

    @Autowired
    private MemberinfoDAO memberinfoDAO;

    @Override
    public List<Memberinfo> findAll() {
        return memberinfoDAO.findAll();
    }
}

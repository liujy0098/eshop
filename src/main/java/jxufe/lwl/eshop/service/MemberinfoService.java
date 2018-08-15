package jxufe.lwl.eshop.service;

import jxufe.lwl.eshop.entity.Memberinfo;

import java.util.List;

/**
 * Created by Administrator on 2018/8/8 0008.
 */
public interface MemberinfoService {
    List<Memberinfo> findAll();
    int saveMember(Memberinfo memberinfo);
    int deleteMember(int key);
    Memberinfo findByPK(int key);
    public int updateMember(Memberinfo memberinfo);
}

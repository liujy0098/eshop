package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Memberinfo;

import java.util.List;

/**
 * MemberinfoDAO继承基类
 */
public interface MemberinfoDAO extends MyBatisBaseDao<Memberinfo, Integer> {
    List<Memberinfo> findAll();
}
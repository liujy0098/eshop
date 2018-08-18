package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AdminDAO继承基类
 */
public interface AdminDAO extends MyBatisBaseDao<Admin, Integer> {
    Admin login(@Param("adminName") String adminName,@Param("adminPassword") String adminPassword);
    List<Admin> findAll();
}
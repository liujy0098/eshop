package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * AdminDAO继承基类
 */
public interface AdminDAO extends MyBatisBaseDao<Admin, Integer> {
    Admin login(@Param("adminLoginNum") int adminLoginNum,@Param("adminPassword") String adminPassword);
}
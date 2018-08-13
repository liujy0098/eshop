package jxufe.lwl.eshop.dao;

import jxufe.lwl.eshop.entity.GoodsComment;

import java.util.List;

/**
 * GoodsCommentDAO继承基类
 */
public interface GoodsCommentDAO extends MyBatisBaseDao<GoodsComment, Integer> {
    List<GoodsComment> findAll();
}
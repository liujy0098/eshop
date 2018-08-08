package jxufe.lwl.eshop.dao;

import java.util.List;
import jxufe.lwl.eshop.entity.GoodsComment;
import jxufe.lwl.eshop.entity.GoodsCommentExample;
import org.apache.ibatis.annotations.Param;

public interface GoodsCommentDAO {
    long countByExample(GoodsCommentExample example);

    int deleteByExample(GoodsCommentExample example);

    int deleteByPrimaryKey(Integer scommId);

    int insert(GoodsComment record);

    int insertSelective(GoodsComment record);

    List<GoodsComment> selectByExample(GoodsCommentExample example);

    GoodsComment selectByPrimaryKey(Integer scommId);

    int updateByExampleSelective(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    int updateByExample(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    int updateByPrimaryKeySelective(GoodsComment record);

    int updateByPrimaryKey(GoodsComment record);
}
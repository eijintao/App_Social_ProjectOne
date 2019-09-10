package com.xm.app.mapper;

import com.xm.app.entity.Pay_goods;
import com.xm.app.entity.Pay_goodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Pay_goodsMapper {
    int countByExample(Pay_goodsExample example);

    int deleteByExample(Pay_goodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pay_goods record);

    int insertSelective(Pay_goods record);

    List<Pay_goods> selectByExample(Pay_goodsExample example);

    Pay_goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pay_goods record, @Param("example") Pay_goodsExample example);

    int updateByExample(@Param("record") Pay_goods record, @Param("example") Pay_goodsExample example);

    int updateByPrimaryKeySelective(Pay_goods record);

    int updateByPrimaryKey(Pay_goods record);
}
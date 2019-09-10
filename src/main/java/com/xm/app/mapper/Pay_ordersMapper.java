package com.xm.app.mapper;

import com.xm.app.entity.Pay_orders;
import com.xm.app.entity.Pay_ordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Pay_ordersMapper {
    int countByExample(Pay_ordersExample example);

    int deleteByExample(Pay_ordersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pay_orders record);

    int insertSelective(Pay_orders record);

    List<Pay_orders> selectByExample(Pay_ordersExample example);

    Pay_orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pay_orders record, @Param("example") Pay_ordersExample example);

    int updateByExample(@Param("record") Pay_orders record, @Param("example") Pay_ordersExample example);

    int updateByPrimaryKeySelective(Pay_orders record);

    int updateByPrimaryKey(Pay_orders record);
}
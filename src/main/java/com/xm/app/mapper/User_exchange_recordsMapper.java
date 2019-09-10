package com.xm.app.mapper;

import com.xm.app.entity.User_exchange_records;
import com.xm.app.entity.User_exchange_recordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_exchange_recordsMapper {
    int countByExample(User_exchange_recordsExample example);

    int deleteByExample(User_exchange_recordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_exchange_records record);

    int insertSelective(User_exchange_records record);

    List<User_exchange_records> selectByExample(User_exchange_recordsExample example);

    User_exchange_records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_exchange_records record, @Param("example") User_exchange_recordsExample example);

    int updateByExample(@Param("record") User_exchange_records record, @Param("example") User_exchange_recordsExample example);

    int updateByPrimaryKeySelective(User_exchange_records record);

    int updateByPrimaryKey(User_exchange_records record);
}
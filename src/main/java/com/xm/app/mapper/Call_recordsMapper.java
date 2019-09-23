package com.xm.app.mapper;

import com.xm.app.entity.Call_records;
import com.xm.app.entity.Call_recordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Call_recordsMapper {
    int countByExample(Call_recordsExample example);

    int deleteByExample(Call_recordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Call_records record);

    int insertSelective(Call_records record);

    List<Call_records> selectByExample(Call_recordsExample example);

    Call_records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Call_records record, @Param("example") Call_recordsExample example);

    int updateByExample(@Param("record") Call_records record, @Param("example") Call_recordsExample example);

    int updateByPrimaryKeySelective(Call_records record);

    int updateByPrimaryKey(Call_records record);

    List<Call_records> getAllCallRecords();
}
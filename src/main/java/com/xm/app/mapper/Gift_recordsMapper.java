package com.xm.app.mapper;

import com.xm.app.entity.Gift_records;
import com.xm.app.entity.Gift_recordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Gift_recordsMapper {
    int countByExample(Gift_recordsExample example);

    int deleteByExample(Gift_recordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gift_records record);

    int insertSelective(Gift_records record);

    List<Gift_records> selectByExample(Gift_recordsExample example);

    Gift_records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gift_records record, @Param("example") Gift_recordsExample example);

    int updateByExample(@Param("record") Gift_records record, @Param("example") Gift_recordsExample example);

    int updateByPrimaryKeySelective(Gift_records record);

    int updateByPrimaryKey(Gift_records record);

    List<Gift_records> getAllGiftRecords();
}
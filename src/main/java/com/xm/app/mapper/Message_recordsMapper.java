package com.xm.app.mapper;

import com.xm.app.entity.Message_records;
import com.xm.app.entity.Message_recordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Message_recordsMapper {
    int countByExample(Message_recordsExample example);

    int deleteByExample(Message_recordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Message_records record);

    int insertSelective(Message_records record);

    List<Message_records> selectByExample(Message_recordsExample example);

    Message_records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Message_records record, @Param("example") Message_recordsExample example);

    int updateByExample(@Param("record") Message_records record, @Param("example") Message_recordsExample example);

    int updateByPrimaryKeySelective(Message_records record);

    int updateByPrimaryKey(Message_records record);

    List<Message_records> getAllMessageRecords();
}
package com.xm.app.mapper;

import com.xm.app.entity.Call_evaluation_records;
import com.xm.app.entity.Call_evaluation_recordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Call_evaluation_recordsMapper {
    int countByExample(Call_evaluation_recordsExample example);

    int deleteByExample(Call_evaluation_recordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Call_evaluation_records record);

    int insertSelective(Call_evaluation_records record);

    List<Call_evaluation_records> selectByExample(Call_evaluation_recordsExample example);

    Call_evaluation_records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Call_evaluation_records record, @Param("example") Call_evaluation_recordsExample example);

    int updateByExample(@Param("record") Call_evaluation_records record, @Param("example") Call_evaluation_recordsExample example);

    int updateByPrimaryKeySelective(Call_evaluation_records record);

    int updateByPrimaryKey(Call_evaluation_records record);


    List<Call_evaluation_records> getAllCallEvaluationRecords();
}
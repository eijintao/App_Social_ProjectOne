package com.xm.app.mapper;

import com.xm.app.entity.User_expenditure_records;
import com.xm.app.entity.User_expenditure_recordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_expenditure_recordsMapper {
    int countByExample(User_expenditure_recordsExample example);

    int deleteByExample(User_expenditure_recordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_expenditure_records record);

    int insertSelective(User_expenditure_records record);

    List<User_expenditure_records> selectByExample(User_expenditure_recordsExample example);

    User_expenditure_records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_expenditure_records record, @Param("example") User_expenditure_recordsExample example);

    int updateByExample(@Param("record") User_expenditure_records record, @Param("example") User_expenditure_recordsExample example);

    int updateByPrimaryKeySelective(User_expenditure_records record);

    int updateByPrimaryKey(User_expenditure_records record);
}
package com.xm.app.mapper;

import com.xm.app.entity.User_visitors;
import com.xm.app.entity.User_visitorsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User_visitorsMapper {
    int countByExample(User_visitorsExample example);

    int deleteByExample(User_visitorsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_visitors record);

    int insertSelective(User_visitors record);

    List<User_visitors> selectByExample(User_visitorsExample example);

    User_visitors selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_visitors record, @Param("example") User_visitorsExample example);

    int updateByExample(@Param("record") User_visitors record, @Param("example") User_visitorsExample example);

    int updateByPrimaryKeySelective(User_visitors record);

    int updateByPrimaryKey(User_visitors record);

     List<User_visitors> getAllUserVisitors();
}
package com.xm.app.mapper;

import com.xm.app.entity.Uslogin;
import com.xm.app.entity.UsloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsloginMapper {
    int countByExample(UsloginExample example);

    int deleteByExample(UsloginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Uslogin record);

    int insertSelective(Uslogin record);

    List<Uslogin> selectByExample(UsloginExample example);

    Uslogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Uslogin record, @Param("example") UsloginExample example);

    int updateByExample(@Param("record") Uslogin record, @Param("example") UsloginExample example);

    int updateByPrimaryKeySelective(Uslogin record);

    int updateByPrimaryKey(Uslogin record);
}
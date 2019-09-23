package com.xm.app.mapper;

import com.xm.app.entity.User_blacklist;
import com.xm.app.entity.User_blacklistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User_blacklistMapper {
    int countByExample(User_blacklistExample example);

    int deleteByExample(User_blacklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_blacklist record);

    int insertSelective(User_blacklist record);

    List<User_blacklist> selectByExample(User_blacklistExample example);

    User_blacklist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_blacklist record, @Param("example") User_blacklistExample example);

    int updateByExample(@Param("record") User_blacklist record, @Param("example") User_blacklistExample example);

    int updateByPrimaryKeySelective(User_blacklist record);

    int updateByPrimaryKey(User_blacklist record);


    List<User_blacklist> getAllUserBlacklist();
}
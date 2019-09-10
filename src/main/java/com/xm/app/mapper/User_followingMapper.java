package com.xm.app.mapper;

import com.xm.app.entity.User_following;
import com.xm.app.entity.User_followingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_followingMapper {
    int countByExample(User_followingExample example);

    int deleteByExample(User_followingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_following record);

    int insertSelective(User_following record);

    List<User_following> selectByExample(User_followingExample example);

    User_following selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_following record, @Param("example") User_followingExample example);

    int updateByExample(@Param("record") User_following record, @Param("example") User_followingExample example);

    int updateByPrimaryKeySelective(User_following record);

    int updateByPrimaryKey(User_following record);
}
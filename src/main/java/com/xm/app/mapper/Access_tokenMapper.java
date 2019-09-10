package com.xm.app.mapper;

import com.xm.app.entity.Access_token;
import com.xm.app.entity.Access_tokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Access_tokenMapper {
    int countByExample(Access_tokenExample example);

    int deleteByExample(Access_tokenExample example);

    int insert(Access_token record);

    int insertSelective(Access_token record);

    List<Access_token> selectByExample(Access_tokenExample example);

    int updateByExampleSelective(@Param("record") Access_token record, @Param("example") Access_tokenExample example);

    int updateByExample(@Param("record") Access_token record, @Param("example") Access_tokenExample example);
}
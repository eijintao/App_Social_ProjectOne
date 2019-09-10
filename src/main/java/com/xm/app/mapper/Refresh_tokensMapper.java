package com.xm.app.mapper;

import com.xm.app.entity.Refresh_tokens;
import com.xm.app.entity.Refresh_tokensExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Refresh_tokensMapper {
    int countByExample(Refresh_tokensExample example);

    int deleteByExample(Refresh_tokensExample example);

    int deleteByPrimaryKey(String id);

    int insert(Refresh_tokens record);

    int insertSelective(Refresh_tokens record);

    List<Refresh_tokens> selectByExample(Refresh_tokensExample example);

    Refresh_tokens selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Refresh_tokens record, @Param("example") Refresh_tokensExample example);

    int updateByExample(@Param("record") Refresh_tokens record, @Param("example") Refresh_tokensExample example);

    int updateByPrimaryKeySelective(Refresh_tokens record);

    int updateByPrimaryKey(Refresh_tokens record);
}
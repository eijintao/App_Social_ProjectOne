package com.xm.app.mapper;

import com.xm.app.entity.Im_rongcloud;
import com.xm.app.entity.Im_rongcloudExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Im_rongcloudMapper {
    int countByExample(Im_rongcloudExample example);

    int deleteByExample(Im_rongcloudExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Im_rongcloud record);

    int insertSelective(Im_rongcloud record);

    List<Im_rongcloud> selectByExample(Im_rongcloudExample example);

    Im_rongcloud selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Im_rongcloud record, @Param("example") Im_rongcloudExample example);

    int updateByExample(@Param("record") Im_rongcloud record, @Param("example") Im_rongcloudExample example);

    int updateByPrimaryKeySelective(Im_rongcloud record);

    int updateByPrimaryKey(Im_rongcloud record);
}
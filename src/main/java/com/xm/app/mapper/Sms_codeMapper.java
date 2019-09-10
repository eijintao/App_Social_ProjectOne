package com.xm.app.mapper;

import com.xm.app.entity.Sms_code;
import com.xm.app.entity.Sms_codeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sms_codeMapper {
    int countByExample(Sms_codeExample example);

    int deleteByExample(Sms_codeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sms_code record);

    int insertSelective(Sms_code record);

    List<Sms_code> selectByExample(Sms_codeExample example);

    Sms_code selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sms_code record, @Param("example") Sms_codeExample example);

    int updateByExample(@Param("record") Sms_code record, @Param("example") Sms_codeExample example);

    int updateByPrimaryKeySelective(Sms_code record);

    int updateByPrimaryKey(Sms_code record);
}
package com.xm.app.mapper;

import com.xm.app.entity.Sms_code;
import com.xm.app.entity.Sms_codeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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


    /**
     * 判断数据库是否存在用户名为userName的记录
     * @param mobile 用户名
     * @return 用户名为userName的记录行数
     */
    String checkUserName(String mobile);

    /**
     * 根据用户名和密码获取用户信息
     * @param sms_code 用户model
     * @return 用户model
     */
    Sms_code selectByUserNameAndPassword(Sms_code sms_code);


    List<Sms_code> getAllSmsCode();

}
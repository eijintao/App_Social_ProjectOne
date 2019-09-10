package com.xm.app.service;

import com.xm.app.entity.Sms_code;
import com.xm.app.mapper.Sms_codeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/6 17:06
 * 业务验证码的实现层
 */
@Service
public class Sms_codeServiceImpl  implements Sms_codeService{

    /**
     * 业务验证码mapper层的注解
     */
    @Autowired
    private Sms_codeMapper sms_codeMapper;

    /**
     * 新增一个单条的  包括 moblie手机号 和 code验证码
     * @param record
     * @return
     */
    @Override
    public int insertSelective(Sms_code record) {
      int i=  sms_codeMapper.insert(record);


        return i;
    }

    /**
     * 查询单条，返回一行。包括moblie  和  code
     * @param id
     * @return
     */
    @Override
    public Sms_code selectByPrimaryKey(Integer id) {
      Sms_code sms_code=  sms_codeMapper.selectByPrimaryKey(id);

        return sms_code;
    }
}

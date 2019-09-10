package com.xm.app.service;

import com.xm.app.entity.Sms_code;

/**
 * @author Mei Jintao
 * @date 2019/9/6 17:06
 * 短信验证码的业务接口
 */

public interface Sms_codeService  {
    /**
     * 新增一个 短信验证码表的一行
     * @param record
     * @return
     */
    int insertSelective(Sms_code record);

    /**
     *  主要是查询  短信验证表的id
     * @param id
     * @return
     */
    Sms_code selectByPrimaryKey(Integer id);

}

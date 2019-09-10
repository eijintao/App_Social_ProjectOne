package com.xm.app.service;

import com.xm.app.entity.Access_token;
import com.xm.app.mapper.Access_tokenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/7 17:03
 * 用户凭证表的 业务实现
 */
@Service
public class Access_tokensServiceImpl  implements Access_tokensService{

    /**
     * 对mapper层进行注解
     */
    @Autowired
    private Access_tokenMapper access_tokenMapper;

    /**
     *  对 用户凭证表里面进行增加
     * @param record
     * @return
     */
    @Override
    public int insertSelective(Access_token record) {


        return access_tokenMapper.insertSelective(record);
    }
}

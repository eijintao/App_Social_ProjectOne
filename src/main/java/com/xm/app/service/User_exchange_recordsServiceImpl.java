package com.xm.app.service;

import com.xm.app.entity.User_exchange_records;
import com.xm.app.mapper.User_exchange_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/16 13:35
 */
@Service
public class User_exchange_recordsServiceImpl implements User_exchange_recordsService {

    @Autowired
    private User_exchange_recordsMapper user_exchange_recordsMapper;

    /**
     * 查询用户兑换表
     * @param id
     * @return
     */
    @Override
    public User_exchange_records selectByPrimaryKey(Integer id) {
        return user_exchange_recordsMapper.selectByPrimaryKey(id);
    }
}

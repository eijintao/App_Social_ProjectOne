package com.xm.app.service;

import com.xm.app.entity.User_exchange_records;

/**
 * @author Mei Jintao
 * @date 2019/9/16 13:35
 */
public interface User_exchange_recordsService {
    /**
     * 查询用户兑换表
     * @param id
     * @return
     */
    User_exchange_records selectByPrimaryKey(Integer id);
}

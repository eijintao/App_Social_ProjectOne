package com.xm.app.service;

import com.xm.app.entity.User_blacklist;

/**
 * @author Mei Jintao
 * @date 2019/9/16 15:28
 */
public interface User_blacklistService {

    /**
     * 查询用户黑名单表
     * @param id
     * @return
     */
    User_blacklist selectByPrimaryKey(Integer id);
}

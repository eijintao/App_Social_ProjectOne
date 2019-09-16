package com.xm.app.service;

import com.xm.app.entity.User_visitors;

/**
 * @author Mei Jintao
 * @date 2019/9/16 10:00
 */
public interface User_visitorsService {
    /**
     * 查询用户访客表
     * @param id
     * @return
     */
    User_visitors selectByPrimaryKey(Integer id);
}

package com.xm.app.service;

import com.github.pagehelper.PageInfo;
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

    /**
     * 查询用户访客的分页
     * @param page  页码
     * @param rows  页大小
     * @return
     */
    PageInfo<User_visitors> getAllUserVisitorsByPage(Integer page,Integer rows);
}

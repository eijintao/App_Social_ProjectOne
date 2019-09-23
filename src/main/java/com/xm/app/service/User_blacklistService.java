package com.xm.app.service;

import com.github.pagehelper.PageInfo;
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

    /**
     * 通过id 删除黑名单
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 通过id增加黑名单
     * @param record
     * @return
     */
    int insert(User_blacklist record);



    /**
     * 查询全部用户的黑名单
     * @param page 接收页码
     * @param rows 接收页大小
     * @return
     */
    PageInfo<User_blacklist> getAllUserBlacklistByPage(Integer page, Integer rows);

}

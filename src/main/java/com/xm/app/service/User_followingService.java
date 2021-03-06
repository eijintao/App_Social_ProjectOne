package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_following;

/**
 * @author Mei Jintao
 * @date 2019/9/16 14:45
 */
public interface User_followingService {
    /**
     * 查询用户关注表
     * @param id
     * @return
     */
    User_following selectByPrimaryKey(Integer id);


    /**
     * 查询用户关注的分页
     * @param page  页码
     * @param rows  页大小
     * @return
     */
    PageInfo<User_following> getAllUserFollowingByPage(Integer page, Integer rows);
}

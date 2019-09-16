package com.xm.app.service;

import com.xm.app.entity.Users;

/**
 * @author Mei Jintao
 * @date 2019/9/7 14:25
 * 用户接口
 */
public interface UserService {

    /**
     * 增加一行
     * @param record
     * @return
     */
    int insert(Users record);

    /**
     * 修改一行
     * @param record
     * @return
     */
    int updateByPrimaryKey(Users record);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    Users selectByPrimaryKey(Integer id);







}

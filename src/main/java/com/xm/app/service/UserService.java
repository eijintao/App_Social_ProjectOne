package com.xm.app.service;

import com.xm.app.entity.Users;

/**
 * @author Mei Jintao
 * @date 2019/9/7 14:25
 * 用户接口
 */
public interface UserService {

    /**
     * 检查用户是否存在
     * @param mobile
     * @return
     */
     int checkUsername(String mobile);

    /**实现用户登录*/



    /**
     * 生成一个token
     * @param moblie
     * @return
     */
    String createToken(String moblie);

    /**
     *检查用户是否存在
     * @param userId
     * @return
     */
    Users findByUsername(Integer userId);

    /**
     * 检查用户是否登录
     * @param userId
     * @return
     */
    Users findUserById(String userId);

  /*  *//**
     *
     * @param userLogin
     * @return
     *//*
    public String login(Users userLogin);*/
}

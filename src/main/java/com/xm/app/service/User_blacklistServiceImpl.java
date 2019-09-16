package com.xm.app.service;

import com.xm.app.entity.User_blacklist;
import com.xm.app.mapper.User_blacklistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/16 15:29
 */
@Service
public class User_blacklistServiceImpl implements  User_blacklistService {

    @Autowired
    private User_blacklistMapper user_blacklistMapper;

    /**
     * 查询用户黑名单表
     * @param id
     * @return
     */
    @Override
    public User_blacklist selectByPrimaryKey(Integer id) {
        return user_blacklistMapper.selectByPrimaryKey(id);
    }
}

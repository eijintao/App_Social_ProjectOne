package com.xm.app.service;

import com.xm.app.entity.User_following;
import com.xm.app.mapper.User_followingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/16 14:46
 */
@Service
public class User_followingServiceImpl implements User_followingService {


    @Autowired
    private User_followingMapper user_followingMapper;

    /**
     * 查询用户关注表
     * @param id
     * @return
     */
    @Override
    public User_following selectByPrimaryKey(Integer id) {
        return user_followingMapper.selectByPrimaryKey(id);
    }
}

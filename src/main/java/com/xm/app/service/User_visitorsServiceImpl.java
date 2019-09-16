package com.xm.app.service;

import com.xm.app.entity.User_visitors;
import com.xm.app.mapper.User_visitorsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/16 10:01
 */
@Service
public class User_visitorsServiceImpl implements User_visitorsService {

    @Autowired
    private User_visitorsMapper user_visitorsMapper;

    /**
     * 查询用户访客表
     * @param id
     * @return
     */
    @Override
    public User_visitors selectByPrimaryKey(Integer id) {
        return user_visitorsMapper.selectByPrimaryKey(id);
    }
}

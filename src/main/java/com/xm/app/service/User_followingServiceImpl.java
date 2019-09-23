package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_following;
import com.xm.app.mapper.User_followingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 查询用户关注的分页
     * @param page  页码
     * @param rows  页大小
     * @return
     */
    @Override
    public PageInfo<User_following> getAllUserFollowingByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        List<User_following> list=user_followingMapper.getAllUserFollowing();
        PageInfo<User_following> pageInfo=new PageInfo<User_following>(list);

        return pageInfo;
    }
}

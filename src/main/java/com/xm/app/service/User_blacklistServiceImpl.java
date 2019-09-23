package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_blacklist;
import com.xm.app.mapper.User_blacklistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    /**
     * 通过id 删除黑名单
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {

        return user_blacklistMapper.deleteByPrimaryKey(id);
    }


    /**
     * 通过id增加黑名单
     * @param record
     * @return
     */
    @Override
    public int insert(User_blacklist record) {
        return user_blacklistMapper.insert(record);
    }

    /**
     * 查询全部用户的黑名单
     * @param page 接收页码
     * @param rows 接收页大小
     * @return
     */
    @Override
    public PageInfo<User_blacklist> getAllUserBlacklistByPage(Integer page, Integer rows) {
        //分页 启动分页并放入相应参数
        PageHelper.startPage(page,rows);
        List<User_blacklist> list=user_blacklistMapper.getAllUserBlacklist();
        PageInfo<User_blacklist> pageInfo=new PageInfo<User_blacklist>(list);
        return pageInfo;
    }
}

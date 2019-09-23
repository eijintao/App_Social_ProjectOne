package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_visitors;
import com.xm.app.mapper.User_visitorsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 查询用户访客的分页
     * @param page 页码
     * @param rows 页大小
     * @return
     */
    @Override
    public PageInfo<User_visitors> getAllUserVisitorsByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        List<User_visitors> list=user_visitorsMapper.getAllUserVisitors();
        PageInfo<User_visitors> pageInfo=new PageInfo<User_visitors>(list);

        return pageInfo;


    }
}

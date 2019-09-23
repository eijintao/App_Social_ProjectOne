package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_exchange_records;
import com.xm.app.mapper.User_exchange_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/16 13:35
 */
@Service
public class User_exchange_recordsServiceImpl implements User_exchange_recordsService {

    @Autowired
    private User_exchange_recordsMapper user_exchange_recordsMapper;

    /**
     * 查询用户兑换表
     * @param id
     * @return
     */
    @Override
    public User_exchange_records selectByPrimaryKey(Integer id) {
        return user_exchange_recordsMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询全部用户兑换表
     * @param page 接收页码
     * @param rows  接收页大小
     * @return
     */
    @Override
    public PageInfo<User_exchange_records> getAllUserExchangeRecordsByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        List<User_exchange_records> list=user_exchange_recordsMapper.getAllUserExchangeRecords();
        PageInfo<User_exchange_records> pageInfo=new PageInfo<User_exchange_records>(list);
        return pageInfo;
    }
}

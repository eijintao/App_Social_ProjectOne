package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_expenditure_records;
import com.xm.app.mapper.User_expenditure_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/16 11:03
 */

@Service
public class User_expenditure_recordsServiceImpl implements User_expenditure_recordsService {

    @Autowired
    private User_expenditure_recordsMapper user_expenditure_recordsMapper;
    /**
     * 查询用户支出记录表。
     * @param id
     * @return
     */
    @Override
    public User_expenditure_records selectByPrimaryKey(Integer id) {
        return user_expenditure_recordsMapper.selectByPrimaryKey(id);
    }
    /**
     * 查询全部用户支出记录表
     * @param page
     * @param rows
     * @return
     */
    @Override
    public PageInfo<User_expenditure_records> getAllUserExpenditureRecordsByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        //调用mapper层的查询全部的方法
        List<User_expenditure_records> list=user_expenditure_recordsMapper.getAllUserExpenditureRecords();
        //将得到的 查询全部的数据放到 分页的依赖中去 里面去。
        PageInfo<User_expenditure_records> pageInfo=new PageInfo<User_expenditure_records>(list);
        //返回分页的数据
        return pageInfo;
    }
}

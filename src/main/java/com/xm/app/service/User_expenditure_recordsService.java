package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_expenditure_records;

/**
 * @author Mei Jintao
 * @date 2019/9/16 11:03
 */
public interface User_expenditure_recordsService {
    /**
     * 查询用户支出记录表。
     * @param id
     * @return
     */
    User_expenditure_records selectByPrimaryKey(Integer id);


    /**
     * 查询全部用户支出记录表
     * @param page 接收页码
     * @param rows 接收页大小
     * @return
     */
    PageInfo<User_expenditure_records> getAllUserExpenditureRecordsByPage(Integer page, Integer rows);
}

package com.xm.app.service;

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
}

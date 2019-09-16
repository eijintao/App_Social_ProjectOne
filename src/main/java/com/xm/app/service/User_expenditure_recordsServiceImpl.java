package com.xm.app.service;

import com.xm.app.entity.User_expenditure_records;
import com.xm.app.mapper.User_expenditure_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

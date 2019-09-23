package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Message_records;

/**
 * @author Mei Jintao
 * @date 2019/9/16 11:41
 */
public interface Message_recordsService {
    /**
     * 单条查询消息记录
     * @param id
     * @return
     */
    Message_records selectByPrimaryKey(Integer id);


    /**
     * 查询全部消息记录 并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    PageInfo<Message_records> getAllMessageRecordsByPage(Integer page, Integer rows);

}

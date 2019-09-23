package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Gift_records;

/**
 * @author Mei Jintao
 * @date 2019/9/16 19:06
 */
public interface Gift_recordsService {
    /**
     * 通过id 查询礼物表
     * @param id
     * @return
     */
    Gift_records selectByPrimaryKey(Integer id);

    /**
     * 新增礼物表
     * @param record
     * @return
     */
    int insert(Gift_records record);


    /**
     * 查询全部礼物记录，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    PageInfo<Gift_records> getAllGiftRecordsByPage(Integer page, Integer rows);

}

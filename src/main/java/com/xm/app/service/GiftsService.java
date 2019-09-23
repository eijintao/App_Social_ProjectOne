package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Gifts;

/**
 * @author Mei Jintao
 * @date 2019/9/17 9:24
 */
public interface GiftsService {
    /**
     * 查询礼物表
     * @param id
     * @return
     */
    Gifts selectByPrimaryKey(Integer id);


    /**
     * 查询全部礼物，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    PageInfo<Gifts> getAllGiftsByPage(Integer page, Integer rows);


}

package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Videos;

/**
 * @author Mei Jintao
 * @date 2019/9/18 12:05
 */
public interface VideoService {

    /**
     * 查询全部的视频，并进行分页
     * @param page  页码
     * @param rows  页大小
     * @return
     */
    PageInfo<Videos> getAllVideosByPage(Integer page, Integer rows);
}

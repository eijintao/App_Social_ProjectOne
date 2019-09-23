package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Video_likes;

/**
 * @author Mei Jintao
 * @date 2019/9/18 14:18
 */
public interface VideoLikesService {

    /**
     * 查询全部视频点赞，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    PageInfo<Video_likes> getAllVideoLikesByPage(Integer page, Integer rows);

    /**
     * 删除点赞
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增用户点赞
     * @param record
     * @return
     */
    int insertSelective(Video_likes record);
}

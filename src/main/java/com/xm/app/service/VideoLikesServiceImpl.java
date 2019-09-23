package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Video_likes;
import com.xm.app.mapper.Video_likesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/18 14:20
 */
@Service
public class VideoLikesServiceImpl implements VideoLikesService {
    @Autowired
    private Video_likesMapper videoLikesMapper;

    /**
     * 查询全部视频点赞，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    @Override
    public PageInfo<Video_likes> getAllVideoLikesByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        List<Video_likes> list=videoLikesMapper.getAllVideoLikes();
        PageInfo<Video_likes> pageInfo=new PageInfo<Video_likes>(list);
        return pageInfo;
    }

    /**
     * 删除点赞
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return videoLikesMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增点赞
     * @param record
     * @return
     */
    @Override
    public int insertSelective(Video_likes record) {
        return videoLikesMapper.insertSelective(record);
    }
}

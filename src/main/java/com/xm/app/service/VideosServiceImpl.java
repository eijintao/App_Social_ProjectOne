package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Videos;
import com.xm.app.mapper.VideosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/18 12:06
 */
@Service
public class VideosServiceImpl implements VideoService {
    @Autowired
    private VideosMapper videosMapper;

    /**
     * 查询全部的视频，并进行分页
     * @param page  页码
     * @param rows  页大小
     * @return
     */
    @Override
    public PageInfo<Videos> getAllVideosByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        List<Videos> list=videosMapper.getAllVideos();
        PageInfo<Videos> pageInfo=new PageInfo<Videos>(list);
        return pageInfo;
    }
}

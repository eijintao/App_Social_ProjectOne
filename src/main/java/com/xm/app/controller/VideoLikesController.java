package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Video_likes;
import com.xm.app.service.VideoLikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/18 14:24
 */
@Controller
@RequestMapping("/page/")
public class VideoLikesController {
    @Autowired
    private VideoLikesService videoLikesService;

    /**
     * 查询全部视频点赞，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    @RequestMapping("getVideoLikesAll")
    @ResponseBody
    public Map<String , Object> getVideoLikesAll(Integer page, Integer rows) throws Exception{
        PageInfo<Video_likes> pageInfo=videoLikesService.getAllVideoLikesByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

    /**
     * 删除单个
     * @param id
     * @return
     */
    @RequestMapping ("deleteVideoLikeById")
    @ResponseBody
    public int deleteVideoLike(Integer id){
        return videoLikesService.deleteByPrimaryKey(id);
    }

    /**
     * 新增单个
     * @param records
     * @return
     */
    @RequestMapping("insertVideoLike")
    @ResponseBody
    public int insertVideoLike(Video_likes records){
        return videoLikesService.insertSelective(records);
    }




}

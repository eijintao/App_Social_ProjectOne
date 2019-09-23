package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Videos;
import com.xm.app.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/18 12:08
 */
@Controller
@RequestMapping("/page/")
public class VideosController {

    @Autowired
    private VideoService videoService;

    /**
     * 查询用户所有礼物记录表，并进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getVideosAll")
    @ResponseBody
    public Map<String , Object> getVideosAll(Integer page, Integer rows) throws Exception{
        PageInfo<Videos> pageInfo=videoService.getAllVideosByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

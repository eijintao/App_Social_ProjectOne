package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Gifts;
import com.xm.app.service.GiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/17 9:30
 */
@Controller
@RequestMapping("/page/")
public class GiftsController {

    @Autowired
    private GiftsService giftsService;

    /**
     * 通过id 查询礼物表
     * @param id
     * @return
     */
    @RequestMapping("selectByGiftsId")
    @ResponseBody
    public Gifts selectByGiftsId(Integer id){
        return giftsService.selectByPrimaryKey(id);
    }


    /**
     * 查询用户所有礼物，并进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getGiftsAll")
    @ResponseBody
    public Map<String , Object> getGiftsAll(Integer page, Integer rows) throws Exception{
        PageInfo<Gifts> pageInfo=giftsService.getAllGiftsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

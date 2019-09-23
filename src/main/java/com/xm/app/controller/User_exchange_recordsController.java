package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_exchange_records;
import com.xm.app.service.User_exchange_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/16 14:11
 */
@Controller
@RequestMapping("/page/")
public class User_exchange_recordsController {

    @Autowired
    private User_exchange_recordsService user_exchange_recordsService;

    /**
     * 查询单条用户兑换
     * @param id
     * @return
     */
    @RequestMapping("selectByExchangeRecordsId")
    @ResponseBody
    public User_exchange_records selectByExchangeRecords(Integer id){
        return user_exchange_recordsService.selectByPrimaryKey(id);
    }


    /**
     * 查询用户所有兑换记录  并对其进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getUserExchangeRecordsAll")
    @ResponseBody
    public Map<String , Object> getUserExchangeRecordsAll(Integer page, Integer rows) throws Exception{
        PageInfo<User_exchange_records> pageInfo=user_exchange_recordsService.getAllUserExchangeRecordsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

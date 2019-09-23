package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Call_records;
import com.xm.app.service.Call_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/18 10:13
 */
@Controller
@RequestMapping("/page/")
public class Call_recordsController {
    @Autowired
    private Call_recordsService call_recordsService;


    /**
     * 查询用户所有通话记录表  并对其进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getCallRecordsAll")
    @ResponseBody
    public Map<String , Object> getCallRecordsAll(Integer page, Integer rows) throws Exception{
        PageInfo<Call_records> pageInfo=call_recordsService.getAllCallRecordsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;
    }



}

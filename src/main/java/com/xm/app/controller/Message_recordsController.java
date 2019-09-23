package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Message_records;
import com.xm.app.service.Message_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/16 11:48
 */
@Controller
@RequestMapping("/page/")
public class Message_recordsController {
    @Autowired
    Message_recordsService message_recordsService;

    @RequestMapping("messageRecordById")
    @ResponseBody
    public Message_records messageRecordById(Integer id){
        return message_recordsService.selectByPrimaryKey(id);
    }



    /**
     * 查询用户所有消息记录  并对其进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getMessageRecordsAll")
    @ResponseBody
    public Map<String , Object> getMessageRecordsAll(Integer page, Integer rows) throws Exception{
        PageInfo<Message_records> pageInfo=message_recordsService.getAllMessageRecordsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

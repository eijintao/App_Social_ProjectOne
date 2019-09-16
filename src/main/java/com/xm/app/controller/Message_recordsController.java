package com.xm.app.controller;

import com.xm.app.entity.Message_records;
import com.xm.app.service.Message_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}

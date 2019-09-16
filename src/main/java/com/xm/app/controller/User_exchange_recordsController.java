package com.xm.app.controller;

import com.xm.app.entity.User_exchange_records;
import com.xm.app.service.User_exchange_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mei Jintao
 * @date 2019/9/16 14:11
 */
@Controller
@RequestMapping("/page/")
public class User_exchange_recordsController {

    @Autowired
    private User_exchange_recordsService user_exchange_recordsService;

    @RequestMapping("selectByExchangeRecordsId")
    @ResponseBody
    public User_exchange_records selectByExchangeRecords(Integer id){
        return user_exchange_recordsService.selectByPrimaryKey(id);
    }

}

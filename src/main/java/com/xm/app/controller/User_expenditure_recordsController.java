package com.xm.app.controller;

import com.xm.app.entity.User_expenditure_records;
import com.xm.app.service.User_expenditure_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mei Jintao
 * @date 2019/9/16 11:14
 */
@Controller
@RequestMapping("/page/")
public class User_expenditure_recordsController {

    @Autowired
    private User_expenditure_recordsService user_expenditure_recordsService;


    /**
     * 查询用户兑换表
     * @param id
     * @return
     */
    @RequestMapping("selectByExpenditureId")
    @ResponseBody
    public User_expenditure_records selectByExpenditureId(Integer id){

        return user_expenditure_recordsService.selectByPrimaryKey(id);
    }

}

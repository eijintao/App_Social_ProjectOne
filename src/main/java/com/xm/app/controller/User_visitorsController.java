package com.xm.app.controller;

import com.xm.app.entity.User_visitors;
import com.xm.app.service.User_visitorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mei Jintao
 * @date 2019/9/16 10:07
 */
@Controller
@RequestMapping("/page/")
public class User_visitorsController {
    @Autowired
    private User_visitorsService user_visitorsService;


    @RequestMapping("selectByIdUserVisitor")
    @ResponseBody
    public User_visitors selectById(Integer id){
        return user_visitorsService.selectByPrimaryKey(id);
    }

}

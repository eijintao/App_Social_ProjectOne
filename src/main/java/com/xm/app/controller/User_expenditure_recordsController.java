package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_expenditure_records;
import com.xm.app.service.User_expenditure_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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
     * 查询用户支出记录单条
     * @param id
     * @return
     */
    @RequestMapping("selectByExpenditureId")
    @ResponseBody
    public User_expenditure_records selectByExpenditureId(Integer id){

        return user_expenditure_recordsService.selectByPrimaryKey(id);
    }

    /**
     * 查询用户所有支出记录  并对其进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getUserExpenditureRecordsAll")
    @ResponseBody
    public Map<String , Object> getUserExpenditureRecordsAll(Integer page, Integer rows) throws Exception{
        PageInfo<User_expenditure_records> pageInfo=user_expenditure_recordsService.getAllUserExpenditureRecordsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

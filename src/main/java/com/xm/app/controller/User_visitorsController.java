package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_visitors;
import com.xm.app.service.User_visitorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/16 10:07
 */
@Controller
@RequestMapping("/page/")
public class User_visitorsController {
    @Autowired
    private User_visitorsService user_visitorsService;

    /**
     * 查询单条的访客
     * @param id
     * @return
     */
    @RequestMapping("selectByIdUserVisitor")
    @ResponseBody
    public User_visitors selectById(Integer id){
        return user_visitorsService.selectByPrimaryKey(id);
    }
    /**
     * 查询用户访客的分页
     * @param page  表示接收页码
     * @param rows  表示接收页大小
     * @return
     */
    @RequestMapping("getUserVisitorsAll")
    @ResponseBody
    public Map<String , Object>  getUserVisitorsAll(Integer page,Integer rows) throws Exception{
        PageInfo<User_visitors> pageInfo=user_visitorsService.getAllUserVisitorsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

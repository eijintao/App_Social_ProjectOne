package com.xm.app.controller;

import com.xm.app.entity.Users;
import com.xm.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
*
 * @author Mei Jintao
 * @date 2019/9/7 11:50
 *
 * 用户登录后用来生成一个token。以后用户登录都需要用到这个token

*/

@Controller
@RequestMapping("/page/")
public class UserController {


    /** 对用户业务层进行注解*/
    @Autowired
    private UserService userService;

    /**对用户凭证表的业务层service层进行注解*/

    /**
     * 修改用户 ，直接把手机号也放入里面，减少代码的冗余。
     * @param users
     * @return
     */
    @RequestMapping("/updateUsers")
    @ResponseBody
    public String updateUsers(Users users){
        //调用业务
        int i = userService.updateByPrimaryKey(users);
        return   "{\"W\":"+i+"}";

    }

    /**
     * 查询单个用户。此接口目前估计用不上。先预备。
     * @param id
     * @return
     */
    @RequestMapping("/selectById")
    @ResponseBody
    public Users selectById(Integer id){
        Users users = userService.selectByPrimaryKey(id);
        return  users;

    }














}

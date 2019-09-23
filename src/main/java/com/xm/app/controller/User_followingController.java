package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.User_following;
import com.xm.app.service.User_followingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/16 14:48
 */
@Controller
@RequestMapping("/page/")
public class User_followingController {
   @Autowired
    private User_followingService  user_followingService;

   @RequestMapping("selectByUserFollwoingId")
   @ResponseBody
   public User_following selectByUserFollwoingId(Integer id){
       return user_followingService.selectByPrimaryKey(id);
   }


    /**
     * 查询用户所有支出记录  并对其进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getUserFollowingAll")
    @ResponseBody
    public Map<String , Object> getUserFollowingAll(Integer page, Integer rows) throws Exception{
        PageInfo<User_following> pageInfo=user_followingService.getAllUserFollowingByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

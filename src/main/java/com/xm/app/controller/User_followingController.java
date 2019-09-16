package com.xm.app.controller;

import com.xm.app.entity.User_following;
import com.xm.app.service.User_followingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


}

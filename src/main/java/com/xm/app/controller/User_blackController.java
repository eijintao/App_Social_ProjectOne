package com.xm.app.controller;

import com.xm.app.entity.User_blacklist;
import com.xm.app.service.User_blacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mei Jintao
 * @date 2019/9/16 15:36
 */
@Controller
@RequestMapping("/page/")
public class User_blackController {

      @Autowired
    private User_blacklistService user_blacklistService;

    /**
     * 查询用户黑名单表
     * @param id
     * @return
     */
      @RequestMapping("selectByBlacklistId")
      @ResponseBody
      public User_blacklist selectByBlacklistId(Integer id){
          return user_blacklistService.selectByPrimaryKey(id);
      }


    /**
     * 通过id 删除黑名单
     * @param id
     * @return
     */
    @RequestMapping("deleteByBlacklistId")
    @ResponseBody
    public int deleteByBlacklistId(Integer id){
        return user_blacklistService.deleteByPrimaryKey(id);
    }


    /**
     * 通过id增加黑名单
     * @param record
     * @return
     */
    @RequestMapping("addByBlacklistId")
    @ResponseBody
    public int insertByBlacklistId(User_blacklist record){
        return user_blacklistService.insert(record);
    }
}

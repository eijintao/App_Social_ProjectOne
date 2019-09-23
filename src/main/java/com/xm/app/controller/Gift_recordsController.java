package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Gift_records;
import com.xm.app.service.Gift_recordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/16 19:14
 */
@Controller
@RequestMapping("/page/")
public class Gift_recordsController {

    @Autowired
    private Gift_recordsService gift_recordsService;

    /**
     * 通过id 查询礼物表
     * @param id
     * @return
     */
    @RequestMapping("selectByGiftRecordId")
    @ResponseBody
    public Gift_records selectByGiftRecordId(Integer id){
        return gift_recordsService.selectByPrimaryKey(id);
    }

    /**
     * 新增礼物表
     * @param records
     * @return
     */
    @RequestMapping("addByGiftRecordId")
    @ResponseBody
    public int addByGiftRecordId(Gift_records records){
        return gift_recordsService.insert(records);
    }


    /**
     * 查询用户所有礼物记录表，并进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getGiftRecordsAll")
    @ResponseBody
    public Map<String , Object> getGiftRecordsAll(Integer page, Integer rows) throws Exception{
        PageInfo<Gift_records> pageInfo=gift_recordsService.getAllGiftRecordsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }

}

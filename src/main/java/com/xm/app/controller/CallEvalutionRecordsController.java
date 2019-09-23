package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Call_evaluation_records;
import com.xm.app.service.CallEvalutionRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/16 20:01
 */
@Controller
@RequestMapping("/page/")
public class CallEvalutionRecordsController {

    @Autowired
    private CallEvalutionRecordsService callEvalutionRecordsService;

    /**
     * 通过id 通话评价记录表
     * @param id
     * @return
     */
    @RequestMapping("selectByCallEvalutionRecordId")
    @ResponseBody
    public Call_evaluation_records  selectByCallEvalutionRecordId(Integer id){
        return callEvalutionRecordsService.selectByPrimaryKey(id);
    }


    /**
     * 查询用户通话评价记录表，并进行分页
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getCallEvalutionRecordsAll")
    @ResponseBody
    public Map<String , Object> getCallEvalutionRecordsAll(Integer page, Integer rows) throws Exception{
        PageInfo<Call_evaluation_records> pageInfo=callEvalutionRecordsService.getAllCallEvaluationRecordsByPage(page,rows);
        //组装返回的业务
        Map<String ,Object> map=new HashMap<String, Object>();
        //填充总记录数
        map.put("total",pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows",pageInfo.getList());

        return map;


    }


}

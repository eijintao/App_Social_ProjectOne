package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Call_evaluation_records;
import com.xm.app.mapper.Call_evaluation_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/16 19:58
 */
@Service
public class CallEvalutionRecordsServiceImpl implements CallEvalutionRecordsService {

    @Autowired
    private Call_evaluation_recordsMapper callEvaluationRecordsMapper;

    /**
     * 查询通话评价记录表
     * @param id
     * @return
     */
    @Override
    public Call_evaluation_records selectByPrimaryKey(Integer id) {
        return callEvaluationRecordsMapper.selectByPrimaryKey(id);
    }


    /**
     * 查询全部通话评价记录表，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    @Override
    public PageInfo<Call_evaluation_records> getAllCallEvaluationRecordsByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        //调用mapper层的查询全部的方法
        List<Call_evaluation_records> list=callEvaluationRecordsMapper.getAllCallEvaluationRecords();
        //将得到的 查询全部的数据放到 分页的依赖中去 里面去。
        PageInfo<Call_evaluation_records> pageInfo=new PageInfo<Call_evaluation_records>(list);
        //返回分页的数据
        return pageInfo;
    }
}

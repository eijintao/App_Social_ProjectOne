package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Call_evaluation_records;

/**
 * @author Mei Jintao
 * @date 2019/9/16 19:56
 */
public interface CallEvalutionRecordsService {

    /**
     * 查询通话评价记录表
     * @param id
     * @return
     */
    Call_evaluation_records selectByPrimaryKey(Integer id);


    /**
     * 查询全部通话评价记录表，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    PageInfo<Call_evaluation_records> getAllCallEvaluationRecordsByPage(Integer page, Integer rows);
}

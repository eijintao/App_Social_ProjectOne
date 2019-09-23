package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Gift_records;
import com.xm.app.mapper.Gift_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/16 19:10
 */
@Service
public class Gift_recordsServiceImpl implements Gift_recordsService {

    @Autowired
    private Gift_recordsMapper gift_recordsMapper;

    /**
     * 通过id 查询礼物表
     * @param id
     * @return
     */
    @Override
    public Gift_records selectByPrimaryKey(Integer id) {
        return gift_recordsMapper.selectByPrimaryKey(id);

    }

    /**
     * 新增礼物表
     * @param record
     * @return
     */
    @Override
    public int insert(Gift_records record) {
        return gift_recordsMapper.insert(record);
    }


    /**
     * 查询全部礼物记录，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    @Override
    public PageInfo<Gift_records> getAllGiftRecordsByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        //调用mapper层的查询全部的方法
        List<Gift_records> list=gift_recordsMapper.getAllGiftRecords();
        //将得到的 查询全部的数据放到 分页的依赖中去 里面去。
        PageInfo<Gift_records> pageInfo=new PageInfo<Gift_records>(list);
        //返回分页的数据
        return pageInfo;
    }
}

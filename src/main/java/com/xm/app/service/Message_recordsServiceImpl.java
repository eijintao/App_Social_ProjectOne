package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Message_records;
import com.xm.app.mapper.Message_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/16 11:44
 */
@Service
public class Message_recordsServiceImpl implements Message_recordsService {

    @Autowired
    private Message_recordsMapper message_recordsMapper;

    /**
     * 单条查询消息记录
     * @param id
     * @return
     */
    @Override
    public Message_records selectByPrimaryKey(Integer id) {
        return message_recordsMapper.selectByPrimaryKey(id);
    }
    /**
     * 查询全部消息记录 并进行分页
     * @param page 接收页码
     * @param rows 接收页大小
     * @return
     */
    @Override
    public PageInfo<Message_records> getAllMessageRecordsByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        //调用mapper层的查询全部的方法
        List<Message_records> list=message_recordsMapper.getAllMessageRecords();
        //将得到的 查询全部的数据放到 分页的依赖中去 里面去。
        PageInfo<Message_records> pageInfo=new PageInfo<Message_records>(list);
        //返回分页的数据
        return pageInfo;
    }
}

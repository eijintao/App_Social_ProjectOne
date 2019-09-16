package com.xm.app.service;

import com.xm.app.entity.Message_records;
import com.xm.app.mapper.Message_recordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/16 11:44
 */
@Service
public class Message_recordsServiceImpl implements Message_recordsService {

    @Autowired
    private Message_recordsMapper message_recordsMapper;


    @Override
    public Message_records selectByPrimaryKey(Integer id) {
        return message_recordsMapper.selectByPrimaryKey(id);
    }
}

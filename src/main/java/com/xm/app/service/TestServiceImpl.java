package com.xm.app.service;

import com.xm.app.entity.Test;
import com.xm.app.entity.TestExample;
import com.xm.app.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/5 10:01
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;






    public List<Test> getTestAll() {

        return testMapper.selectByExample(new TestExample());

    }

}

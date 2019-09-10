package com.xm.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/9 11:03
 * 用户刷新凭证表的业务实现层
 */
@Service
public class Refresh_tokenServiceImpl implements Refresh_tokenService {

    /**
     * 对业务接口进行注解
     */
    @Autowired
    Refresh_tokenService refresh_tokenService;


}

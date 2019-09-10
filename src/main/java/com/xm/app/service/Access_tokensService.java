package com.xm.app.service;

import com.xm.app.entity.Access_token;

/**
 * @author Mei Jintao
 * @date 2019/9/7 17:01
 */
/*用户凭证表的业务接口*/
public interface Access_tokensService {


    /**增加单条*/
     int insertSelective(Access_token record);



}

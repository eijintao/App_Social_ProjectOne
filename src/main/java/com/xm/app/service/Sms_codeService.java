package com.xm.app.service;

import com.xm.app.comment.Result;
import com.xm.app.entity.Sms_code;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/6 17:06
 * 短信验证码的业务接口
 */

public interface Sms_codeService  {
    /**
     * 新增一个 短信验证码表的一行
     * @param record
     * @return
     */
    int insertSelective(Sms_code record);


    /**
     *  主要是查询  短信验证表的id
     * @param id
     * @return
     */
    Sms_code selectByPrimaryKey(Integer id);


    /**
     * 检查用户名是否存在
     * @param smsMobile　用户名
     * @return 检查结果
     */
    Result<String> checkUserName(String smsMobile, HttpServletRequest request);

    /**
     * 用户登录
     * @param request 请求头
     * @param sms_code　用户信息
     * @return 登录结果
     */
    Result<Map<String, Object>> login(HttpServletRequest request, Sms_code sms_code);





}

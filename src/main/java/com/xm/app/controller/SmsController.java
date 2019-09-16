package com.xm.app.controller;

import com.xm.app.comment.Result;
import com.xm.app.entity.Sms_code;
import com.xm.app.service.Sms_codeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author Mei Jintao
 * @date 2019/9/6 10:52
 */
@Controller
@RequestMapping("/page/")
public class SmsController {

    @Autowired
    private Sms_codeService sms_codeService;


    @RequestMapping("getCode")
    @ResponseBody
    public String getCode(String moblie, HttpServletRequest request, HttpServletResponse response){
        //获取客户输入的手机号
        String mobile= request.getParameter("mobile");

        if (mobile==null) {
            response.setStatus(400);

            return null;
        }

        //创建验证码
        int code=(int) (Math.random()*10000);


        //获取 验证码
        String codeOne= request.getParameter("inputCode");

        Sms_code sms_code=new Sms_code();
        if (sms_code.getScope()==null){
            sms_code.setScope("login");
        }
        //设置验证码的有效期  五分钟
        if (sms_code.getExpiresAt()==null){

            sms_code.setExpiresAt(new Date(System.currentTimeMillis() + 5*60*1000));
        }
        if (sms_code.getCreatedAt()==null){
            sms_code.setCreatedAt(new Date());
        }
        if (sms_code.getUpdatedAt()==null){
            sms_code.setUpdatedAt(new Date());
        }

        sms_codeService.insertSelective(sms_code);

        response.setStatus(200);
        return null;

    }

    /**
     * 查询单个  测试用
     * @return
     */
    @RequestMapping("getCodeOne")
    @ResponseBody
    public Sms_code getCodeOne(){
       Sms_code sms_code=sms_codeService.selectByPrimaryKey(1);
       return sms_code;
    }

    /**
     * 登录
     * @param request
     * @param sms_code
     * @return
     */
    @RequestMapping(value = "login")
    public Result login(HttpServletRequest request, @RequestBody Sms_code sms_code) {
        return sms_codeService.login(request, sms_code);
    }
}

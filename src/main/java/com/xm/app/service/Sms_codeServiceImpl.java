package com.xm.app.service;

import com.xm.app.comment.ConfigConsts;
import com.xm.app.comment.ErrorCodeEnum;
import com.xm.app.comment.Result;
import com.xm.app.entity.Sms_code;
import com.xm.app.entity.Users;
import com.xm.app.mapper.Sms_codeMapper;
import com.xm.app.mapper.UsersMapper;
import com.xm.app.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/6 17:06
 * 业务验证码的实现层
 */
@Service
public class Sms_codeServiceImpl  implements Sms_codeService{

    /**
     * 业务验证码mapper层的注解
     */
    @Autowired
    private Sms_codeMapper sms_codeMapper;

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 新增一个单条的  包括 moblie手机号 和 code验证码
     * @param record
     * @return
     */
    @Override
    public int insertSelective(Sms_code record) {
      int i=  sms_codeMapper.insert(record);
          return i;
    }

    /**
     * 查询单条，返回一行。包括moblie  和  code
     * @param id
     * @return
     */
    @Override
    public Sms_code selectByPrimaryKey(Integer id) {
      Sms_code sms_code=  sms_codeMapper.selectByPrimaryKey(id);
         return sms_code;
    }

    /**检查用户名是否存在*/
    @Override
    public Result<String> checkUserName(String smsMobile,HttpServletRequest request) {

        if (smsMobile.trim().endsWith("admin")) {
            return Result.createByErrorCodeMessage(ErrorCodeEnum.PARAMETER_ERROR.getCode(), "不能添加admin用户");
        }

        String  resultCount = sms_codeMapper.checkUserName(smsMobile);
        if(resultCount.equals(request.getParameter("mobile"))) {
            return Result.createByErrorCodeMessage(ErrorCodeEnum.PARAMETER_ERROR.getCode(), "用户名已存在");
        }

        return Result.createBySuccess("校验成功！");
    }



    /**用户登录*/
    @Override
    public Result<Map<String, Object>> login(HttpServletRequest request, Sms_code sms_code,Users users) {
        //查询用户的手机号和验证码有没有。返回一个userResult。
        // Sms_code userResult = sms_codeMapper.selectByUserNameAndPassword(sms_code);
        //如果前端传过来的手机号是空值
        if (request.getParameter("mobile") == null) {
            return Result.createByErrorCodeMessage(ErrorCodeEnum.PARAMETER_ERROR.getCode(), "请输入您的手机号或验证码！");
        } else {

            Map<String, Object> data = new HashMap<String, Object>();
            //以下data是做死数据的，是写  sms_code的mobile
            // data.put("user",userResult);
            //登录成功，设置jwt        在这之前，得把mobile写入users表里。也就是说users表里除了mobile，其他都是空值。
            //这样在 用户登录后，就是进入修改得页面。

            //查询所有的手机号
             Users allUser = usersMapper.getAllUser();

             //用一个for循环来解决

            //匹配前端传过来的手机号和数据库中对应，看是否存在手机号
            if (request.getParameter("mobile").equals(allUser.getMobile())) {
                //返回  手机号存在  信息
                return Result.createByErrorCodeMessage(ErrorCodeEnum.MOBILE_SUCCESS.getCode(), "手机号已存在");
            } else {
                //如果手机号不存在，获取前端传过来的手机号
                users.setMobile(request.getParameter("mobile"));
                //写进数据库里
                 usersMapper.insert(users);

                try {
                    // configconsts 是token有效期。
                    String jwt = JwtUtil.createJWT("jwt", "", ConfigConsts.TOKEN_LIFECYCLE, users);
                    data.put("token", jwt);
                    return Result.createBySuccess(data);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return Result.createByError();
            }
        }
    }
}

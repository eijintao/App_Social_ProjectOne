package com.xm.app.Interceptor;

import com.alibaba.fastjson.JSON;
import com.xm.app.comment.ErrorCodeEnum;
import com.xm.app.comment.Result;
import com.xm.app.util.JwtUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Mei Jintao
 * @date 2019/9/10 16:05
 */
public class JWTInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) {
        // TODO Auto-generated method stub
        String jwt = request.getHeader("Authorization");
        String userId = request.getHeader("currentUserId");
        try {
            if (jwt== null) {
               // log.info("用户未登录，验证失败");
                return buildResponseResult(response, ErrorCodeEnum.ILLEGAL_OPERATION);
            } else {
                //解析token
                Claims c;
                c = JwtUtil.parseJWT(jwt);
                //验证用户名是否正确
                if(c.get("userId").toString().equals(userId)) {
                   // log.info("用户id" + c.get("userId") + "已是登录状态");
                    return true;
                } else {
                   // log.info("当前用户id和token不匹配");
                    return buildResponseResult(response, ErrorCodeEnum.TOKEN_MISMATCH_USER);
                }
            }

        } catch (ExpiredJwtException expiredJwtException) {
            //token过期
           // log.info("token已过期");
            try {
                return buildResponseResult(response, ErrorCodeEnum.TOKEN_EXPIRED);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
           // log.info("token解析错误，验证失败");
            try {
                return buildResponseResult(response, ErrorCodeEnum.TOKEN_VALID);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return false;
    }

    private boolean  buildResponseResult(HttpServletResponse response, ErrorCodeEnum errorCodeEnum) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(JSON.toJSONString(Result.createByErrorCodeEnum(errorCodeEnum)));
        out.flush();
        out.close();
        return false;
    }
}

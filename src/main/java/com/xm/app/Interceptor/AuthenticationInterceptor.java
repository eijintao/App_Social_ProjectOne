package com.xm.app.Interceptor;

import com.xm.app.service.Refresh_tokenService;
import com.xm.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mei Jintao
 * @date 2019/9/9 10:49
 */

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    UserService   userService;

    @Autowired
    Refresh_tokenService refresh_tokenService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
// TODO Auto-generated method stub
       /* JWTUtils util = new JWTUtils();
        String jwt = request.getHeader("Authorization");

        try {
            if (jwt == null) {
                System.out.println("用户未登录，验证失败");
            } else {
                Claims c;
                c = util.parseJWT(jwt);
                System.out.println("用户id" + c.get("user_id") + "已是登录状态");
                return true;
            }

            System.out.println("token解析错误，验证失败");
            response.getWriter().write("未登录，请重新登录后操作");;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        return false;


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

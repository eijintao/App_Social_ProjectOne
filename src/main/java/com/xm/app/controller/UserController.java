package com.xm.app.controller;

import com.xm.app.entity.Users;
import com.xm.app.service.Access_tokensService;
import com.xm.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
*
 * @author Mei Jintao
 * @date 2019/9/7 11:50
 *
 * 用户登录后用来生成一个token。以后用户登录都需要用到这个token

*/

@Controller
@RequestMapping("/page")
public class UserController {


    /** 对用户业务层进行注解*/
    @Autowired
    private UserService userService;

    /**对用户凭证表的业务层service层进行注解*/
    @Autowired
    private Access_tokensService access_tokensService;

   @RequestMapping("/token")
    @ResponseBody
    public String getToken(HttpServletRequest request, Users users, HttpServletResponse response){
       // token 验证  验证失败，提示权限有问题，返回失败



       final String username = request.getParameter("moblie");

       //分开检查用户名和密码是否为空
       if (username == null) {
           //如果为空直接返回
           return "用户名和密码不得为空！";
       }
      /* if (request.getParameter("moblie").equals(username)) {
           //创建jwt
           String jwtToken = Jwts.builder()
                   //该JWT面向的对象,也就是这个jwt是哪个用户的
                   .setSubject(users.getUsername())
                   //可以自定义，一般是用户的id
                   .claim("id", "18")
                   //JWT签署时间
                   .setIssuedAt(new Date())
                   //JWT使用的签名算法
                   .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
           //将jwt信息存储至cookie中
          *//* Cookie cookie = new Cookie("auth", jwtToken);*//* request.getHeaders(jwtToken);

           //将cookie返回给浏览器
          *//* response.addCookie(cookie);*//*
           //返回jwt token
           return "登录成功！token：" + jwtToken;
       } else {
           return "登录失败，用户名或密码错误！";
       }
*/

       return " ";

   }










}

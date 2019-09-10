package com.xm.app.Interceptor;

import org.springframework.context.annotation.Configuration;

/**
 * @author Mei Jintao
 * @date 2019/9/10 9:26
 */
@Configuration
public class JwtConfig {

    /**
     * 注册JWT过滤器
     * @return
     */
    /*@Bean
    public FilterRegistrationBean jwtFilter() {
        //注册过滤器的类
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //注册Jwt过滤器
        registrationBean.setFilter(new JwtFilter());
        //需要使用jwt进行校验的资源路径，可以配置多个路径
        registrationBean.addUrlPatterns("/secure/*", "/privacy/*");
        return registrationBean;
    }*/
}

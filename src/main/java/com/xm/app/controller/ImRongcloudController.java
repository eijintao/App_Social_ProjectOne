package com.xm.app.controller;

import com.alibaba.fastjson.JSON;
import com.xm.app.entity.Im_rongcloud;
import com.xm.app.service.ImRoungcloudService;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.xm.app.shaOne.ShaOnetest.sha1;

/**
 * @author Mei Jintao
 * @date 2019/9/22 16:56
 */
@Controller
@RequestMapping("/page/")
public class ImRongcloudController {
     @Autowired
    private ImRoungcloudService imRoungcloudService;

    /**
     * 获取融云产生的Token ，已成功在浏览器上显示从融云获取的token
     * @param userId
     * @return
     */
    @RequestMapping(value = "getToken")
    @ResponseBody
    public String  getToken(@RequestParam(required = true) String userId
                           // @RequestParam(required = true) String userHead,
                           // @RequestParam(required = true) String userName
                            ) {
        StringBuffer res = new StringBuffer();
        String url = "http://api-cn.ronghub.com/user/getToken.json";
        String App_Key = "kj7swf8ok36e2"; //开发者平台分配的 App Key。
        String App_Secret = "hAfyEhxyFG";//开发者平台分配的App_Secret 。
        String Timestamp = String.valueOf(System.currentTimeMillis() / 1000);//时间戳，从 1970 年 1 月 1 日 0 点 0 分 0 秒开始到现在的秒数。
        String Nonce = String.valueOf(Math.floor(Math.random() *(99999-10000)+10000));//随机数，无长度限制。

        String Signature = sha1(App_Secret + Nonce + Timestamp);//数据签名。
        //Logger.i(Signature);
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("App-Key", App_Key);
        httpPost.setHeader("Timestamp", Timestamp);
        httpPost.setHeader("Nonce", Nonce);
        httpPost.setHeader("Signature", Signature);
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
        List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>(1);
       // nameValuePair.add(new BasicNameValuePair("name", userName));//名称（例如使用这个功能的‘张三’）
        nameValuePair.add(new BasicNameValuePair("userId", userId));// 用户id（根据自己的项目，自己生成一个串就行，UUID就行）
       // nameValuePair.add(new BasicNameValuePair("portraitUri", userHead));//头像(存储头像的路径)
        HttpResponse httpResponse = null;
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair, "utf-8"));
            httpResponse = httpClient.execute(httpPost);
            BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
            String line = null;
            while ((line = br.readLine()) != null) {
                res.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("res=" + res.toString());
        Im_rongcloud im_rongcloudResponse = JSON.parseObject(res.toString(), Im_rongcloud.class);
        imRoungcloudService.insert(im_rongcloudResponse);
        //Logger.i(userRespone.getCode()+"");
        return im_rongcloudResponse.getToken();
    }


}

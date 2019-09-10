package com.xm.app.token;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.xm.app.util.test;
import net.minidev.json.JSONObject;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/3 14:12
 */
public class TokenUtils {


    /**
     * 1.创建一个32-byte的密匙
     * getBytes()得到一个操作系统默认的编码格式的字节数组。这表示在不同的操作系统下,返回的东西不一样
     */

    private static final byte[] secret = test.getRandomStringEnglish(32).getBytes();


    //生成一个token
    public static String creatTokenHS256(Map<String,Object> payloadMap) throws JOSEException {

        //3.先建立一个头部Header
        /**
         * JWSHeader参数：1.加密算法法则,2.类型，3.。。。。。。。
         * 一般只需要传入加密算法法则就可以。
         * 这里则采用HS256
         *
         * JWSAlgorithm类里面有所有的加密算法法则，直接调用。
         */
        JWSHeader jwsHeader = new JWSHeader(JWSAlgorithm.HS256);

        //建立一个载荷Payload
        Payload payload = new Payload(new JSONObject(payloadMap));

        //将头部和载荷结合在一起
        JWSObject jwsObject = new JWSObject(jwsHeader, payload);

        //建立一个密匙

         JWSSigner jwsSigner = new MACSigner(secret);

         //签名  签名的过程，实际上是对头部以及载荷内容进行签名
         jwsObject.sign(jwsSigner);


        //生成token
        return jwsObject.serialize();






    }
    //解析token
    public static Map<String,Object> validHS256(String token) throws ParseException, JOSEException {
//        解析token
        JWSObject jwsObject = JWSObject.parse(token);
        //建立一个解锁密匙
        JWSVerifier jwsVerifier = new MACVerifier(secret);
        return verify(jwsObject, jwsVerifier);
    }


    //验证token信息
    private static Map<String,Object> verify(JWSObject jwsObject, JWSVerifier jwsVerifier) throws JOSEException {
        Map<String, Object> resultMap = new HashMap<String,Object>();
        //获取到载荷
        Payload payload=jwsObject.getPayload();
        //判断token
        if (jwsObject.verify(jwsVerifier)) {
            resultMap.put("Result", 0);
            //载荷的数据解析成json对象。
            JSONObject jsonObject = payload.toJSONObject();
            resultMap.put("data", jsonObject);
            //判断token是否过期: 若payload包含ext字段，则校验是否过期
            if (jsonObject.containsKey("exp")) {

                //valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。
                Long expTime = Long.valueOf(jsonObject.get("exp").toString());
                //System.out.println("expTime的显示时间是："+expTime);

                //date.getTime()所返回的是一个 long型  的毫秒数  请注意 这个是毫秒数
                //实际上通过Date.getTime()的到的是1970年01月01日8点中以来的毫秒数，不是整点，其实也是因为是有八个小时差的时区
                Long nowTime = System.currentTimeMillis();
               // System.out.println("nowTime的显示："+nowTime);
                //判断是否过期
                if (nowTime > expTime) {
                    //已经过期
                    resultMap.clear();
                    resultMap.put("Result", 2);
                }
            }
        }else {
            resultMap.put("Result", 1);
        }
        return resultMap;
    }
}

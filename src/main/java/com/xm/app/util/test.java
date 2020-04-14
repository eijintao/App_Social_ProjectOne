package com.xm.app.util;

import java.util.Random;

/**
 * @author Mei Jintao
 * @date 2019/9/9 9:08
 */
public class test {



    public static void main(String[] args) {


        for (int i = 0; i <10 ; i++) {
            String str= getRandomString(40);
            if(str.equals(getRandomString(40))){
                System.out.println("您的两数相等。");
            }else {
                System.out.println(str);
            }
        }

        System.out.println("这个是做测试GitHub用的");

    }

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            //随机生成的随机数范围就变成[0,a)
            int number=random.nextInt(62);
            //用于返回指定索引处的字符
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomStringEnglish(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random=new Random();
        StringBuffer sbOne=new StringBuffer();
        for(int i=0;i<length;i++){
            //随机生成的随机数范围就变成[0,a)
            int number=random.nextInt(52);
            //用于返回指定索引处的字符
            sbOne.append(str.charAt(number));
        }
        return sbOne.toString();


    }
}

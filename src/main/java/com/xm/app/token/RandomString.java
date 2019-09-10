package com.xm.app.token;

import java.util.Random;

/**
 * @author Mei Jintao
 * @date 2019/9/7 16:26
 */
public class RandomString {


    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            //产生0－n的伪随机数
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

   /* public static void main(String[] args) {
       // System.out.println(getRandomString(40));
         //  RandomStringUtils是org.apache.commons.lang包下的一个类，
         //  其中有一个randomAlphanumeric(int length)函数，
         //  可以随机生成一个长度为length的字符串。
        String filename= RandomStringUtils.randomAlphanumeric(40);
        System.out.println(filename);
    }*/
}

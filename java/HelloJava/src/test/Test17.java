package test;

import java.util.Random;

/**
 * 定义方法实现随机产生一个5位的验证码
 * 验证码格式：
 * 长度为5
 * 前四位是大写字母或者小写字母
 * 最后一位是数字
 */
public class Test17 {
    public static void main(String[] args) {

    }

    public static char[] yanzhima(){
        char[] chars = new char[5];
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {

            if(i < chars.length - 1){
                chars[i] = (char) (65 + random.nextInt(52));
            } else if (i == chars.length-1) {
                chars[i] = (char) (random.nextInt(10) + 1);
            }
        }
        return chars;
    }
}

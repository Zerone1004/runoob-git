package test;

import java.util.Scanner;

/**
 * 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
 * 规则如下:
 * 先得到每位数，然后每位加上5，再对10取余，最后将所有数字反转，得到一串新的数
 */
public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mima = sc.nextInt();
        int finalResult = jiami(mima);
        System.out.println(finalResult);

    }

    public static int jiami(int mima) {
        int result = 0;
        int finalResult = 0;
        while (mima > 0){
            int ge = mima % 10;
            result = (ge + 5) % 10;
            finalResult  = finalResult * 10 + result;
            mima /= 10;
        }
        return finalResult;
    }
}

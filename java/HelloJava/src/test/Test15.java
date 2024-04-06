package test;

import java.util.Scanner;

/**
 * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
 * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，
 * 淡季（11月到来年4月）头等舱7折，经济舱6.5折.
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原件");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入舱位");
        int lv = sc.nextInt();
        double result = 0;

        if (month >= 5 && month <= 10 ) {
            if (lv == 1){
                result = price * 0.9;
            }else if (lv == 2){
                result = price * 0.85;
            }
        }else {
            if (lv == 1){
                result =price * 0.7;
            }else if (lv == 2){
                result = price * 0.65;
            }
        }
        System.out.println(result);
    }
}

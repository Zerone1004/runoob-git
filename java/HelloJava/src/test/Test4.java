package test;

import java.util.Scanner;

/**
 * 键盘录入一个大于等于2的整数x，计算并返回x的平方根。
 * 结果之保留整数部分，小数部分将被舍去。
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int gen = 1;
        while (true){
            if (gen * gen <= x){
                gen++;
            } else{
                System.out.println(gen-1);
                break;
            }
        }
    }
}

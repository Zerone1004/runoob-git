package test;

import java.util.Scanner;

/**
 * 键盘录入一个正整数x，判断该整数是否为一个质数
 * 质数：如果一个整数只能被1和本身整除，则为质数
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < x/2; i++){
            if(x % i == 0){
                flag = false;
                System.out.println("该数是合数");
                break;
            }
        }
        if (flag){
            System.out.println("该数是质数");
        }
    }
}

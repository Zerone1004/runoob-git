package test;

import java.util.Random;
import java.util.Scanner;

/**
 * 程序自动生成一个1-100之间的随机数字，
 * 使用程序实现猜出这个数字的多少？
 */
public class Test6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            int guessnumber= scanner.nextInt();
            if (guessnumber > number){
                System.out.println("大了");
            }else if (guessnumber < number){
                System.out.println("小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }



}

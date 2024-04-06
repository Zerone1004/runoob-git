package test;

import java.util.Random;

/**
 * 生成10个1-100之间的随机数存入数组
 * 1.求出所有数据的和
 * 2.求所有数据的平均数
 * 3.统计有多少数据比平均数小
 */
public class Test11 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100)+1;
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
        int ave = sum / numbers.length;
        System.out.println(ave);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > ave){
                count++;
            }
        }

        System.out.println(count);


    }
}

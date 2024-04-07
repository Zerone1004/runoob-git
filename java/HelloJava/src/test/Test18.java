package test;

import java.util.Scanner;

/**
 * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
 * 选手的最后得分为：去掉最高分、最低分的4个评委的平均分，
 * 请完成上述过程并计算选手的得分。
 */
public class Test18 {
    public static void main(String[] args) {

        int[] socre = new int[6];
        int max = 0;
        int min = 0;
        int sum = 0;
        int avg = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; ){
            System.out.println("请打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                socre[i] = score;
                i++;
            }else {
                System.out.println("出错了，请重新输入！");
            }
        }

        for (int i = 0; i < socre.length; i++){
            if (socre[i] > max){
                max = socre[i];
            }
        }

        for (int i = 0; i < socre.length; i++){
            if (socre[i] < min){
                min = socre[i];
            }
        }

        for (int i = 0; i < socre.length; i++){
            sum += socre[i];
        }

        avg = (sum - max - min) / 4;

        System.out.println(avg);
    }
}

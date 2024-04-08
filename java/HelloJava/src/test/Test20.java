package test;

import java.util.Random;

/**
 * 一个大V直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}五个奖金。请使用代码模拟抽奖，
 * 打印出每个奖项，奖项的出现顺序要随机且不充复。
 */
public class Test20 {

    public static void main(String[] args) {
        int[] nums = {2,588,888,1000,10000};
        int[] result = chouJiang(nums);
        bianLi(result);
    }

    public static int[] chouJiang(int[] nums1) {
        Random random = new Random();

        for (int i = 0; i < nums1.length; i++) {
            int x = random.nextInt(nums1.length);
            int temp = nums1[i];
            nums1[i] = nums1[x];
            nums1[x] = temp;
        }
        return nums1;
    }

    public static void bianLi(int[] nums1) {
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i] + "元的奖金被抽出");
        }
    }

}

package test;

import java.util.Random;

/**
 * 定义一个数组，存入1-5。要求打乱数组中所有数据的顺序
 */
public class Test13 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        Random rand = new Random();

        for (int i = 0; i < nums.length; i++) {
            int randNum = rand.nextInt(nums.length);
            int temp = nums[i];
            nums[i] = nums[randNum];
            nums[randNum] = temp;
        }

        for(int num : nums){
            System.out.println(num);
        }
    }
}

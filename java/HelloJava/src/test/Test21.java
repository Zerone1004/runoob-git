package test;

import java.util.Random;
import java.util.Scanner;

/**
 * 双色球
 */
public class Test21 {

    public static void main(String[] args) {
        int[] nums1 = chouJiang();
        int[] nums2 = kaiJiang();
        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < nums2.length; i++) {
            int target = nums2[i];
            for (int k : nums1) {
                if (k == target) {
                    redCount++;
                }
            }
        }
    }

    public static int[] kaiJiang() {
        int[] nums = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5;) {
            System.out.println("红球");
            int target = sc.nextInt();
            if (target >= 1 && target <= 33) {
                boolean flag = contains(nums, target);
                if (!flag) {
                    nums[i] = target;
                    i++;
                }else {
                    System.out.println("exist！");
                }
            }else {
                System.out.println("超出范围！");
            }

        }

        System.out.println("篮球");
        int target = sc.nextInt();
        while (true) {
            if (target >= 1 && target <= 16) {
                nums[6] = target;
                break;
            }else {
                System.out.println("超出范围！");
            }
        }
        return nums;

    }

    public static int[] chouJiang() {
        int[] nums = new int[7];
        Random random = new Random();

        for (int i = 0; i < 5; ) {
            int target = random.nextInt(33) + 1;
            boolean flag = contains(nums, target);
            if (!flag) {
                nums[i] = target;
                i++;
            }
        }
        nums[6] = random.nextInt(16);
        return nums;
    }

    public static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

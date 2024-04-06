package test;

/**
 * 定义一个数组，存入1,2,3,4,5.
 * 按照要求交换对应的元素
 * 交换前：12345
 * 交换后：54321
 */
public class Test12 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        for(int i = 0 ,j = nums.length-1; i < j; i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        /*for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i -1];
            nums[nums.length - i - 1] = temp;
        }*/
        for(int num : nums){
            System.out.println(num);
        }
    }
}

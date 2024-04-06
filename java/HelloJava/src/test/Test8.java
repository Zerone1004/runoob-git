package test;

/**
 * 定义一个数组，存储1，2，3....9,10
 * 遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
 */
public class Test8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int number : numbers) {
            if (number % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

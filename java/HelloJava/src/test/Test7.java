package test;

/**
 * 定义一个数组存储1，2，3，4，5
 * 遍历数组得到每一个元素，求数组里面所有的数据和
 */
public class Test7 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}

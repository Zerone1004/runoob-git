package test;

/**
 * 已知数组元素为{33，5，22，44，55}
 * 求最大值
 */
public class Test10 {
    public static void main(String[] args) {
        int[] numbers = {33,5,22,44,55};
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}

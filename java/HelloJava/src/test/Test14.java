package test;

/**
 * 定义一个方法copyOfRange(int[] arr,int from,int to)
 * 将数组arr中从索引from（包含from）开始。
 * 到索引to结束(不包含to)的元素复制到新数组中，
 * 将新数组返回
 */
public class Test14 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};

        int[] arr = copyOfRange(nums,3,7);

        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static int[] copyOfRange(int[] arr,int from,int to) {
        int[] result = new int[to-from];
        for (int i = from; i < to; i++) {
            result[i-from] = arr[i];
        }
        return result;
    }
}

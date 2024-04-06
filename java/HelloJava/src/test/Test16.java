package test;

/**
 * 判断101-200之间有多少质数，并输出所有素数
 */
public class Test16 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 101; i <= 200; i++){
            if (zhishu(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean zhishu(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

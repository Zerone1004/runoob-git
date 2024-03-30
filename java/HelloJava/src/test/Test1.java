package test;

/**
 * 给你一个回文数
 * 如果x是一个回文整数，打印true，否则，返回false
 */
public class Test1 {
    public static void main(String[] args) {
        int x = 12021;
        int temp = x;
        int y = 0;
        while (temp != 0){
            int ge = temp % 10;
            y = y * 10 + ge;
            temp = temp / 10;
        }
        System.out.println(x == y);

    }
}

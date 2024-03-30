package test;

/**
 * 给定两个整数，被除数和除数（都是正数，且不超过int的范围），
 * 将两数想除，要求不使用乘法、除法、和%运算符。
 * 得到商和余数
 */
public class Test2 {
    public static void main(String[] args) {
        int x =123;
        int y = 3;
        int shang =0;
        while (x >= y){
            x -= y;
            shang++;
        }
        System.out.println("商和余数分别为"+ shang + "和" + x);
    }
}

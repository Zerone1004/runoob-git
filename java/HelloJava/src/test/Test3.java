package test;

/**
 * 朋友聚会的时候可能会玩一个游戏：逢七过
 * 游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数
 *         式都要说过
 * 需求：使用程序在控制台打印出1-100之间的满足逢七必过的规则
 */
public class Test3 {
    public static void main(String[] args) {
        int x = 100;
        while (x > 0){
            if (x % 7 == 0 || x / 10 == 7 || x % 10 ==7)  {
                System.out.println(x);
                x--;
                continue;
            }
            x--;
        }
    }
}

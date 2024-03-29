package 循环结构;

public class ForPlusTest {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers){
            System.err.println(x);
        }

        String [] names = {"James", "Tom", "Larry", "Lacy"};
        for(String name : names){
            System.out.println(name);
        }
    }
    
}

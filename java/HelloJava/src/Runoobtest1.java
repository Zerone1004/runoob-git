public class Runoobtest1 {
    public static void main(String[] args) {
        int a = 10,b =20;
        swap(a, b);
        System.out.println("a = "+ a + "," +"b = " + b);
    }

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

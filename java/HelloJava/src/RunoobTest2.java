public class RunoobTest2 {
    private int a; // 私有成员变量a
    public String b = "Hello"; // 公有成员变量b
   
    public static void main(String[] args) {
       RunoobTest2 obj = new RunoobTest2(); // 创建对象
       
        obj.a = 10; // 访问成员变量a，并设置其值为10
        System.out.println("a = " + obj.a);
       
        obj.b = "World"; // 访问成员变量b，并设置其值为"World"
        System.out.println("b = " + obj.b);
    }
}
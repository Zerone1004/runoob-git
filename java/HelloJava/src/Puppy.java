public class Puppy {

    int puppyAge;

    public Puppy(String name){
        //这个构造器仅有一个参数：name
        System.out.println("the dog's name is: " + name );
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("the dog's age is " + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        //下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy("tom");
        /*通过方法来设定age */
        myPuppy.setAge(2);
        /*调用另一个方法获取age */
        myPuppy.getAge();
        /*访问成员变量 */
        System.err.println("变量值：" + myPuppy.puppyAge);
    }
}

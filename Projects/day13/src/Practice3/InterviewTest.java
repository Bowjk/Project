package Practice3;

public class InterviewTest {
    public static void main(String[] args) {
        Base1 base = new Sub1();
        base.add(1,2,3);

        Sub1 s = (Sub1)base;
        s.add(1,2,3);
    }
}
class Base1{
    public void add(int a,int ...arr){
        System.out.println("base1");
    }
}
class Sub1 extends Base1{
    public void add(int a,int[] arr){
        System.out.println("Sub1");
    }
    public void add(int a,int b,int c){
        System.out.println("Sub2");
    }
}
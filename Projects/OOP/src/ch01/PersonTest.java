package ch01;
//1.创建类、设计类的成员
//2.创建类的对象
//3.通过“对象.属性”或“对象.方法”调用对象的结构
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象(即实例化)
        Person p1 = new Person();//类似于 Scanner scan = new Scanner(System.in);
        //调用对象的结构、属性、方法
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        //调用方法：“对象、方法”
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        //******************************************************//
        Person p2 = new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false
        //如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性，
        //意味着如果我们修改了一个对象的属性a，不影响另外一个对象属性a的值
    }
}
class Person{
    //属性
    String name;
    int age;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人会说话：" + language);
    }
}

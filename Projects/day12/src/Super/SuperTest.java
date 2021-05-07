package Super;
/*
super关键字的使用
1.super可以理解为：父类的....
2.super可以用来调用属性、方法、构造器
3.super的使用:
    3.1我们可以在子类的方法或构造器中，通过使用“super.属性”或“super.方法”的方式，显式的调用
    父类中声明的属性或方法。但是通常情况下我们习惯省略“super”。
    3.2特殊情况，当子类和父类中定义了同名的属性，我们想要在子类中调用父类中声明的属性，则必须
    显式的使用“super.属性”的方式，表明调用的是父类中声明的属性。
    3.3特殊情况，当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则
    必须显式的使用“super.方法”的方式，表明调用的是父类中被重写的方法。
4.super调用构造器：
    4.1我们可以在子类的构造器中显式的使用“super(形参列表)”的方式，调用父类中声明的指定的构造器。
    4.2“super(形参列表)”的使用必须声明在子类构造器的首行。
    4.3在类的构造器中，针对于“this(形参列表)”或“super(形参列表)”只能二选一，不能同时出现。
    4.4在构造器的首行，若没有显式的声明“this(形参列表)”或“super(形参列表)”，则默认调用的是父类中空参的构造器：super()
    4.5在类的多个构造器中，至少有一个类的构造器中使用了“super(形参列表)”，调用父亲

 */

public class SuperTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();

        System.out.println();
        s.study();

        Student s1 = new Student("Tom",21,"IT");
        s1.show();

        System.out.println("*********************");
        Student s2 = new Student();
    }
}

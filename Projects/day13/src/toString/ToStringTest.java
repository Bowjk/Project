package toString;

import java.util.Date;
import java.util.Objects;

/*
Object类中toString()的使用
1.当我们输出一个对象的引用时，实际上就是调用对象的同toString()
2.Object类中toString()的定义:
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
3.像String、Date、File、包装类等都重写了Object类中的同toString()方法
使得在调用对象的toString()时，返回“实体内容”信息
4.自定义类也可以重写toString()，调用此方法时，返回对象的“实体内容”
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString());//toString.Customer@4554617c
        System.out.println(cust1);//toString.Customer@4554617c

        String str = new String("MM");
        System.out.println(str);

        Date date = new Date(453443453453L);
        System.out.println(date.toString());//Tue May 15 12:30:53 CST 1984
    }
}
class Customer{
    private String name;
    private int age;

    public Customer(){

    }
    public Customer(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name);
    }
//手动实现
//    @Override
//    public String toString() {
//        return "Customer[name = " + name + ",age = " + age + "]";
//    }
//自动实现
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

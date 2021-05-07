package Equals;
/*
面试题：==和equals()区别
一、==：运算符
1. 可以使用在基本数据类型变量和引用数据变量中
2. 如果比较的是基本数据类型变量，比较两个变量保存的数据类型是否相等（不一定类型相同）
   如果比较的是引用数据类型变量，比较两个对象的地址值是否相同,即两个引用是否指向同一个对象实体

二、equals()
1. 是一个方法而非运算符
2. 只能适用于引用数据类型
3. Object类中equals()的定义：
    public boolean equals(Object obj) {
        return (this == obj);
    }
    说明：Object类中定义的equals()和==的作用相同
4. 像String、Date、File、包装类等都重写了Object类中的equals()方法，重写以后，
比较的不是两个引用的地址是否相同，而是比较两个对象的“实体内容”是否相同
5. 通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的“实体内容”是否相同，
   那么我们就需要对Object类中定义的equals()进行重写
   重写的原则：比较两个对象的“实体内容”是否相同
 */

import java.util.Date;
import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {

        //基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        char c = 10;
        System.out.println(i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true

        //引用数据类型
        Customer cust1 = new Customer("Tom",21);
        Customer cust2 = new Customer("Tom",21);
        System.out.println(cust1 == cust2);//false
        String str1 = new String("123");
        String str2 = new String("123");
        System.out.println(str1 == str2);//false
        System.out.println("***********************************");

        System.out.println(cust1.equals(cust2));//false--->true
        System.out.println(str1.equals(str2));//true
        Date date1 = new Date(32432525324L);
        Date date2 = new Date(32432525324L);
        System.out.println(date1.equals(date2));//true
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
    //重写的原则：比较两个对象的“实体内容”（即：name和age）是否相同

    //手动实现equals()的实现
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("Customer equals()...");
//        if (this == obj) {
//            return true;
//        }
//        if(obj instanceof Customer){
//            Customer cust = (Customer)obj;
//            //比较两个对象的每个属性是否相同
////            if(this.age == cust.age && this.name.equals(cust.name)){
////                return true;
////            }else{
////                return false;
////            }
//            return this.age == cust.age && this.name.equals(cust.name);
//        }
//        return false;
//    }


    //自动生成的
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name);
    }


}

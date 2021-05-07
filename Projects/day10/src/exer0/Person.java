package exer0;
/*
练习一：
1.创建程序，在其中定义两个类，Person和PersonTest类，定义如下：
用setAge()设置人的合法年龄（0-130），用getAge()返回人的年龄。

练习二：
1.在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性都为18
2.修改上题中类和构造器，增加name属性，使每次创建Person对象的同时初始化对象的age属性值和name的属性值
 */
public class Person {
    private int age;
    private String  name;

    public Person(){
        age = 18;
    }

    public Person(String n,int a){
        name = n;
        age = a;
    }

    public void setAge(int a){
        if(a < 0 || a > 130){
            System.out.println("传入的数据非法！");
            return;
        }
        age = a;
    }
    public int getAge(){
        return age;
    }
    //绝对不能这么写！
    /*public  int doAge(int a){
        age = a;
        return age;
    }
    */

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

}

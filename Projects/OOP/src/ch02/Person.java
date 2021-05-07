package ch02;

public class Person {
    String name;
    int age;
    int sex;
    /**
     * sex:1 表明是男性
     * sex:0 表明是女性
     */
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age:" + age);
    }
    public int addAge(int i ){
        age += i;
        return i;
    }


}

package ch01;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        //1.一维数组的声明和初始化
        //1.1 静态初始化：数组的初始化和数组元素的赋值同时进行；
        int ids[];
        ids = new int[]{1, 2, 3, 4, 5, 6};
        //1.1 静态初始化：数组的初始化和数组元素的赋值分开进行；
        String[] names = new String[5];
        //其他
        int[]arr4 = {1,2,3,4};//类型推断
        //2.如何调用数组的指定位置的元素：通过角标的方式调用
        names[0] = "张三";
        names[1] = "张er";
        names[2] = "张si";
        names[3] = "张wu";
        names[4] = "张liu";
        //3.如何获取数组的长度
        //属性：length
        System.out.println(names.length);
        System.out.println(ids.length);
        //4.如何遍历数组
        for(int i = 0;i < names.length;i++){
            System.out.println(names[i]);
        }
        //5.数组元素的默认初始化值
        /*
        数组元素是整型：0
        数组元素是浮点型型：0.0
        数组元素是char型：0 ≠ '0'
        数组元素是boolean型：false
        数组元素是引用数据类型:null(空值)
        */
        //6.数组的内存解析





    }
}

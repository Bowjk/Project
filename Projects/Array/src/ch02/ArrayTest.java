package ch02;
//数组工具类的使用
import java.util.Arrays;
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};

        boolean equals = Arrays.equals(arr1,arr2);//判断两个数组是否相等
        System.out.println(equals);

        System.out.println(Arrays.toString(arr1));//输出数组信息

        Arrays.fill(arr1,10);//将指定值填充到数组之中
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);//对数组进行排序
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = new int[]{43,32,76,-98,0,64,33,-21,32,99};
        //对排序后的数组进行二分法检索指定的值
        int index = Arrays.binarySearch(arr3,99);
        System.out.println(index);
    }
}

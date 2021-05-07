package ch01;

public class Array2 {
    public static void main(String[] args) {
        //1.一维数组的声明和初始化
        int arr[][] = new int[][]{{1,2,3},{4,5},{6,7,8}};
        String arr1[][] = new String[3][2];
        //2.如何调用数组的指定位置的元素：通过角标的方式调用
        System.out.println(arr[0][1]);
        //3.如何获取数组的长度
        System.out.println(arr.length);
        //4.如何遍历数组
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //5.数组元素的默认初始化值
        /*
        规定：二维数组分为外层数组的元素和内层数组的元素
        针对int[][] arr = new int [4][3]
            外层元素的初始化值为地址值
            内层元素的初始化值与一维相同
        针对int[][] arr = new int[4][]
            外层元素的初始化值为null
            内层元素的初始化值无法调用（报错）
        */
        //6.数组的内存解析
    }

}

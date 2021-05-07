package goodle;

public class Practice1 {
    public static void main(String[] args) {
        //99乘法表
        for(int i = 1;i < 10;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print(i+"*"+j+"="+(i*j));
                System.out.print(" ");
            }
            System.out.println();
        }
        //100以内所有的质数（素数）
        //方法一：
        System.out.println("100以内所有的质数:");
        int count1 = 0;
        long start1 = System.currentTimeMillis();//获取当前时间距离1970.01.01 00：00：00的时间
        int number1 = 100000;
        for(int i = 2;i <=number1;i++) {
            boolean flag = true;
            for(int j = 2;j <= Math.sqrt(i);j++) {  //优化二：开方对本身是质数的自然数是有效的
                if(i % j == 0) {
                    flag = false;
                    break;//优化一：只对本身非质数的自然数是有效的
                }
            }

            if(flag == true){
                count1++;
                System.out.print(i);
                System.out.print(" ");
            }
            //if(i == number1/3)System.out.println();
            //if(i == 2*(number1/3))System.out.println();

         }
        System.out.println();
        System.out.println("质数的个数为：" + count1);
        long end1 = System.currentTimeMillis();
        System.out.println("花费的时间："+(end1 - start1)+"毫秒");
        //方法二：
        System.out.println("100以内所有的质数:");
        int count2 = 0;
        long start2 = System.currentTimeMillis();
        int number = 100000;
        label:for(int i = 2;i <=number;i++) {
            for(int j = 2;j <= Math.sqrt(i);j++) {
                if(i % j == 0) {
                    continue label;
                }
            }
            count2++;
            System.out.print(i);
            System.out.print(" ");
            if(i == number/3)System.out.println();
            if(i == 2*(number/3))System.out.println();

        }
        System.out.println();
        System.out.println("质数的个数为：" + count2);
        long end2 = System.currentTimeMillis();
        System.out.println("花费的时间："+(end2 - start2)+"毫秒");
    }
}

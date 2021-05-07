package com.company;
import java.util.Scanner;
public class Main2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String m = scan.next();
        if(m.equals("是"))System.out.println("1");
        int number = 0;
        switch(number)
        {
            case 0 :System.out.println(1);break;
            case 1 :System.out.println(1);
            case 2 :System.out.println(1);
            case 3 :System.out.println(1);
        }
        int n = scan.nextInt();
        for(int i=1;i<10;i++)
        {
            System.out.print(n);
            n++;
        }
        System.out.println();
        int o = 10;
        while(o<15)
        {
            o++;
            System.out.println(o);
        }
        do {
            o--;
        }while(o<10);
        System.out.println("o的结果"+o);
    }
}

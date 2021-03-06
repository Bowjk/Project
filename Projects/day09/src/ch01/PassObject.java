package ch01;
/*
考察参数的值传递
定义一个类PassObject，在类的定义中定义一个方法printAreas()
该方法如下：public void printAreas(Circle c,int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。

在main方法中调用printAreas()方法，调用完毕后输出当前半径值
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);
        System.out.println("now radius is " + c.radius);
    }
    public void printAreas(Circle c,int time){
        System.out.println("Radius\t\tArea");
        //设置圆的半径
        for(int i = 0;i <=time;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        c.radius = time + 1;
    }

}

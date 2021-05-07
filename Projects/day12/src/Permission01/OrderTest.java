package Permission01;

import Permission.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类（非子类）要是使用Order类，不可以调用声明为private、缺省、protected权限的属性和方法
//        order.orderDefault = 2;
//        order.orderProtected = 3;
//        order.orderPrivate = 4;
//
//        order.methodPrivate();
//        order.methodProtected();
//        order.methodDefault();
    }



}

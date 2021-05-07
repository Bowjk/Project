package ch02;

import ch01.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        //order.orderDefault = 1;
        order.orderPublic = 2;
        //order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的、缺省的结构就不能调用了
    }
}

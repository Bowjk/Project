package ch01;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderDefault = 1;
        order.orderPublic = 2;
        //order.orderPrivate = 3;
        order.methodDefault();
        order.methodPublic();
        //order.methodPrivate();
        //出了Order类之后，私有的结构就不能调用了
    }
}

package polymorphism;

public class Women extends Person {
    boolean isBeauty;

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    public void eat(){
        System.out.println("女人多吃肉，为了减肥");
    }

    public void walk(){
        System.out.println("女人窈窕地走路");
    }

}

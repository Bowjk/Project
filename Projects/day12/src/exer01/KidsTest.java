package exer01;

public class KidsTest {
    public static void main(String[] args) {
        Kids somekid = new Kids(12);
        somekid.printAge();

        somekid.setSalary(0);
        somekid.setSex(1);

        somekid.employed();
        somekid.manOrWoman();


    }
}

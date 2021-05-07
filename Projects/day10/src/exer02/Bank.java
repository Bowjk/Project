package exer02;

public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomer;//记录客户的个数

    public Bank(){
        customers = new Customer[10];
    }
    //添加客户
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
//        customers[numberOfCustomer] = cust;
//        numberOfCustomer++;
        customers[numberOfCustomer++] = cust;
    }
    //获取客户的个数
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }
    //获取位置指定位置上的客户
    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomer){
            return customers[index];
        }
        return null;
    }
}

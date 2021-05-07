package Practice1;

public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(int id,double balance,double annualInterestRate){
        super();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //获得月利率
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }
    //取钱
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }
    //存钱
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}

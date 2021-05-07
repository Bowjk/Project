package goodle;
public class Practise2 {
    public static void main(String[] args) {
        boolean flag = true;
        String details = "收支\t 账户金额\t 收支金额\t 说  明\n";
        int balance = 10000;
        while(flag){
            System.out.println("------------家庭收支记账软件------------\n");
            System.out.println("              1.收支明细");
            System.out.println("              2.登记收入");
            System.out.println("              3.登记支出");
            System.out.println("              4.退   出\n");
            System.out.println("             请选择（1-4：） ");
            //获取用户的选择：1-4
            char selection = Utility.readMenuSelection();

            switch(selection){
                case '1':
                    //System.out.println("1.收支明细");
                    System.out.println("------------当前收支明细记录------------");
                    System.out.println(details);
                    System.out.println("---------------------------------------");

                    break;
                case '2':
                    //System.out.println("2.登记收入");
                    System.out.println("本次收入金额");
                    int addMoney = Utility.readNumber();
                    System.out.println("本次收入说明");
                    String addInfo = Utility.readString();
                    balance += addMoney;//处理balance
                    details +=("收入\t  "+balance+"\t\t   "+addMoney+"\t\t\t"+addInfo+"\n");//处理details
                    System.out.println("---------------登记完成---------------");

                    break;
                case '3':
                    //System.out.println("3.登记支出");
                    System.out.println("本次支出金额");
                    int minusMoney = Utility.readNumber();
                    System.out.println("本次支出说明");
                    String minusInfo1 = Utility.readString();
                    //处理balance
                    if(balance >= minusMoney){
                        balance -= minusMoney;
                        details +=("支出\t  "+balance+"\t\t   "+minusMoney+"\t\t\t"+minusInfo1+"\n");//处理details
                    }else{
                        System.out.println("支出超出账户额度，支付失败");
                    }
                    System.out.println("---------------登记完成---------------");
                    break;
                case '4':
                    //System.out.println("4.退   出");
                    System.out.println("确认是否退出？（Y/N）:");
                    char Exit = Utility.readConfirmSelection();
                    if(Exit == 'Y'){
                        flag = false;
                    }
            }
        }
    }
}


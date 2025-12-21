package HW6.task1;

public class CreditCard {
    private String accountNumber;
    private double currentBalance;

    public CreditCard(String accountNumber, double currentBalance) {
        this.accountNumber=accountNumber;
        this.currentBalance=currentBalance;
    }

    public void AddMoney(double sum){
        currentBalance+=sum;
    }

    public double getMoney(double sum){
        if(sum>currentBalance){
            System.out.println("Недостаточно средств");
            return 0;
        }
        currentBalance-=sum;
        return sum;
    }

    public void InfoAboutBalance(){
        System.out.println("Номер счета: "+accountNumber);
        System.out.println("Текущий баланс: "+currentBalance);
    }

}

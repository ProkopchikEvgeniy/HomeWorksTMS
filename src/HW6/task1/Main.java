package HW6.task1;

public class Main {
    public static void main(String args[]){
        CreditCard creditCard1 = new CreditCard("A001",100);
        CreditCard creditCard2 = new CreditCard("A002",150);
        CreditCard creditCard3 = new CreditCard("A003",200);

        creditCard1.AddMoney(100);
        creditCard2.AddMoney(200);
        creditCard3.getMoney(70);

        creditCard1.InfoAboutBalance();
        creditCard2.InfoAboutBalance();
        creditCard3.InfoAboutBalance();
    }
}

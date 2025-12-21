package HW6.task2;

public class Main {
    public static void main(String args[]){
        ATM atm = new ATM(0,5,0);
        atm.getMoney(150);
        atm.getMoney(180);
        atm.getMoney(180);
        atm.getMoney(100);
    }
}

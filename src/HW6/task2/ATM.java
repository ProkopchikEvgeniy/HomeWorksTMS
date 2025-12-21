package HW6.task2;

import java.util.Scanner;

public class ATM {
    int banknote_20;
    int banknote_50;
    int banknote_100;

    public ATM(int banknote_20,int banknote_50, int banknote_100){
        this.banknote_20=banknote_20;
        this.banknote_50=banknote_50;
        this.banknote_100=banknote_100;
    }

    public void AddBanknotes(){
        System.out.println("Введите количество купюр для каждого номинала 20 50 и 100 соответственно");
        Scanner in = new Scanner(System.in);
        System.out.println("20:");
        int number = in.nextInt();
        banknote_20+=number;
        System.out.println("50:");
        number = in.nextInt();
        banknote_50+=number;
        System.out.println("100:");
        number = in.nextInt();
        banknote_100+=number;
    }

    //200 210 220 230 240 250 260 270 280 290(1-50;12-20) 300
    //290 (1-50;12-20)
    //300 (15-20)
    public boolean getMoney(int sum){
        if(sum%10!=0){
            System.out.println("Не корректная сумма ввода!");
            return false;
        }
        int banknote100=0;
        int banknote50=0;
        int banknote20=0;
        if(sum%20==0){
            banknote20= sum/20;
        }
        else{
            if(this.banknote_50==0){
                System.out.println("Недостаточно купюр для выдачи данной суммы! ");
                return false;
            }
            banknote50++;
            this.banknote_50--;
            banknote20=(sum-50)/20;
        }

        while (banknote20 >= 5 && this.banknote_100>0) {
            banknote100++;
            this.banknote_100-=1;
            banknote20 -= 5;
        }

        while (banknote20>=5 && this.banknote_50>=2){
            banknote50+=2;
            this.banknote_50-=2;
            banknote20-=5;
        }

        if(this.banknote_20<banknote20){
            System.out.println("Недостаточно купюр для выдачи данной суммы.");
            this.banknote_50+=banknote50;
            this.banknote_100+=banknote100;
            return false;
        }
        else{
            this.banknote_20-=banknote20;
            System.out.println("Количество 100: "+ banknote100);
            System.out.println("Количество 50: "+ banknote50);
            System.out.println("Количество 20: "+ banknote20);
            return true;
        }
    }
}

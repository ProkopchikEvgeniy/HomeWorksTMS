package HW2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int sum=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n<=0){
            System.out.println("Ошибка введите положительное число ");
            n = in.nextInt();
        }
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Сумма = "+ sum);
    }
}

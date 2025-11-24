package HW1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q,w;
        System.out.println("Введите q ");
        q=in.nextInt();
        System.out.println("Введите w ");
        w=in.nextInt();
        System.out.println("Результат: "+ q/w);
        System.out.println("Остаток: "+ q%w);
    }
}

package HW1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        int n;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите трехзначное число n = ");
        n=in.nextInt();
        int firstNumber = n%10;
        int secondNumber = ((n-firstNumber)/10)%10;
        int thirdNumber =(n-n%100)/100;
        int result = firstNumber+secondNumber+thirdNumber;
        System.out.println("result = " + result );

    }
}

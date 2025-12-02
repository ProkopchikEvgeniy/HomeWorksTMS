package HW1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        int n;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите двузначное число n = ");
        n=in.nextInt();
        int result = n%10+(n-n%10)/10;
        System.out.println("result = " + result);
    }
}

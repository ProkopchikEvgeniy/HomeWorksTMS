package HW2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number%2==0){
            System.out.println("Четное");
        }
        else {
            System.out.println("Нечетное");
        }
    }
}

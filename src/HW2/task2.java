package HW2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temperature = in.nextInt();
        if(temperature>-5){
            System.out.println("Warm");
        }
        else if (temperature>-20){
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }
    }
}

package HW3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]= (int)(Math.random()*10);
        }
        for(int var:array){
            System.out.print(var+" ");
        }
        System.out.println();
        for(int i = size-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}

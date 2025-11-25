package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]= (int)(Math.random()*10);
        }
        int max = array[0];
        int min = array[0];
        System.out.println(Arrays.toString(array));
        for(int i =1;i<size;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}

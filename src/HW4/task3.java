package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]= (int)(Math.random()*10);
        }
        int max = array[0];
        int maxIndex=0;
        int minIndex=0;
        int min = array[0];
        System.out.println(Arrays.toString(array));
        for(int i =1;i<size;i++){
            if(array[i]>max){
                max=array[i];
                maxIndex=i;
            }
            if(array[i]<min){
                min=array[i];
                minIndex=i;
            }
        }
        System.out.println("MaxIndex = "+maxIndex);
        System.out.println("MinIndex = "+minIndex);
    }
}

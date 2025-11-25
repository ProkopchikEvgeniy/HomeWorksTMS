package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]= (int)(Math.random()*10);
        }
        int var=0;
        System.out.println(Arrays.toString(array));
        for(int i=0;i<(size)/2;i++){
            var=array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=var;
        }
        System.out.println(Arrays.toString(array));
    }
}

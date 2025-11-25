package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]= (int)(Math.random()*10);
        }
        int count = 0;
        System.out.println(Arrays.toString(array));
        for(int var:array){
            if(var==0){
                count++;
            }
        }
        if(count!=0){
            System.out.println("Количество нулевых элементов = "+count);
        }
        else {
            System.out.println("Нету нулевых элементов");
        }
    }
}

package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Введите "+i+" элемент массива:");
            array[i]= in.nextInt();
        }
        int number=0;
        System.out.println(Arrays.toString(array));
        for(int i=0;i<size;i++){
            number+=(int)(array[i]*Math.pow(10,size-1-i));
        }
        number++;

        int[] result;
        if(number/Math.pow(10,size-1)==10) {
            size++;
            result = new int[size];
        }
        else{
            result=array;
        }
        for(int i=size-1;i>=0;i--){
            result[i]=number%10;
            number-=number%10;
            number/=10;
        }
        System.out.println("result = "+Arrays.toString(result));
    }
}

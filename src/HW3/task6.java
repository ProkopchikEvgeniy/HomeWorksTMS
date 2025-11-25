package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]= (int)(Math.random()*10);
        }
        boolean check =false;
        System.out.println(Arrays.toString(array));
        for(int i=1;i<size;i++){
          if(array[i]>array[i-1]){
              check=true;
          }
          else{
              check=false;
              break;
          }
        }
        if(check){
            System.out.println("Является");
        }
        else {
            System.out.println("Не является");
        }

    }
}

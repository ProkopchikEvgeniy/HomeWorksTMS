package HW5;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int sum=0;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        number = in.nextInt();
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i =0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]+=number;
                sum+=matrix[i][j];
            }
        }
        for(int i =0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Сумма: "+ sum);
    }
}

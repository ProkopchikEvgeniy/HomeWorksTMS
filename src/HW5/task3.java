package HW5;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int n,m,count=0;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        int[][] matrix = new int[n][m];
        //0 1 2 3 4 5
        //11 10 9 8 7 6
        count-=(m+1);
        for(int i=0;i<matrix.length;i++){
            if (i % 2 == 0) {
                count+=(m+1);
            }
            else{
                count+=(m-1);
            }
            for(int j=0;j<matrix[i].length;j++){
                if(i%2==0){
                    matrix[i][j]=count;
                    count++;
                }
                else{
                    matrix[i][j]=count;
                    count--;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

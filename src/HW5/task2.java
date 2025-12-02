package HW5;


import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String[][]  matrix = new String[8][8];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if((i+j)%2==0){
                    matrix[i][j]="W";
                }
                else{
                    matrix[i][j] = "B";
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
